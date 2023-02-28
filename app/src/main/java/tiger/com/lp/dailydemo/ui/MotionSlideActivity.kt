package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel
import androidx.core.content.ContextCompat
import tiger.com.lp.dailydemo.R
import tiger.com.lp.dailydemo.databinding.ActivityMotionSlideBinding

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/18
 * @Description :
 */
class MotionSlideActivity : AppCompatActivity() {
    var binding: ActivityMotionSlideBinding? = null

    var colors = intArrayOf(
        R.color.colorAccent,
        R.color.colorPrimary,
        R.color.blue_light
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotionSlideBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)

        val ss = this

        binding!!.carousel.setAdapter(object : Carousel.Adapter {
            override fun count(): Int {
                return 3
            }

            override fun populate(view: View, index: Int) {
                view.setBackgroundColor(ContextCompat.getColor(ss, colors[index]))
            }
            override fun onNewItem(index: Int) {
            }
        })


    }
}