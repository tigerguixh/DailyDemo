package tiger.com.lp.dailydemo.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import tiger.com.lp.dailydemo.R
import tiger.com.lp.dailydemo.dao.MyDatabase
import tiger.com.lp.dailydemo.dao.model.Student
import tiger.com.lp.dailydemo.viewmodel.StudentViewModel

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/7/20
 * @Description :
 */
class RoomDaoActivity : AppCompatActivity(), View.OnClickListener {
    var myDatabase: MyDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        // 测试rebase

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_room_dao)

        findViewById<TextView>(R.id.insert).setOnClickListener(this)
        findViewById<TextView>(R.id.update).setOnClickListener(this)
        findViewById<TextView>(R.id.query).setOnClickListener(this)
        findViewById<TextView>(R.id.delete).setOnClickListener(this)

        myDatabase = MyDatabase.getInstance(this)


        val studentViewModel = StudentViewModel(application)

        val listLiveData: LiveData<List<Student?>?>? = studentViewModel.listLiveData

        listLiveData?.observe(this, Observer<List<Student?>?> {
            students: List<Student?>? -> Log.i("room", "student size: " + students?.size)
        })
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.insert -> {
                myDatabase?.studentDao()?.insertStudent(Student("tiger", "30"))
            }

            R.id.update -> {
                myDatabase?.studentDao()?.updateStudent(Student(0, "tiger", "36"))
            }

            R.id.query -> {
                var student: Student? = myDatabase?.studentDao()?.getStudentById(0)
                Log.i("room", "student: " + student?.age)
            }

            R.id.delete -> {
                myDatabase?.studentDao()?.deleteStudent(Student(0, "tiger", "36"))
            }
        }
    }
}