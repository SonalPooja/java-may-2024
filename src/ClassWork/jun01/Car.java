package ClassWork.jun01;

public class Car {

    //properties
    String color = "Blue";
    String brand = "Tesla";
    int engineSize = 200;

    //behaviour
    //methods - set of block statements which perform specific task.
    // we can call a method whenever we want.
    /*
        Syntax for method:-

        return_type method_name() {
            return x;
        }
    */
    void brake(){
        System.out.println("Car brakes...");
    }

    void run(){
        System.out.println("Car is running...");
    }

    boolean hasElectricEngine(){
        return true;
    }
}
