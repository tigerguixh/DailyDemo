package tiger.com.lp.dailydemo.dao.impl

import androidx.lifecycle.LiveData
import androidx.room.*
import tiger.com.lp.dailydemo.dao.model.Student

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/7/20
 * @Description :
 */
@Dao
interface StudentDao {
    @Insert
    fun insertStudent(student: Student)

    @Delete
    fun deleteStudent(student: Student)

    @Update
    fun updateStudent(student: Student)

    @Query("SELECT * FROM student")
    fun getStudentList(): MutableList<Student>

    @Query("SELECT * FROM student WHERE id = :id")
    fun getStudentById(id: Int): Student

    @Query("SELECT * FROM student ORDER BY ID DESC")
    fun getAllUserLive(): LiveData<List<Student?>?>?
}