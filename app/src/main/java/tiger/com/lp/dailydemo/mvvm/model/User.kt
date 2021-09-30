package tiger.com.lp.dailydemo.mvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/22
 * @Description :
 */
@Entity(tableName = "user")
class User {
    @PrimaryKey
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    var id: Int = 0

    @ColumnInfo(name = "name", typeAffinity = ColumnInfo.TEXT)
    var name: String = ""

    @ColumnInfo(name = "avatar", typeAffinity = ColumnInfo.TEXT)
    @SerializedName("avatar_url")
    var avatar: String = ""

    @ColumnInfo(name = "followers", typeAffinity = ColumnInfo.INTEGER)
    var followers: Int = 0

    @ColumnInfo(name = "blog", typeAffinity = ColumnInfo.TEXT)
    var blog: String = ""

    @ColumnInfo(name = "company", typeAffinity = ColumnInfo.TEXT)
    var company: String = ""

    @ColumnInfo(name = "bio", typeAffinity = ColumnInfo.TEXT)
    var bio: String = ""

    @ColumnInfo(name = "location", typeAffinity = ColumnInfo.TEXT)
    var location: String = ""

    @ColumnInfo(name = "htmlUrl", typeAffinity = ColumnInfo.TEXT)
    var htmlUrl: String = ""

    override fun toString(): String {
        return "User(id=$id, name='$name', avatar='$avatar', followers=$followers, blog='$blog', company='$company', bio='$bio', location='$location', htmlUrl='$htmlUrl')"
    }
}