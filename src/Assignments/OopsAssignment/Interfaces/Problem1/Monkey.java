package Assignments.OopsAssignment.Interfaces.Problem1;

public class Monkey implements Animal, Climable{
    @Override
    public void feed() {
        System.out.println("Monkey is eating banana.");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey chatters.");
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing trees.");
    }
}
