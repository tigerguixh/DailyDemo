package tiger.com.lp.dailydemo.designpatterns.chain.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/12 0012
 * @description
 */

public abstract class Leader {
    private Leader leader;

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    abstract void handle(File file);

    void result(File file, int level, String name) {
        if(level > file.getLevel()) {
            System.out.println(name + "未处理了文件《" + file.getFileName() + "》");
            getLeader().handle(file);
        } else {
            System.out.println(name + "处理了文件《" + file.getFileName() + "》");
        }
    }
}
