package tiger.com.lp.dailydemo.designpatterns.obverver1;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/5 0005
 * @description
 */

public class ObserverDemo {
    public static void main(String[] args) {
        WatchObserver watchObserver = new WatchObserver();

        User user = new User("Tiger");
        User user1 = new User("虎爷");

        watchObserver.registerObserver(user);
        watchObserver.registerObserver(user1);

        watchObserver.setInfoMessage("java是世界上最好的语言。");

        watchObserver.removeObserver(user1);

        watchObserver.setInfoMessage("php是世界上最好的语言。");
    }
}
