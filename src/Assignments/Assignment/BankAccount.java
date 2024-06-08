package Assignments.Assignment;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bank account balance : ");
        double balance = sc.nextDouble();
        String account;

        if(balance > 100){
            account = "Account has a healthy balance.";
        }
        else if (balance >= 0 && balance <= 100) {
            account = "Account has a low balance.";
        }
        else {
            account = "Account is in overdraft";
        }

        System.out.println("Account balance is : " + balance);
        System.out.println(account);
    }
}
