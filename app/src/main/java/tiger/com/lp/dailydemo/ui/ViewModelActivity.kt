package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import tiger.com.lp.dailydemo.R
import tiger.com.lp.dailydemo.impl.OnTimeChangeListener
import tiger.com.lp.dailydemo.viewmodel.TimeViewModel
import tiger.com.lp.dailydemo.viewmodel.TimeWithLiveDataViewModel

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/7/19
 * @Description :
 */
class ViewModelActivity: AppCompatActivity() {
    var onTimeChangeListener: OnTimeChangeListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_view_model)
        //initComponent()
        initComponentLiveData()
    }

    fun initComponent() {
        var textView = findViewById<TextView>(R.id.view_model)
        //var timeViewModel = ViewModelProvider.AndroidViewModelFactory(application).create(TimeViewModel::class.java)

        var timeViewModel = ViewModelProvider(this).get(TimeViewModel::class.java)

        timeViewModel.setTimeChangeListener(object : OnTimeChangeListener {
            override fun onTimeChanged(second: Int) {
                runOnUiThread {
                    textView.text = "Time: $second"
                }
            }
        })

        timeViewModel.startTiming()
    }

    fun initComponentLiveData() {
        var textView = findViewById<TextView>(R.id.view_model)
        var timeLiveData = ViewModelProvider(this).get(TimeWithLiveDataViewModel::class.java)
        val liveData = timeLiveData.getCurrentSecond()
        liveData?.observe(this, Observer<Integer?> {
            second: Integer? -> textView.text = "Time: $second"
        })

        timeLiveData.startTiming()
    }
}