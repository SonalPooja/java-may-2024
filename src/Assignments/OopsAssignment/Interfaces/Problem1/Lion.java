package Assignments.OopsAssignment.Interfaces.Problem1;

public class Lion implements Animal{
    @Override
    public void feed() {
        System.out.println("Lion is eating meat.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars.");
    }
}
