package may25;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 =  sc.nextInt();
        System.out.println("Enter first number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter first number : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The greatest number is :" + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is : " + num2);
        }
        else{
            System.out.println("The greatest number is : " +num3);
        }
    }
}
