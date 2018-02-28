package tiger.com.lp.dailydemo.designpatterns.bridge;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class IBMComputer extends AbsComputer{
    public IBMComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("IBM电脑性能： " + super.cpuAbility.abilityCpu());
    }
}
