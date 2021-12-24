package tiger.com.lp.dailydemo.annotation.db

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/12/24
 * @Description :
 */
@TDTable(name = "MEMBER")
class Member {
    @SQLString(30)
    var firstName: String? = null
    @SQLString(50)
    val lastName: String? = null
    @SQLInteger
    val age: Int? = 0
    @SQLString(value = 30, constraint = Constraints(primaryKey = true))
    val handle: String? = null
}