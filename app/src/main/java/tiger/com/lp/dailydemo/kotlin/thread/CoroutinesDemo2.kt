package tiger.com.lp.dailydemo.kotlin.thread

import kotlinx.coroutines.*
import tiger.com.lp.dailydemo.kotlin.thread.runBlocking

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/11
 * @Description :
 */
class CoroutinesDemo2 {
}

fun main() {
    //funLaunchPatch()
    asyncLaunch()
}

fun funLaunchPatch() {
    GlobalScope.launch(Dispatchers.IO) {
        println("Coroutine started:${Thread.currentThread().name}")
        delay(1000L)
        println("Hello World!")
    }

    println("After launch:${Thread.currentThread().name}")
    Thread.sleep(2000L)
}


fun asyncLaunch() = runBlocking {
    println("In runBlocking:${Thread.currentThread().name}")

    val deferred: Deferred<String> = async {
        println("In async:${Thread.currentThread().name}")
        //delay(1000L) // 模拟耗时操作
        return@async "Task completed!"
    }

    println("After async:${Thread.currentThread().name}")

    val result = deferred.await()
    println("Result is: $result")
}
/*
输出结果：
In runBlocking:main @coroutine#1
After async:main @coroutine#1 // 注意，它比“In async”先输出
In async:main @coroutine#2
Result is: Task completed!
*/