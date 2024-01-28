package de.telran.task1;
//
// 1 уровень сложности: 1) Есть абстрактный класс Переводчик, который имеет характеристики имя, возраст, пол и умеет переводить с одного языка на другой.
//Реализовать данный класс и создать несколько классов различных переводчиков с одного языка на другой.
//Например с английского на русский, с русского на немецки и т.п.
//Продумайте какова архитектура наследования будет в данном приложении.

public class task1 {
    public static void main(String[] args) {

        Translater translater = translateText("Maxim","Male",29,"UKR","ENG");
        Translater translater1 = translateText("Ivan","Male",49,"DE","ENG");
        Translater translater2 = translateText("Nikolya","Female",39,"ENG","DE");

        Translater translater3 = translateText("Olya","Female",22,"UKR","DE");

        printTranslate( translater);
        printTranslate(translater1);
        printTranslate(translater2);
        printTranslate(translater3);
    }

    public static Translater translateText(String name, String sex, int age, String langTo, String langFrom) {

        if ((langTo == "UKR") && (langFrom =="ENG"))
        {
            return new EngToUkr(name,sex,age);

            }
        else if ((langTo == "ENG") && (langFrom =="UKR"))
        {
            return new UkrToEng(name,sex,age);

        }
        else if ((langTo == "ENG") && (langFrom =="DE"))
        {
            return new DeToEng(name,sex,age);

        }
        else if ((langTo == "DE") && (langFrom =="ENG"))
        {
            return new EngToDe(name,sex,age);

        }
        return null;

    }
    public static void printTranslate (Translater translater)
    {
        if (translater == null) {
            System.out.println("No such translator");
        }
        else {
            System.out.println( translater.makeTranslate());}
    }
}
