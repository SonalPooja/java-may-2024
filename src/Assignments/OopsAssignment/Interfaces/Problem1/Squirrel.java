package Assignments.OopsAssignment.Interfaces.Problem1;

public class Squirrel implements Animal, Climable{
    @Override
    public void feed() {
        System.out.println("Squirrel is eating nuts.");
    }

    @Override
    public void makeSound() {
        System.out.println("Squirrel squeaks.");
    }

    @Override
    public void climb() {
        System.out.println("Squirrel is climbing trees.");
    }
}
