package tiger.com.lp.dailydemo.kotlin.smart

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/7/5
 * @Description :
 */
class ClassKotlinDaily(username: String) {
    var username: String set

    init {
        this.username = username
    }
}

interface Account {
    val name: String
}

class PrivateAccount(override val name: String) : Account

class PublicAccount(val email: String) : Account {
    override val name: String
        get() = email.substringBefore('@')
}

class FackbookAccount(val accountId: Int): Account {
    override val name = getAccountName()

    fun getAccountName(): String {
        return "Tiger"
    }
}