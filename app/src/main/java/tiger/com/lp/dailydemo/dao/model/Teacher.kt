package tiger.com.lp.dailydemo.dao.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/7/20
 * @Description :
 */
@Entity(tableName = "teacher")
class Teacher {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", typeAffinity = ColumnInfo.INTEGER)
    var id: Int? = 0

    @ColumnInfo(name = "name", typeAffinity = ColumnInfo.TEXT)
    var name: String? = null

    @ColumnInfo(name = "age", typeAffinity = ColumnInfo.TEXT)
    var age: String? = null

    constructor(id: Int, name: String, age: String) {
        this.id = id
        this. name = name
        this.age = age
    }

    @Ignore
    constructor(name: String, age: String) {
        this.name = name
        this.age = age
    }
}