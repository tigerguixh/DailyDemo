package com.example.ioc_compiler;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;

/**
 *
 *      类的工具类
 */

public class ClassValidator {

    /**
     * 判断是否是private修饰
     * */
    static boolean isPrivate(Element annotatedClass){
        return annotatedClass.getModifiers().contains(Modifier.PRIVATE);

    }

    /**
     * 获取类的完整路径
     * */
    static String getClassName(TypeElement type, String packageName){
        int packageLen = packageName.length() + 1;
        return type.getQualifiedName().toString().substring(packageLen).replace(".", "$");
    }

}
