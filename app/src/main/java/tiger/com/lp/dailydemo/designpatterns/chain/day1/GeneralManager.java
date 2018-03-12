package tiger.com.lp.dailydemo.designpatterns.chain.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/12 0012
 * @description
 */

public class GeneralManager extends Leader{
    private static final String name = "总经理";
    private static final int LEVEL = 0;

    @Override
    void handle(File file) {
        result(file, LEVEL, name);
    }
}
