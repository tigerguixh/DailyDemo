package tiger.com.lp.dailydemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tiger.com.lp.dailydemo.impl.OnTimeChangeListener
import java.util.*

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/7/19
 * @Description :
 */
class TimeWithLiveDataViewModel : ViewModel() {
    var second: MutableLiveData<Integer>? = null

    fun getCurrentSecond(): LiveData<Integer>? {
        if (second == null) {
            second = MutableLiveData()
        }
        return second
    }


    var timer: Timer? = null

    override fun onCleared() {
        super.onCleared()

        timer?.cancel()
    }

    fun startTiming() {
        if (timer == null) {
            timer = Timer()
            var seconds : Int = 0
            val timerTask: TimerTask = object : TimerTask() {
                override fun run() {
                    seconds++
                    second!!.postValue(Integer(seconds))
                }
            }

            timer?.schedule(timerTask, 1000, 1000)
        }
    }
}