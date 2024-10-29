package org.example;

import java.util.Scanner;

public class AtmFunctionality {
    boolean isAuthorized;
    double balance;

    public AtmFunctionality(boolean isAuthorized, double balance) {
        this.isAuthorized = isAuthorized;
        this.balance = balance;

        if (isAuthorized) {
            displayMenu();
        } else {
            System.out.println("Unauthorized.");
        }
    }

    private void displayMenu() {
        System.out.println("Choose operation: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checkBalance();
            case 2:
                depositMoney();
            case 3:
                withdrawMoney();
        }

    }

    private void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    private void depositMoney() {
        System.out.println("Enter amout you want to deposit: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Success. Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount. Try again.");
        }
    }

    private void withdrawMoney() {
        System.out.println("Enter amout you want to withdraw: ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Success. Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount. Try again.");
        }
    }
}
