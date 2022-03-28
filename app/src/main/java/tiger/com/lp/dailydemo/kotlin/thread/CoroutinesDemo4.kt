package tiger.com.lp.dailydemo.kotlin.thread

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/14
 * @Description :
 */
class CoroutinesDemo4 {
}

fun main() {
    kotlinx.coroutines.runBlocking {
        val user = getUserInfo()
        val friendList = getFriendList(user)
        val feedList = getFeedList(friendList)
    }
}

suspend fun getUserInfo(): String {
    withContext(Dispatchers.IO) {
        delay(100L)
    }
    return "BoyCoder"
}

suspend fun getFriendList(user: String): String {
    withContext(Dispatchers.IO) {
        delay(100L)
    }
    return "Tom, Jack"
}

suspend fun getFeedList(list: String): String {
    withContext(Dispatchers.IO) {
        delay(100L)
    }
    return "{FeedList..}"
}