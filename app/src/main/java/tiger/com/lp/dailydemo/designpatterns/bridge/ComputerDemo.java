package tiger.com.lp.dailydemo.designpatterns.bridge;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/28 0028
 * @description
 */

public class ComputerDemo {
    public static void main(String[] args) {
        CpuAbility cpuAbility = new IntelCpu();

        IBMComputer computer = new IBMComputer(cpuAbility);
        computer.checkPcAbility();

        computer.cpuAbility = new AdmCpu();
        computer.checkPcAbility();
        LenevoComputer computer1 = new LenevoComputer(cpuAbility);
        computer1.checkPcAbility();
    }
}
