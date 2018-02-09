package tiger.com.lp.dailydemo.designpatterns.composite;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public class DirectoryDemo {
    public static void main(String[] args) {
        Directory root = new TreeDirectory("目录");

        Directory first = new TreeDirectory("第一节");
        Directory one = new LeavesDirectory();
        one.setName("第一课");
        Directory two = new LeavesDirectory();
        two.setName("第二课");
        first.addDirectory(one);
        first.addDirectory(two);

        Directory twice = new TreeDirectory("第二节");
        twice.addDirectory(one);
        twice.addDirectory(two);

        root.addDirectory(first);
        root.addDirectory(twice);
        root.display(0);
    }
}
