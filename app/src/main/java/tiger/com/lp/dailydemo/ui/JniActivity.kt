package tiger.com.lp.dailydemo.ui

import android.app.Activity
import android.os.Bundle
import tiger.com.lp.dailydemo.utils.JniUtils
import tiger.com.lp.dailydemo.utils.LogUtils

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/10
 * @Description :
 */
class JniActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //LogUtils.e("Jni: ", JniUtils.getJniString())
    }
}