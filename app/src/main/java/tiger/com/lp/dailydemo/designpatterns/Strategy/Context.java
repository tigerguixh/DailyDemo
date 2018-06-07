package tiger.com.lp.dailydemo.designpatterns.Strategy;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class Context {
    private IStrategy strategy;

    public Context() {}

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        strategy.strategyInterface();
    }
}
