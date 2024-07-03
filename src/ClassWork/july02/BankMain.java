package ClassWork.july02;

public class BankMain {
    public static void main(String[] args) throws InsufficientBalanceException{

        Bank bank = new Bank();

        double balance = bank.getBalance();
        System.out.println("Balance : " + balance);

        double newBalance = bank.deposit(1000);
        System.out.println("New Balance after 1000 deposit : " + newBalance);

        try{
            double withdraw = bank.withdraw(4000);
            System.out.println("New Balance after 4000 withdraw : " + withdraw);
        }catch (InsufficientBalanceException e){
            e.printStackTrace();
        }
    }
}
