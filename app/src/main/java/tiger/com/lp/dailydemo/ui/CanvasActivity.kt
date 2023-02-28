package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import tiger.com.lp.dailydemo.databinding.ActivityCanvasBinding
import tiger.com.lp.dailydemo.databinding.ActivityMotionBinding

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/18
 * @Description :
 */
class CanvasActivity : AppCompatActivity() {
    var binding: ActivityCanvasBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCanvasBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)
    }
}