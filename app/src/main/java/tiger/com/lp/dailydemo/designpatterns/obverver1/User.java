package tiger.com.lp.dailydemo.designpatterns.obverver1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/5 0005
 * @description
 */

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        printInfo(message);
    }

    private void printInfo(String message) {
        System.out.println(name + "收到推送消息:" + message);
    }
}
