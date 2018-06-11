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
                    left = stack.pop(); // 从栈中取回上一个压入的元素作为左侧表达式
                    right = new VarExpression(String.valueOf(chars[++i])); // 取出右侧元素，因为值在表达式的右边，所以需要++i
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
