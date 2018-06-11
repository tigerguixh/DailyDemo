package tiger.com.lp.dailydemo.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class VarExpression implements Expression{
    private String value;

    public VarExpression(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public double interpreter(HashMap<String, Double> vars) {
        return vars.get(value); // 返回表达式所对应的值
    }
}
