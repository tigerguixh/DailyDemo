package tiger.com.lp.dailydemo.designpatterns.Strategy;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.operate();

        ConcreteStrategyB strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.operate();

        ConcreteStrategyC strategyC = new ConcreteStrategyC();
        context.setStrategy(strategyC);
        context.operate();
    }
}
