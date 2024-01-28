package de.telran.task1;

public class EngToUkr extends Translater {


    public EngToUkr(String name, String sex, int age) {
        super(name, sex, age);
    }

    public String makeTranslate() {

        return "My name " + getName() + ". My age : "+ getAge() +". I can translate from eng to ukr";
    }
}
