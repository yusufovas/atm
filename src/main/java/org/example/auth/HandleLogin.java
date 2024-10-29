package org.example.auth;

import org.example.AtmFunctionality;
import org.example.AtmService;
import org.example.utils.LangUtils;

import java.util.Map;
import java.util.Scanner;

public class HandleLogin {
    public static void login(Map<String, String> users, int lang) {
    double initialBalance = 100.0;
        while (true) {
            System.out.println(LangUtils.translate(lang, "enter_phone_number"));
            Scanner scanner1 = new Scanner(System.in);
            String phone = scanner1.nextLine();

            if (!isValidPhoneNumber(phone)) {
                System.out.println(LangUtils.translate(lang, "invalid_phone_number_format"));
                continue;
            }

            String savedPassword = users.get(phone);
            if (savedPassword == null) {
                System.out.println(LangUtils.translate(lang, "invalid_phone_number"));
                continue;
            }

            int attempts = 0;
            boolean success = false;

            while (attempts < 3) {
                System.out.println(LangUtils.translate(lang, "enter_password"));
                Scanner scanner2 = new Scanner(System.in);
                String password = scanner2.nextLine();

                if (users.get(phone).equals(password)) {
                    System.out.println(LangUtils.translate(lang, "welcome"));
                    success = true;
                    break;
                } else {
                    attempts++;
                    if (attempts < 3) {
                        System.out.println(LangUtils.translate(lang, "invalid_password"));
                    }
                }
            }
            if (success) {
                break;
            } else {
                System.out.println(LangUtils.translate(lang, "too_many_attempts"));
                break;
            }
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+\\d{12}");
    }
}
