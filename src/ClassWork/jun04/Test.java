package ClassWork.jun04;

public class Test {

    static{  // static block
        System.out.println("Inside static block");
    }

    public static void printDetails(){ // static method
        System.out.println("Inside static method printDetails()");
    }

    { // instance block
        System.out.println("Inside instance block");
    }

    Test(){ // constructor
        System.out.println("Constructor");
    }

    public void show(){
        System.out.println("Show method");
    }
}

class TestMain{
    public static void main(String[] args) {
        Test test = new Test();
        Test.printDetails();
        test.show();

    }
}