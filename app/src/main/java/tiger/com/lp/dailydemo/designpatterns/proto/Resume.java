package tiger.com.lp.dailydemo.designpatterns.proto;

import java.util.ArrayList;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/2/26 0026
 * @description
 */

public class Resume implements Cloneable{
    public String name = null;
    public Integer age = null;
    public String sex = null;
    public ArrayList<String> famMem = new ArrayList<>();
    public WorkExperience work = null;

    public Resume(String name, ArrayList<String> famMem) {
        this.name = name;
        this.famMem = famMem;
        work = new WorkExperience();
    }

    public void setName(String name) {
        this.name = name;
    }// setName

    public void setPersonal(String sex, int age) {
        this.age = age;
        this.sex = sex;
    }// setPersonal

    public void setWork(String timeArea, String company) {
        work.timeArea = timeArea;
        work.company = company;
    }// setWork

    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.print("Family member: ");
        for(String elem : famMem) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.print("Work experience: " + this.work.timeArea);
        System.out.println(" " + this.work.company);
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        int age = this.age;
        String sex = this.sex;
        String name = new String(this.name);
        ArrayList<String> famMem = new ArrayList<>(this.famMem);

        Resume copy = new Resume(name, famMem);
        copy.setPersonal(sex, age);
        copy.setWork(this.work.timeArea, this.work.company);
        return copy;
    }
}
