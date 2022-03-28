package tiger.com.lp.dailydemo.kotlin.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/28
 * @Description :
 */
class CoroutineContext {
}

fun main(array: Array<String>) {
    dispatcherContext()
}

fun dispatcherContext() = runBlocking {
    getUserInfo()
}

suspend fun getUserInfo(): String {
    logX("Before IO Context.")
    withContext(Dispatchers.IO) {
        logX("In IO Context.")
        delay(1000L)
    }
    logX("After IO Context.")
    return "BodyCoder"
}