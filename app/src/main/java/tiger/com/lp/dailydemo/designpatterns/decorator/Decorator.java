package tiger.com.lp.dailydemo.designpatterns.decorator;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public abstract class Decorator extends Component{
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null) {
            component.operation();
        }
    }
}
