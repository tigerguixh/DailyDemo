package tiger.com.lp.dailydemo.designpatterns.chain.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/12 0012
 * @description
 */

public class DeputyGeneralManager extends Leader{
    private static final String NAME = "副总经理";
    private static final int LEVEL = 1;

    @Override
    void handle(File file) {
        result(file, LEVEL, NAME);
    }
}
