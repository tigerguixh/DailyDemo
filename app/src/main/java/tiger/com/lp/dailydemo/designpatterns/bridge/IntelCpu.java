package tiger.com.lp.dailydemo.designpatterns.bridge;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class IntelCpu implements CpuAbility{
    @Override
    public String abilityCpu() {
        return "性能挺牛";
    }
}
