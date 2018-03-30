package tiger.com.lp.dailydemo.daily.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/27 0027
 * @description
 */

public class ThreadCallBack {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Callable<String> callable=new ThreadCall();
        Future future=executorService.submit(callable);
        try {
            System.out.println(future.get());
            System.out.println("--------->");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
