package tiger.com.lp.dailydemo.annotation.db

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@Target(
    AnnotationTarget.CLASS
)
@Retention(
    RetentionPolicy.RUNTIME
)
annotation class TDTable(val name: String = "")