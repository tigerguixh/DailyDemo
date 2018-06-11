package tiger.com.lp.dailydemo.designpatterns.mediator;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/6/7
 * @Description :
 */
public class ConcreteMediator extends Mediator{
    private Colleague colleagueA;
    private Colleague colleagueB;

    public Colleague getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public Colleague getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if(coll == colleagueA) {
            colleagueB.getMessage(content);
        } else {
            colleagueA.getMessage(content);
        }
    }
}
