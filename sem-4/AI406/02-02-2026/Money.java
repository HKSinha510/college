// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
import java.util.Scanner;

class BankAccount {
    int balance;

    public BankAccount(int bal) {
        this.balance = bal;

    }

    void deposit(int amt) {
        this.balance = balance+amt;
        System.out.println("\nDeposited " + amt);
        System.out.println("Current balance " + this.balance);

    }

    void withdraw(int amt) {
        this.balance = balance-amt;
        System.out.println("withdrew " + amt);
        System.out.println("Current balance " + this.balance);

    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(int bal) {
        super(bal);
    }

    void withdraw(int amt) {
        if ((super.balance-amt) > 100) {
            this.balance = balance-amt;
            System.out.println("withdrew " + amt);
            System.out.println("Current balance " + this.balance);

        } else {
            System.out.println("insufficient balance");
        }
    }
    
}

public class Money {
    public static void main(String[] args) {
        System.out.println("__ Bank Account __\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        int bal = sc.nextInt();

        BankAccount bnk = new BankAccount(bal);
        SavingsAccount svg = new SavingsAccount(bal);

        System.out.print("Enter amount to withdraw: ");
        int w = sc.nextInt();

        System.out.println("\nNormal Account:");
        bnk.withdraw(w);

        System.out.println("\nSaving Account:");
        svg.withdraw(w);
    }
}