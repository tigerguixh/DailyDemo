package tiger.com.lp.dailydemo.designpatterns.chain;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public interface Ratify {

    public Result handle(Chain chain);

    interface Chain {
        Request request();

        Result process(Request request);
    }
}
