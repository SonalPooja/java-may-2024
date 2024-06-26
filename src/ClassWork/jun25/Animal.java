package ClassWork.jun25;

public interface Animal {

    // variables in interface are by default public static final
    int x = 10;

    // methods are by default public abstract
    void eat();
    void run();
}

class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating..");
        System.out.println(x);
    }

    @Override
    public void run() {
        System.out.println("Dog can run...");
    }
}

class Main1{
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.run();

        System.out.println("x : " + Animal.x);

        Animal dog1 = new Dog(); // upcasting -> assigning child class reference to the parent class object.
    }
}