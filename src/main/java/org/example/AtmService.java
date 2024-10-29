package org.example;

import org.example.auth.HandleLogin;
import org.example.auth.HandleRegister;

import java.util.*;

public class AtmService {

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<String, String>();
        users.put("+998917738733", "hello");

        Scanner scanner = new Scanner(System.in);
        int lang = chooseLang(scanner);
        int loginOrRegister = auth(scanner);

        if (loginOrRegister == 1) {
            HandleLogin.login(users, lang);

        } else if (loginOrRegister == 2) {
            System.out.println(users);
            HandleRegister.register(users, lang);
        }
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

    public static int auth(Scanner scanner) {
        System.out.println("1. Login / Kirish / Vxod");
        System.out.println("2. Register / Ro'yxatdan o'tish / Zaregistrirovat'sa");
        int choice = scanner.nextInt();
        return choice;
    }
}
