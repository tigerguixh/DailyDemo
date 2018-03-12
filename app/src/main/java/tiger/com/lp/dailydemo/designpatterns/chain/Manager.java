package tiger.com.lp.dailydemo.designpatterns.chain;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public class Manager implements Ratify {
    @Override
    public Result handle(Chain chain) {
        Request request = chain.request();
        System.out.println("Manager=====>request:" + request.toString());

        if(request.getDays() > 3) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .setManagerInfo(request.getName() + "每个月的KPI考核还不错，可以批准")
                    .builder();
            return chain.process(newRequest);
        }
        return new Result(true, "Manager：早点把事情办完，项目离不开你");
    }
}
