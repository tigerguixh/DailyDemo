package tiger.com.lp.dailydemo.demos;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/23
 * @Description :
 */
public class DateDemo {

    static class Stu{
        int age = 1;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "age: " + age;
        }
    }

    public static void main(String[] args) throws ParseException {

        List<Stu> stuList = new ArrayList<>();
        Stu stu = new Stu();
        stuList.add(stu);
        stuList.add(stu);
        stuList.add(stu);

        Stu ss = stuList.get(0);
        ss.setAge(22);

        System.out.println(stuList);



        int flags = 0;
        System.out.println("--->" + flags);
        flags |= 1 << 0;

        System.out.println("--->" + flags);

        System.out.println("--->" + (flags & ~(1 << 0)));

        String myString = "2018/09/08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
        Date d = sdf.parse(myString);
        boolean flag = d.before(new Date());
        if(flag)
            System.out.print("早于今天");
        else
            System.out.print("晚于今天");

        System.out.println(System.currentTimeMillis() + "  " + isSameDay(1528819199415l, 1528819199515l));

        System.out.println(getCurrentDateTime());

        DecimalFormat mDecimalFormal = new DecimalFormat("#.##");
        //加上直接全部进位，默认四舍五入
        //mDecimalFormal.setRoundingMode(RoundingMode.UP);

        System.out.println(mDecimalFormal.format(3.161));

    }

    public static String getCurrentDateTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
        String current_time = sdf.format(date);
        return current_time;
    }

    public static boolean isSameDay(long date1, long date2) {
        return isSameDay(new Date(date1), new Date(date2));
    }

    public static boolean isSameDay(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameDay(cal1, cal2);
    }
    public static boolean isSameDay(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
    }
}
