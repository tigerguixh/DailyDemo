package tiger.com.lp.dailydemo.viewmodel

import androidx.lifecycle.ViewModel
import tiger.com.lp.dailydemo.impl.OnTimeChangeListener
import java.util.*

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/7/19
 * @Description :
 */
class TimeViewModel: ViewModel() {
    var timer: Timer? = null
    var currentSecond: Int = 0
    var timeChanger: OnTimeChangeListener? = null

    override fun onCleared() {
        super.onCleared()

        timer?.cancel()
    }

    fun setTimeChangeListener(timeChangeListener: OnTimeChangeListener) {
        this.timeChanger = timeChangeListener
    }

    fun startTiming() {
        if (timer == null) {
            timer = Timer()

            val timerTask: TimerTask = object : TimerTask() {
                override fun run() {
                    currentSecond++
                    if (timeChanger != null) {
                        timeChanger?.onTimeChanged(currentSecond)
                    }
                }
            }

            timer?.schedule(timerTask, 1000, 1000)
        }
    }
}