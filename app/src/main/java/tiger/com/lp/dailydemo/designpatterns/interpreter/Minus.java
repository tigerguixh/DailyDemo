package tiger.com.lp.dailydemo.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class Minus extends SymbolExp{
    public Minus(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double interpreter(HashMap<String, Double> vars) {
        return left.interpreter(vars) - right.interpreter(vars);
    }
}
