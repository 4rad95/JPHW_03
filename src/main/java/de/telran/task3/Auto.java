package de.telran.task3;

public class Auto implements Driver, AutoMechanic
{
    public void checkOil ()
    {
        System.out.println("Check oil level");
    }
    public void serviceEngine() {
        System.out.println("Service engine");
    }
    public void repairmentWheals() {
        System.out.println("Wheals repairment");
    }

    @Override
    public void driveCar() {
        System.out.println("Drive car");
    }

    @Override
    public void refuel() {
        System.out.println("Refuel car");
    }

}
