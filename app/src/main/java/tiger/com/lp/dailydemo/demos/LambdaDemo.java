package tiger.com.lp.dailydemo.demos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/8/1
 * @Description :
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> collected = new ArrayList<>();
        collected.add("alpha");
        collected.add("beta");
        //collected.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
    }
}
