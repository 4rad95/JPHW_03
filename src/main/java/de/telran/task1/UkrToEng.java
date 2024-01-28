package de.telran.task1;

public class UkrToEng extends Translater {
    public UkrToEng(String name, String sex, int age) {
        super(name, sex, age);
    }

    public String makeTranslate() {

        return "My name " + getName() + ". My age : "+ getAge() +". I can translate from ukr to eng";
    }
}
