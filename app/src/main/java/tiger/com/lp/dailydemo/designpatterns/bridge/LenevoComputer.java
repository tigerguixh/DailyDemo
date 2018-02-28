package tiger.com.lp.dailydemo.designpatterns.bridge;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class LenevoComputer extends AbsComputer{

    public LenevoComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("联想笔记本的性能： " + super.cpuAbility.abilityCpu());
    }
}
