package org.example;

import java.util.Scanner;

public class AtmService {
    public static void main(String[] args) {
        double balance;
        Scanner scanner = new Scanner(System.in);
        int lang = chooseLang(scanner);
        String phoneNumber = phoneNumber(scanner);

        while (true) {
            if (lang == 1) {
                System.out.println("Welcome!");
                System.out.println("1. Check Balance");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
            } else if (lang == 2) {
                System.out.println("Xush kelibsiz!");
                System.out.println("1. Balansni tekshirish");
                System.out.println("3. Naqd pul yechish");
                System.out.println("4. Chiqish");
                System.out.print("Tanlang: ");
            } else if (lang == 3) {
                System.out.println("Добро пожаловать!");
                System.out.println("1. Проверить баланс");
                System.out.println("3. Выдать наличные");
                System.out.println("4. Выход");
                System.out.print("Выберите опцию: ");
            } else {
                System.out.println("Invalid input!");
                break;
            }
            int choice = scanner.nextInt();
        }
        scanner.close();
    }

    public static int chooseLang(Scanner scanner) {
        System.out.println("Choose a language:");
        System.out.println("1. English");
        System.out.println("2. O'zbekcha");
        System.out.println("3. Русский");
        System.out.println("Enter the number of selected language: ");
        int choice = scanner.nextInt();
        return choice;
    }

    public static String phoneNumber(Scanner scanner) {
        System.out.println("Enter your phone number: ");
        return scanner.next();
    }
}