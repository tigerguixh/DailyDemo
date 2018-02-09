package tiger.com.lp.dailydemo.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public class TreeDirectory extends Directory{
    private List<Directory> directoryList;

    public TreeDirectory(String name) {
        super(name);

        directoryList = new ArrayList<>();
    }

    @Override
    protected void addDirectory(Directory directory) {
        directoryList.add(directory);
    }

    @Override
    protected void removeDirectory(Directory directory) {
        directoryList.remove(directory);
    }

    @Override
    protected void display(int depty) {
        super.display(depty);

        for(Directory directory : directoryList) {
            directory.display(depty + 2);
        }
    }
}
