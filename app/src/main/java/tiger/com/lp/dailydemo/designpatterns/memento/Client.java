package tiger.com.lp.dailydemo.designpatterns.memento;

import java.util.Locale;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/2 0002
 * @description
 */

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        //改变负责人对象的状态
        originator.setState("on");
        //创建备忘录对象，并将发起人对象的状态储存起来
        caretaker.saveMememto(originator.createMemento());
        //修改发起人的状态
        originator.setState("off");

        //恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println(originator.getState());

        System.out.println("----------------------------");

        Originator1 originator1 = new Originator1();

        Caretaker1 caretaker1 = new Caretaker1();

        originator1.setState("开灯");
        
        caretaker1.saveMemento(originator1.createMementor());

        originator1.setState("关灯");

        System.out.println(originator1.getState());

        originator1.restoreMementor(caretaker1.retriveMemento());

        System.out.println(originator1.getState());
    }
}
