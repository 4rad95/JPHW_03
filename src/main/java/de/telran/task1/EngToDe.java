package de.telran.task1;

public class EngToDe extends Translater {

    public EngToDe(String name, String sex, int age) {
        super(name, sex, age);
    }

    public String makeTranslate() {

        return "My name " + getName() + ". My age : "+ getAge() +". I can translate from English to German";
    }
}
