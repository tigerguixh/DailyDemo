package tiger.com.lp.dailydemo.designpatterns.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public class Calculator {
    private Expression expression;

    public Calculator(String exp) {
        Expression left;
        Expression right;
        Stack<Expression> stack = new Stack<>();
        char[] chars = exp.toCharArray();
        for (int i = 0, len = chars.length; i < len; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new Add(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new Minus(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public double cal(HashMap<String, Double> var) {
        return this.expression.interpreter(var);
    }
}
