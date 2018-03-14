package tiger.com.lp.dailydemo.designpatterns.command.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/14 0014
 * @description
 */

public class MacroTvCommand implements MacroCommand{
    private List<Command> list = new ArrayList<>();

    @Override
    public void execute() {
        for(Command command : list) {
            command.execute();
        }
    }

    @Override
    public void add(Command command) {
        if(command != null) {
            list.add(command);
        }
    }

    @Override
    public void remove(Command command) {
        if(command != null) {
            list.remove(command);
        }
    }
}
