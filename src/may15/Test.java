package may15;
public class Test {

    public static void main(String[] args){
        //print hello world
        System.out.println("Hello World !");

        //variables
        int x = 10;  //initialization
        int y;  // declaration -> to print y, we have to give it a value first
        String companyName = "Pragra";
        double salary = 2000.23;
        float temp = 23.4f;        //to define float value, we have to put f after the value
        boolean isRaining = false;
        char letter = 'A';

        //System.out.println(y); -> compilation error before there is no value assigned to y
        System.out.println("the value of x is : " + x );
        System.out.println(x + "  " + companyName);
        System.out.println(companyName);
        System.out.println(temp);
        System.out.println(salary);
        System.out.println(isRaining);
        System.out.println(letter);

    }
}
