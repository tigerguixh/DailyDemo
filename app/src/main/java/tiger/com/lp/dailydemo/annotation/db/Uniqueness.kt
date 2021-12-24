package tiger.com.lp.dailydemo.annotation.db

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
annotation class Uniqueness(val con: Constraints = Constraints(unique = true))
