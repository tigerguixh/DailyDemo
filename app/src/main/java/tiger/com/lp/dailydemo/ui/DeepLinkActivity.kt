package tiger.com.lp.dailydemo.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import tiger.com.lp.dailydemo.R

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/11/8
 * @Description :
 */
class DeepLinkActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_deeplink)

        var openApp: Button = findViewById(R.id.open_app)

        openApp.setOnClickListener { v -> try {
            val intent = Intent.parseUri("tadu-zhuishu://tadu.com", 0)
            //val intent = Intent.parseUri("openapp.jdmobile://virtual", 0)
            if (intent.resolveActivity(getPackageManager()) != null) {
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }
        } catch (e: Exception) {
        } }
    }
}