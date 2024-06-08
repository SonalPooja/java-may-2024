package ClassWork.jun01;

public class MethodOverloading {

    // method overloading
    int sum(int num1, int num2){
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        System.out.println(mo.sum(10, 20));
        System.out.println(mo.sum(10, 20, 30));
        System.out.println(mo.sum(10, 20, 30, 40));
    }
}
