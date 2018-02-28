package tiger.com.lp.dailydemo.designpatterns.template;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public abstract class AbsPerson {
    public void preapreGoSchool() {
        dressUp();
    }

    public abstract void dressUp();
}
