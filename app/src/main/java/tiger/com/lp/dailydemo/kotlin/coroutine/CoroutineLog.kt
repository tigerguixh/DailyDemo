package tiger.com.lp.dailydemo.kotlin.coroutine

import kotlinx.coroutines.*
import kotlin.random.Random

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/28
 * @Description :
 */
class CoroutineLog {
}

fun main(array: Array<String>) {
    //printLog()
    //motionDownload()
    deferred()
}

fun deferred() = runBlocking {
    val deferred = async {
        logX("Coroutine start!")
        delay(1000L)
        logX("Coroutine end!")
        "Coroutine result!"
    }
    val result = deferred.await()
    println("Result = $result")
    logX("Process end!")
}

fun motionDownload() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        logX("Coroutine start!")
        download()
        logX("Coroutine end!")
    }
    delay(500L)
    job.log()
    job.start()
    job.log()
    job.invokeOnCompletion {
        job.log()
    }
    job.join()
    logX("Progress end!")
}

suspend fun download() {
    // 模拟下载
    val time = (Random.nextDouble() * 1000).toLong()
    logX("Delay time: = $time")
    delay(time)
}

fun printLog() = runBlocking {
    val job = launch {
        delay(1000L)
    }
    job.log()
    job.cancel()
    job.log()
    delay(1500L)
}

fun Job.log() {
    logX(""" isActive = $isActive isCancelled = $isCancelled isCompleted = $isCompleted """.trimIndent())
}

fun logX(any: Any?) {
    println("""$any
Thread:${Thread.currentThread().name}
""".trimIndent())
}