package tiger.com.lp.dailydemo.designpatterns.strategy;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/12
 * @Description :
 */
public class ConcreteStrategyA implements IStrategy{
    @Override
    public void strategyInterface() {
        System.out.println("妖精，快放了我师傅。");
    }
}
