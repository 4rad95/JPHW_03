package de.telran.task3;

//3) Есть класс Авто со свои набором характеристик и поведения.
//        Подумайте, какие ресурсы класса Авто могут доступны только Автомеханику, а какие простому Водителю.
//Создайте интерфейсы Автомеханик и Водитель, и с их помощью разделите доступ к методам класса Авто.

public class task3 {
    public static void main(String[] args) {

        Auto auto = new Auto();

        AutoMechanic autoMechanic = auto;
        autoMechanic.checkOil();
        autoMechanic.repairmentWheals();
        autoMechanic.serviceEngine();

        Driver driver = auto;
        driver.driveCar();
        driver.refuel();
    }
}
