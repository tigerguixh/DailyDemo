package tiger.com.lp.dailydemo.kotlin.coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/28
 * @Description :
 */
class CoroutineConcurrent {
}
fun main(array: Array<String>) {
    jobConcurrent()
}

fun jobConcurrent() = runBlocking {
    val parentJob: Job
    var job1: Job? = null
    var job2: Job? = null
    var job3: Job? = null

    parentJob = launch {
        job1 = launch {
            delay(1000L)
        }

        job2 = launch {
            delay(1000L)
        }

        job3 = launch {
            delay(1000L)
        }
    }

    delay(500L)

    parentJob.children.forEachIndexed { index, job ->
        when(index) {
            0 -> println("job1 === job is ${job1 === job}")
            1 -> println("job2 === job is ${job2 === job}")
            2 -> println("job3 === job is ${job3 === job}")
        }
    }

    parentJob.join()
    logX("Process end!")
}