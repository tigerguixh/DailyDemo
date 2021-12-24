package tiger.com.lp.dailydemo.annotation

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(
    RetentionPolicy.RUNTIME
)
annotation class Test (val id: Int, val description: String = "no description")