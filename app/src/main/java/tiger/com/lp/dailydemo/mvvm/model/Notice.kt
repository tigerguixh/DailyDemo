package tiger.com.lp.dailydemo.mvvm.model

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/8/24
 * @Description :
 */
class Notice {
    val code = 0
    val message = ""
    val data = Data()
}

class Data {
    val total = 0
    val per_page = 0
    val current_page = 0
    val last_page = 0
    val data = mutableListOf<NoticeList>()
}

class NoticeList {
    val id = 0
    val title = ""
    val content = ""
    val created_at = ""
    val updated_al = ""
    val deleted_at = 0
    val image = ""
    val small_content = ""
}