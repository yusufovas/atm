package org.example.auth;

import org.example.AtmService;
import org.example.utils.LangUtils;

import java.util.Map;
import java.util.Scanner;

public class HandleRegister {
    public static void register(Map<String, String> users, int lang) {
        String password;
        String repeatPassword;
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.println(LangUtils.translate(lang, "enter_phone_number"));
            String phone = scanner1.nextLine();

            if (!isValidPhoneNumber(phone)) {
                System.out.println(LangUtils.translate(lang, "invalid_phone_number_format"));
                continue;
            }

            if (users.containsKey(phone)) {
                System.out.println(LangUtils.translate(lang, "already_registered"));
                continue;
            }

            while (true) {
                System.out.println(LangUtils.translate(lang, "create_password"));
                Scanner scanner2 = new Scanner(System.in);
                password = scanner2.nextLine();

                System.out.println(LangUtils.translate(lang, "repeat_password"));
                Scanner scanner3 = new Scanner(System.in);
                repeatPassword = scanner3.nextLine();

                if (repeatPassword.equals(password)) {
                    users.put(phone, password);
                    System.out.println(LangUtils.translate(lang, "success"));
                    break;
                } else {
                    System.out.println(LangUtils.translate(lang, "no_match_password"));
                }
            }
            break;
        }
        scanner1.close();
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+\\d{12}");
    }
}
