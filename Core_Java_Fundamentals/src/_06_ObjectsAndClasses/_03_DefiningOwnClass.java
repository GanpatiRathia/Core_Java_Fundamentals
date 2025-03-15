package _06_ObjectsAndClasses;

class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        }
    }
}

public class _03_DefiningOwnClass {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);
        myAccount.deposit(200);
        myAccount.withdraw(100);
    }
}
