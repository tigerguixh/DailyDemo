package tiger.com.lp.dailydemo.kotlin.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/28
 * @Description :
 */
class CoroutineTime {
}

fun main(array: Array<String>) {
    consumeTime()
    consumeCurrentTime()
}

fun consumeTime() = runBlocking {
    val results = mutableListOf<String>()
    val time = measureTimeMillis {
        results.add(getResult1())
        results.add(getResult2())
        results.add(getResult3())
    }
    println("Time: $time")
    println(results)
}

fun consumeCurrentTime() = runBlocking {
    val results: List<String>
    val time = measureTimeMillis {
        val result1 = async { getResult1() }
        val result2 = async { getResult2() }
        val result3 = async { getResult3() }

        results = listOf(result1.await(), result2.await(), result3.await())
    }

    println("Time: $time")
    println(results)
}

suspend fun getResult1(): String {
    delay(1000L)
    return "Result1"
}

suspend fun getResult2(): String {
    delay(1000L)
    return "Result2"
}

suspend fun getResult3(): String {
    delay(1000L)
    return "Result3"
}