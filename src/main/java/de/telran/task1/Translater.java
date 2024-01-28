package de.telran.task1;

public abstract class Translater {
    private  String name;
    private  String sex;
    private int age;


    public Translater(java.lang.String name, java.lang.String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getSex() {
        return sex;
    }

    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public abstract  String  makeTranslate ();

}
