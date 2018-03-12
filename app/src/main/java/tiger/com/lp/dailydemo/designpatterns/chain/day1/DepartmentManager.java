package tiger.com.lp.dailydemo.designpatterns.chain.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/12 0012
 * @description
 */

public class DepartmentManager extends Leader{
    private static final String NAME = "部门经理";
    private static final int LEVEL = 2;

    @Override
    void handle(File file) {
        result(file, LEVEL, NAME);
    }
}
