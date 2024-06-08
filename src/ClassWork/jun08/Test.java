package ClassWork.jun08;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Arrays
        int[] a;  // declaration

        // array initialization
        int[] arr = {101, 102, 103, 104, 105};

        // array declaration with size
        int[] rollNumbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of array : ");

        for(int i = 0; i < rollNumbers.length; i++){
            rollNumbers[i] = sc.nextInt();
        }

        for(int i : rollNumbers){
            System.out.println("Roll number : " + rollNumbers[i]);
        }

//        for(int i = 0; i < rollNumbers.length; i++){
//            System.out.println("Roll number : " + rollNumbers[i]);
//        }

        //        rollNumbers[0] = 201;
        //        rollNumbers[1] = 202;
        //        rollNumbers[2] = 203;
        //        rollNumbers[3] = 204;
        //        rollNumbers[4] = 205;
    }
}
