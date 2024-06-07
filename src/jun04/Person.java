package jun04;

public class Person {
    int x;

    static{ // static block
        System.out.println("Inside static block");
    }

    public static void printName(){ // static method
        System.out.println("Pragra");
    }

    public void printNothing(){
        System.out.println("Nothing");
    }
}

class Main{
    public static void main(String[] args) {
        Person person = new Person();
        person.printNothing();

        Person.printName();  // to call a static method using class name

    }
}
