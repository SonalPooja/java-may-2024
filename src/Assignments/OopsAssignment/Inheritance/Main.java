package Assignments.OopsAssignment.Inheritance;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda", "CRV", 2024, 4);
        System.out.println("Car details : ");
        car.displayInfo();
        car.start();
        car.stop();
        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Suzuki", "Hayabusa", 2023, 4);
        System.out.println("Motorcycle details : ");
        motorcycle.displayInfo();
        motorcycle.start();
        motorcycle.stop();
        System.out.println();

        ElectricCar electricCar = new ElectricCar("Rolls-Royce", "Spectre", 2023, 4, 102);
        System.out.println("Electric car details : ");
        electricCar.displayInfo();
        electricCar.start();
        electricCar.chargeBattery();
        electricCar.stop();
        System.out.println();
    }
}
