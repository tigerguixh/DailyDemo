package tiger.com.lp.dailydemo.kotlin.smart

import java.lang.IllegalArgumentException

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/7/2
 * @Description :
 */
class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
}

fun main(args: Array<String>) {
    saveUser(User(1, "tiger", "北京"))
}