package tiger.com.lp.dailydemo.demos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/31
 * @Description :
 */
public class ListDemo {

    static class Demo {
        String name;

        public Demo(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Demo{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Demo> list = new ArrayList<>();
        list.add(new Demo("2"));
        list.add(new Demo("21"));
        list.add(new Demo("22"));
        list.add(new Demo("23"));
        list.add(new Demo("24"));

        list = list.subList(0, 3);

        for (int i = 0; i < list.size(); i++) {
            Demo ss = list.get(i);
            if(ss.name.equals("22")) {
                list.remove(ss);
            }
        }

        System.out.println(list);
    }
}
