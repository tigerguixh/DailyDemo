package tiger.com.lp.dailydemo.designpatterns.builder;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/9 0009
 * @description
 */

public class Student {
    private final String name;
    private final String sale;
    private final int age;
    private final float score;

    private Student(Builder builder) {
        this.name = builder.name;
        this.sale = builder.sale;
        this.age = builder.age;
        this.score = builder.score;
    }

    public String getName() {
        return name;
    }

    public String getSale() {
        return sale;
    }

    public int getAge() {
        return age;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sale='" + sale + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public static class Builder{
        private String name;
        private String sale;
        private int age;
        private float score;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSale(String sale) {
            this.sale = sale;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setScore(float score) {
            this.score = score;
            return this;
        }

        public Student  builder() {
            return new Student(this);
        }
    }
}
