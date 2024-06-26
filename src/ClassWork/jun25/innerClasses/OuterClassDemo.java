package ClassWork.jun25.innerClasses;

public class OuterClassDemo {

    class InnerClassDemo{

        public void show(){
            System.out.println("Inner class method..");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // outer class object
        OuterClassDemo outerClassDemo = new OuterClassDemo();

        // syntax to create inner class object
        OuterClassDemo.InnerClassDemo obj = outerClassDemo.new InnerClassDemo();

        obj.show();
    }
}
