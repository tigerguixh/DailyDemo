package tiger.com.lp.dailydemo.designpatterns.chain;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public class ChainDemo {
    public static void main(String[] args) {
        Request request = new Request.Builder().setName("张三").setDays(5)
                .setReason("事假").builder();
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        Result result = client.execute(request);

        System.out.println("结果：" + result.toString());
    }
}
