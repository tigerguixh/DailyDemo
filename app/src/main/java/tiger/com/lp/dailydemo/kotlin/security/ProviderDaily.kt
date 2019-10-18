package tiger.com.lp.dailydemo.kotlin.security

import java.security.Security

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/10/14
 * @Description :
 */
fun main(array: Array<String>) {
    val providers = Security.getProviders()
    for (provider in providers) {
        println(provider.toString())
    }
}