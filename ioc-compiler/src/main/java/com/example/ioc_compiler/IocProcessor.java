package com.example.ioc_compiler;

import com.example.ico_annotation.BindView;
import com.example.ico_annotation.ContentView;
import com.google.auto.service.AutoService;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;

/**
 *
 *      自定义编译、处理器
 */

@AutoService(Processor.class)
public class IocProcessor extends AbstractProcessor {

    /**
     * 日志打印类
     * */
    private Messager messager;
    /**
     * 元素工具类
     * */
    private Elements elementsUtils;

    /**
     * 保存所有的要生成的注解文件信息
     * */
    private Map<String, ProxyInfo> mProxyMap = new HashMap<>();

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);

        messager = processingEnv.getMessager();
        elementsUtils = processingEnv.getElementUtils();

        // 在这里打印gradle文件传进来的参数
        Map<String, String> map = processingEnv.getOptions();
        for (String key : map.keySet()) {
            messager.printMessage(Diagnostic.Kind.NOTE, "key" + "：" + map.get(key));
        }
    }

    /**
     * 此方法用来设置支持的注解类型，没有设置的无效（获取不到）
     * */
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        HashSet<String> supportTypes = new LinkedHashSet<>();
        // 把支持的类型添加进去
        supportTypes.add(BindView.class.getCanonicalName());
        supportTypes.add(ContentView.class.getCanonicalName());
        return supportTypes;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        messager.printMessage(Diagnostic.Kind.NOTE, "process...");

        /**
         * 防止处理多次，要清空
         * */
        mProxyMap.clear();

        // 获取全部的带有BindView注解的Element
        Set<? extends Element> elesWidthBind = roundEnv.getElementsAnnotatedWith(BindView.class);
        // 对BindView进行循环，构建ProxyInfo信息
        for (Element element : elesWidthBind) {
            // 检查element的合法性
            checkSAnnotationValid(element, BindView.class);

            // 强转成属性元素
            VariableElement variableElement = (VariableElement) element;
            // 我们知道属性元素的外层一定是类元素
            TypeElement typeElement = (TypeElement) variableElement.getEnclosingElement();
            // 获取类元素的类名
            String fqClassName = typeElement.getQualifiedName().toString();
            // 以class名称为key，保存到mProxyMap中
            ProxyInfo proxyInfo = mProxyMap.get(fqClassName);
            if (proxyInfo == null) {
                proxyInfo = new ProxyInfo(elementsUtils, typeElement);
                mProxyMap.put(fqClassName, proxyInfo);
            }
            // 获取BindView注解，把信息放入proxyInfo中
            BindView bindAnnotation = element.getAnnotation(BindView.class);
            int id = bindAnnotation.value();
            proxyInfo.injectVariables.put(id, variableElement);
        }

        // 获取所有的ContentView注解，操作原理和上面的BindView一样
        Set<? extends Element> contentAnnotations = roundEnv.getElementsAnnotatedWith(ContentView.class);
        for (Element element : contentAnnotations) {
            TypeElement typeElement = (TypeElement) element;
            String fqClassName = typeElement.getQualifiedName().toString();
            ProxyInfo proxyInfo = mProxyMap.get(fqClassName);
            if (proxyInfo == null) {
                proxyInfo = new ProxyInfo(elementsUtils, typeElement);
                mProxyMap.put(fqClassName, proxyInfo);
            }
            ContentView contentViewAnnotation = element.getAnnotation(ContentView.class);
            proxyInfo.contentViewId =contentViewAnnotation.value();

        }

        // 循环生成源文件
        for (String key : mProxyMap.keySet()) {
            ProxyInfo proxyInfo = mProxyMap.get(key);
            try {
                JavaFileObject jfo = processingEnv.getFiler().createSourceFile(proxyInfo.getProxyClassFullName(), proxyInfo.getTypeElement());
                Writer writer = jfo.openWriter();
                writer.write(proxyInfo.generateJavaCode());
                writer.flush();
                writer.close();
            } catch (IOException e) {
                error(proxyInfo.getTypeElement(), "Unable to write injector for type %s: %s ", proxyInfo.getTypeElement(), e.getMessage());
            }
        }

        return true;
    }

    /**
     * 检查BindView修饰的元素的合法性
     * */
    private boolean checkSAnnotationValid(Element element, Class<?> clazz) {
        if (element.getKind() != ElementKind.FIELD) {
            error(element, "%s must be delared on field.", clazz.getSimpleName());
            return false;
        }
        if (ClassValidator.isPrivate(element)) {
            error(element, "%s() must can not be private.", element.getSimpleName());
            return false;
        }
        return true;
    }

    /**
     * 打印错误日志方法
     * */
    private void error(Element element, String message, Object... args) {
        if (args.length > 0) {
            message = String.format(message, args);
        }
        messager.printMessage(Diagnostic.Kind.NOTE, message, element);
    }
}
