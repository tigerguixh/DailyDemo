package tiger.com.lp.dailydemo.dao;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import tiger.com.lp.dailydemo.dao.impl.StudentDao;
import tiger.com.lp.dailydemo.dao.model.Student;
import tiger.com.lp.dailydemo.dao.model.Teacher;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2021/8/5
 * @Description :
 */
@Database(entities = {Student.class}, version = 2)
public abstract class MyDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "my_db";

    private static MyDatabase myDatabase;


    public static MyDatabase getInstance(Context context) {
        if (myDatabase == null) {
            myDatabase = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, DATABASE_NAME)
                    .addCallback(new Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);

                        }

                        @Override
                        public void onOpen(@NonNull SupportSQLiteDatabase db) {
                            super.onOpen(db);
                        }
                    })
                    .allowMainThreadQueries() //允许主线程操作
                    .addMigrations(migration) //保留原有数据
                    .build();
        }
        return myDatabase;
    }

    static final Migration migration = new Migration(1,2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE student ADD COLUMN type INTEGER NOT NULL DEFAULT 1");
        }
    };

    public abstract StudentDao studentDao();
}
