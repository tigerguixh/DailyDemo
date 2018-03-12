package tiger.com.lp.dailydemo.designpatterns.chain;

import java.util.List;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/9 0009
 * @description
 */

public class RealChain implements Ratify.Chain{
    public Request request;
    public List<Ratify> ratifyList;
    public int index;

    public RealChain(Request request, List<Ratify> ratifyList, int index) {
        this.request = request;
        this.ratifyList = ratifyList;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result process(Request request) {
        Result result = null;
        if(ratifyList.size() > index) {
            RealChain realChain = new RealChain(request, ratifyList, index + 1);
            Ratify ratify = ratifyList.get(index);
            result = ratify.handle(realChain);
        }
        return result;
    }
}
