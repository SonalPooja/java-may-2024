package Assignments.Assignment3;

public class BankAccount {

    //instance variables
    static int accountNumber = 1000;
    String name;
    double balance;

    //static variable for number of accounts created and existing accounts
    static int accountsCreated = 0;

    //constructor
    BankAccount(String name, double balance) {
        accountNumber++;
        this.name = name;
        this.balance = balance;
        accountsCreated++;
    }

    //static method to display total number of accounts created
    public static void totalAccounts(){
        System.out.println("Total number of accounts : " + (accountsCreated));
    }

    //check balance
    public static double checkBalance(BankAccount acc){
        return acc.balance;
    }

    //withdraw
    public static double withdraw(BankAccount acc, double balance){
        if (balance <= acc.balance) {
            acc.balance -= balance;
            System.out.println("Amount successfully withdrawn..");
            return acc.balance;
        } else {
            System.out.println("Insufficient balance..");
            return acc.balance;
        }
    }

    //deposit
    public static double deposit(BankAccount acc, double balance){
        System.out.println("Amount successfully deposited..");
        return acc.balance += balance;
    }

    //print account details
    public static void printDetails(BankAccount acc){
        System.out.println();
        System.out.println("Hello, " + acc.name + "! Welcome to Scotia Bank.");
        System.out.println();
        System.out.println("Your account number is : " + accountNumber);
        System.out.println("Your account balance is : $" + acc.balance);
    }
}
