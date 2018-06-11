package tiger.com.lp.dailydemo.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public interface Expression {
    double interpreter(HashMap<String, Double> vars); //声明一个解析操作
}
