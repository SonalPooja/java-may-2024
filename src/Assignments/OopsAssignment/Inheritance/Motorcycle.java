package Assignments.OopsAssignment.Inheritance;

public class Motorcycle extends Vehicle{

    private int numCylinders;

    public Motorcycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of cylinders : " + numCylinders);
    }
}
