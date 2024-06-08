package Assignments.Assignment3;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String name;
        double balance;

        BankAccount account1 = new BankAccount("Sonal", 5000);

        boolean continueRunning = true;

        while(continueRunning){
            System.out.println("-----------------------------------------------");
            System.out.println("Welcome to Scotia Bank");
            System.out.println("-----------------------------------------------");
            System.out.println("Are you an existing customer : yes / no");
            String choice = sc.next();

            if(choice.equals("yes")){
                System.out.println("Enter your account number : ");
                int accountNo = sc.nextInt();

                if(accountNo == BankAccount.accountNumber){
                    System.out.println();
                    System.out.println("Welcome, " + account1.name + "! Choose a service : ");
                    System.out.println();
                    System.out.println("1. Enter 1 for Deposit");
                    System.out.println("2. Enter 2 for Withdraw");
                    System.out.println("3. Enter 3 for Check Balance");
                    int serviceOption = sc.nextInt();
                    System.out.println();

                    switch (serviceOption){
                        case 1:
                            System.out.println("Enter the amount you want to deposit : ");
                            double amountDeposit = sc.nextDouble();
                            System.out.println("Your account balance is : $" + BankAccount.deposit(account1, amountDeposit));
                            break;
                        case 2:
                            System.out.println("Enter the amount you want to withdraw : ");
                            double amountWithdraw = sc.nextDouble();
                            System.out.println("Your account balance is : $" + BankAccount.withdraw(account1, amountWithdraw));
                            break;
                        case 3:
                            System.out.println("Your account balance is : " + BankAccount.checkBalance(account1));
                            break;
                        default:
                            System.out.println("Enter a valid option");
                    }
                }
                else{
                    System.out.println("No account found! Enter correct account number.");
                }
            }
            else if (choice.equals("no")) {
                System.out.println("New account registration page");
                System.out.println("Enter your name : ");
                name = sc.next();
                System.out.println("Enter the amount you want to deposit : ");
                balance = sc.nextDouble();
                BankAccount account = new BankAccount(name, balance);
                System.out.println("Account added successfully!!!");
                BankAccount.printDetails(account);
                System.out.println();
                BankAccount.totalAccounts();
            }
            else{
                System.out.println("Enter a valid option..");
            }
            System.out.println();
            System.out.println("Do you want to continue? Enter 1 to continue or enter 2 to exit.");
            int option = sc.nextInt();
            if (option == 2) {
                continueRunning = false;
            }
        }
    }
}
