package tiger.com.lp.dailydemo.designpatterns.interpreter;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/11
 * @Description :
 */
public abstract class SymbolExp implements Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExp(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
