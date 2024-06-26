package Assignments.OopsAssignment.Interfaces.Problem1;

public class AnimalMain {

    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();
        System.out.println();

        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
        System.out.println();

        Penguin penguin = new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();
        System.out.println();

        Squirrel squirrel = new Squirrel();
        squirrel.feed();
        squirrel.makeSound();
        squirrel.climb();
    }
}
