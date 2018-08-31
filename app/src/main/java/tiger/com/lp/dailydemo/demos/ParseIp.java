package tiger.com.lp.dailydemo.demos;

import android.net.Uri;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/8/24
 * @Description :
 */
public class ParseIp {
    public static void main(String[] args) {
        try {
            Map map = new HashMap();
            map.put("https://media7.tadu.com", "10.0.3136.0");
            System.out.println(map.toString());
            InetAddress inetAddress = InetAddress.getByName(Uri.parse("https://media7.tadu.com").getHost());
            System.out.print(inetAddress.getHostAddress());



        } catch (Exception e) {}
    }
}
