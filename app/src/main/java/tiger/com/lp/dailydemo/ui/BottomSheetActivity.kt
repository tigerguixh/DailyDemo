package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import tiger.com.lp.dailydemo.R
import tiger.com.lp.dailydemo.databinding.ActivityBottomSheetBinding
import tiger.com.lp.dailydemo.utils.LogUtils

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/18
 * @Description :
 */
class BottomSheetActivity : AppCompatActivity() {
    var binding: ActivityBottomSheetBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBottomSheetBinding.inflate(LayoutInflater.from(this))
        setContentView(binding!!.root)

        binding!!.bottomSheet.setOnClickListener {
            val sheetDialog = BottomSheetDialog(this)
            sheetDialog.setContentView(R.layout.activity_constraint)
            sheetDialog.show()
        }
    }
}