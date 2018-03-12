package tiger.com.lp.dailydemo.designpatterns.chain;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public class GroupLeader implements Ratify{
    @Override
    public Result handle(Chain chain) {
        Request request = chain.request();
        System.out.println("GroupLeader=====>request:" + request.toString());

        if(request.getDays() > 1) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .setManagerInfo(request.getName() + "平时表现不错，而且现在项目也不忙。")
                    .builder();
            return chain.process(newRequest);
        }
        return new Result(true, "GroupLeader: 早去早回。");
    }
}
