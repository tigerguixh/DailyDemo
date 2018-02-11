package tiger.com.lp.dailydemo.designpatterns.facade;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class Computer implements Operation{
    private Cpu cpu;
    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
    }

    @Override
    public void start() {
        cpu.start();
        disk.start();
    }

    @Override
    public void shutDown() {
        cpu.shutDown();
        disk.shutDown();
    }
}
