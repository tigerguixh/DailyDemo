package tiger.com.lp.dailydemo.designpatterns.proxy;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/11 0011
 * @description
 */

public class UserDaoProxy implements IUserDao{
    private UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(int age) {
        if (age > 0) {
            userDao.save(age);
        } else {
            System.out.println("你的年龄输入的不对了。");
        }
    }
}
