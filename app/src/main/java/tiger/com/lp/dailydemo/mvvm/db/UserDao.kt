package tiger.com.lp.dailydemo.mvvm.db

import androidx.lifecycle.LiveData
import androidx.room.*
import tiger.com.lp.dailydemo.mvvm.model.User

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/9/30
 * @Description :
 */
@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Query("select * from user where name = :name")
    fun getUserByName(name: String) : LiveData<User>
}