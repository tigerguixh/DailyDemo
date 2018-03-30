package tiger.com.lp.dailydemo.algorithm.bubble;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/22 0022
 * @description
 */

public class BubbleTest1 {
    public static void main(String[] args) {
        testBubble1();
    }

    private static void testBubble1() {
        int[] sort = new int[]{5,4,56,49,42,46,3,8};
        int temp;
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length -1 - i; j++) {
                if(sort[j] > sort[j+1]) {
                    temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
        print(sort);
    }

    private static void print(int[] sort) {
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
