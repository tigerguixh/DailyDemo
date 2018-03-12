package tiger.com.lp.dailydemo.designpatterns.chain;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public class DepartmentLeader implements Ratify{
    @Override
    public Result handle(Chain chain) {
        Request request = chain.request();
        System.out.println("DepartmentHeader=====>request:"
                + request.toString());

        if (request.getDays() > 7) {
            return new Result(false, "你这个完全没必要");
        }
        return new Result(true, "DepartmentHeader：不要着急，把事情处理完再回来！");
    }
}
