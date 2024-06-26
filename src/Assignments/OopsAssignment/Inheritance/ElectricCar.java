package Assignments.OopsAssignment.Inheritance;

public class ElectricCar extends Car{

    private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(){
        System.out.println("Charge battery to : " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}
