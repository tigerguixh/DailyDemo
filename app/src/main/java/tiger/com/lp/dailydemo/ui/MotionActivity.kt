package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import tiger.com.lp.dailydemo.databinding.ActivityMotionBinding

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/18
 * @Description :
 */
class MotionActivity : AppCompatActivity() {
    var binding: ActivityMotionBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotionBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)
    }
}