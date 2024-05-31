package may15;
public class PracticeDemo {

    public static void main(String[] args){

        System.out.println("Current values of x and y :");
        int x = 10;
        int y = 20;
        System.out.println("x : " + x);
        System.out.println("y : " + y);

        // x=20   y=10
        System.out.println("After swapping values of x and y :");
        //        x = x + y;      // x = 20 + 10 = 30
        //        y = x - y;      // y = 30 - 20 = 10
        //        x = x - y;      // x = 30 - 10 = 20

        int z = x;
        x = y;
        System.out.println("x : " + x);
        y = z;
        System.out.println("y : " + y);

    }
}
