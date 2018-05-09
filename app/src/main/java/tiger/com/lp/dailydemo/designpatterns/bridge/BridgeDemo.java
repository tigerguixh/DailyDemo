package tiger.com.lp.dailydemo.designpatterns.bridge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/27 0027
 * @description
 */

public class BridgeDemo {
    public static void main(String[] args) {
        Qiao areaB1 = new AreaB1();
        AreaA areaA = new AreaA1();
        areaA.qiao = areaB1;

        areaA.fromAreaA();
        areaA.qiao.targetAreaB();

        System.out.println(getFirstHost("http://androidapi22.tadu.com"));
    }

    public static String getFirstHost(String url){
        String regex1="[0-9a-zA-Z]+((\\.com)|(\\.cn)|(\\.org)|(\\.net)|(\\.edu)|(\\.com.cn))";
        // 一级域名提取
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(url);
        if(m.find()){
            return m.group();
        }
        return "";
    }
}
