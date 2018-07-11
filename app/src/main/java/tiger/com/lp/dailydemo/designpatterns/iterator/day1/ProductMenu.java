package tiger.com.lp.dailydemo.designpatterns.iterator.day1;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/7/11
 * @Description :
 */
public class ProductMenu {
    private String name;
    private double price;

    public ProductMenu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductMenu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
