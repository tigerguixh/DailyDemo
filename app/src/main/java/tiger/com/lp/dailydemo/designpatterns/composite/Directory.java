package tiger.com.lp.dailydemo.designpatterns.composite;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public abstract class Directory {
    private String name;

    public Directory() {}

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void addDirectory(Directory directory);
    protected abstract void removeDirectory(Directory directory);

    protected void display(int depty) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < depty; i++) {
            sb.append("-");
        }
        System.out.println(sb.append(this.getName()).toString());
    }
}
