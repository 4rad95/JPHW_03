package de.telran.task1;

public class DeToEng extends Translater {
    public DeToEng(String name, String sex, int age) {
        super(name, sex, age);
    }

    public String makeTranslate() {

        return "My name " + getName() + ". My age : "+ getAge() +". I can translate from German to English";
    }
}
