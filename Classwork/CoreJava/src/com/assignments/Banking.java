package com.assignments;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Sorry, insufficient balance, you need more " + (amount - balance) + " Rs. to perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " Rs. deducted from account balance.");
        }
    }
}

public class Banking {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();

        account.withdraw(withdrawAmount);

        scanner.close();
    }
}
