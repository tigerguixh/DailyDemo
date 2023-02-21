package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import tiger.com.lp.dailydemo.R

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/6/10
 * @Description :
 */
class ConstraintLayoutActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // https://www.jianshu.com/p/41bd5170cde3
        setContentView(R.layout.activity_constraint)
    }
}