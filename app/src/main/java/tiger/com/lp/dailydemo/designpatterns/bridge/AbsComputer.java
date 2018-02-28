package tiger.com.lp.dailydemo.designpatterns.bridge;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public abstract class AbsComputer {
    public CpuAbility cpuAbility;

    public AbsComputer(CpuAbility cpuAbility) {
        this.cpuAbility = cpuAbility;
    }

    public abstract void checkPcAbility();
}
