package Assignments.OopsAssignment.Inheritance;

public class Car extends Vehicle{

    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of doors : " + numDoors);
    }
}
