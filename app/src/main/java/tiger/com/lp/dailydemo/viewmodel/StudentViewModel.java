package tiger.com.lp.dailydemo.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import tiger.com.lp.dailydemo.dao.MyDatabase;
import tiger.com.lp.dailydemo.dao.model.Student;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/6
 * @Description :
 */
public class StudentViewModel extends AndroidViewModel {
    private MyDatabase myDatabase;
    private LiveData<List<Student>> listLiveData;

    public StudentViewModel(Application application) {
        super(application);

        myDatabase = MyDatabase.getInstance(application);
        listLiveData = myDatabase.studentDao().getAllUserLive();
    }

    public LiveData<List<Student>> getListLiveData() {
        return listLiveData;
    }
}
