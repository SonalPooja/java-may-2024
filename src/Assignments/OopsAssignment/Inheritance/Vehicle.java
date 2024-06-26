package Assignments.OopsAssignment.Inheritance;

public class Vehicle {

    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("Starting..");
    }

    public void stop(){
        System.out.println("Stopping..");
    }

    public void displayInfo(){
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}
