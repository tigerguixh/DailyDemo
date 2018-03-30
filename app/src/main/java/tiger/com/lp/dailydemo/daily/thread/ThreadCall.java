package tiger.com.lp.dailydemo.daily.thread;

import java.util.concurrent.Callable;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/27 0027
 * @description
 */

public class ThreadCall implements Callable<String>{
    @Override
    public String call() throws Exception {
        return "Just a test.";
    }
}
