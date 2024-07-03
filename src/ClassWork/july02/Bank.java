package ClassWork.july02;

public class Bank {

    double balance = 2000;

    double getBalance(){
        return balance;
    }

    double deposit(double depositAmount){
        balance += depositAmount;
        return balance;
    }

    double withdraw(double withdrawlAmount) throws InsufficientBalanceException{
        if(withdrawlAmount > balance){
            // throw -> explicitly throw an exception -> means create our own exception
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance = balance - withdrawlAmount;
        return balance;
    }
}
