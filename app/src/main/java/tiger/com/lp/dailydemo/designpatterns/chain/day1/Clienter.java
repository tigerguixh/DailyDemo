package tiger.com.lp.dailydemo.designpatterns.chain.day1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/12 0012
 * @description
 */

public class Clienter {
    public static void main(String[] args) {
        //定义责任链
        Leader generalManager = new GeneralManager();
        Leader deputyGeneralManager = new DeputyGeneralManager();
        Leader departmentManager = new DepartmentManager();

        departmentManager.setLeader(deputyGeneralManager);
        deputyGeneralManager.setLeader(generalManager);

        File file = new File();

        file.setFileName("比特币");
        file.setLevel(0);

        File file1 = new File();

        file1.setFileName("亦来云");
        file1.setLevel(1);

        File file2 = new File();
        file2.setFileName("比原链");
        file2.setLevel(2);

        departmentManager.handle(file);
        departmentManager.handle(file1);
        departmentManager.handle(file2);
    }
}
