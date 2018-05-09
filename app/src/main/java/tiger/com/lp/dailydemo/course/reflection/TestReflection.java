package tiger.com.lp.dailydemo.course.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/9
 * @Description :
 */
public class TestReflection {
    private final static String TAG = "Reflection";

    public static void main(String[] args) {
        testReflection();
        testField();
    }

    public static void testReflection() {
        Class clazz = Animal.class;

        try {
            Constructor constructor = clazz.getConstructor(String.class, int.class);
            Animal animal = (Animal) constructor.newInstance("Tiger", 23);
            System.out.println(animal.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testField() {
        Animal animal = new Animal("Tom", 3);

        Class clazz = animal.getClass();
        try {
            Field nameField = clazz.getDeclaredField("name");
            Field ageField = clazz.getDeclaredField("age");

            nameField.setAccessible(true);
            ageField.setAccessible(true);
            String name = (String) nameField.get(animal);
            int age = (int) ageField.get(animal);

            System.out.println("The name is: " + name + ", and age is: " + age);

            nameField.set(animal, "Tim");
            ageField.set(animal, 9);

            System.out.println("After modified value is: " + animal.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
