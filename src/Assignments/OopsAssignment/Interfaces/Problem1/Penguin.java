package Assignments.OopsAssignment.Interfaces.Problem1;

public class Penguin implements Animal, Swimmable{
    @Override
    public void feed() {
        System.out.println("Penguin is eating fish.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin brays, crocks, quacks or chirps");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming.");
    }
}
