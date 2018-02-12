package tiger.com.lp.dailydemo.designpatterns.proxy;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class UserDaoProxyDemo {
    public static void main(String[] args) { 
        UserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save(26);
    }
}
