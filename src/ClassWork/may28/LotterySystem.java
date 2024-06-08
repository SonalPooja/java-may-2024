package ClassWork.may28;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {

        int luckyNumber = 52;

        Scanner sc = new Scanner(System.in);
        int num;

        int count = 3;
        do{
            System.out.println("Chances : " + count);
            System.out.println("Enter a number : ");
            num = sc.nextInt();
            if(num == luckyNumber){
                System.out.println("Congratulation...You won the lottery.");
                break;
            }
            else{
                count--;
                continue;
            }
        } while(count > 0);
    }
}
