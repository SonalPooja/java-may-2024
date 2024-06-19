package ClassWork.jun15;

public class InheritanceDemo {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//        animal.makeSound();

        // object of child class, calls child class method
        // if child class do not have that method, it calls the parent class method
        Dog dog = new Dog();
        dog.makeSound();

        // calling method of parent class using object of child class
        dog.sleep();

    }
}
