package tiger.com.lp.dailydemo.designpatterns.interpreter;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class Client {
    public void run() {
        String exp = getExp();
        HashMap<String, Double> vars = getValues(exp);
        Calculator calculator = new Calculator(exp);

        System.out.printf("%s = %f", exp, calculator.cal(vars));
    }

    private String getExp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private HashMap<String, Double> getValues(String exp) {
        HashMap<String, Double> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char[] chars = exp.toCharArray();
        for (char c : chars) {
            String str = String.valueOf(c);
            if(!"+-".contains(str) && !map.containsKey(str)) {
                map.put(str, scanner.nextDouble());
            }
        }
        return map;
    }
}
