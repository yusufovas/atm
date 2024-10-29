package org.example.utils;

public class LangUtils {
    public static String translate(int lang, String key) {
        switch (lang) {
            case 1:
                switch (key) {
                    case "invalid_phone_number":
                        return "Invalid phone number. Please try again.";
                    case "invalid_phone_number_format":
                        return "Invalid phone number format. Make sure it starts with + followed by 12 digits";
                    case "already_registered":
                        return "This phone number is already registered!";
                    case "enter_phone_number":
                        return "Enter your phone number";
                    case "welcome":
                        return "Welcome!";
                    case "enter_password":
                        return "Enter your password:";
                    case "create_password":
                        return "Create password: ";
                    case "repeat_password":
                        return "Repeat password: ";
                    case "no_match_password":
                        return "Passwords do not match. Please try again";
                    case "invalid_password":
                        return "Invalid password. Please try again.";
                    case "success":
                        return "Successful registration. Please Log in.";
                    case "too_many_attempts":
                        return "Too many attempts. Please enter your phone number again.";
                    default:
                        return "Sentence does not recongized.";
                }
            case 2:
                switch (key) {
                    case "invalid_phone_number":
                        return "Mavjud bo'lmagan raqam, qaytadan urinib ko'ring!";
                    case "invalid_phone_number_format":
                        return "Kiritilgan telefon raqam formati noto'g'ri. Telefon raqam + bilan boshlanib 12ta raqamdan iboratligini tekshiring.";
                    case "already_registered":
                        return "Bu telefon raqam oldin ro'yxatdan o'than. Tizimga kirishga urinib ko'ring.";
                    case "enter_phone_number":
                        return "Telefon raqamingizni kiriting: ";
                    case "welcome":
                        return "Xush kelibsiz!";
                    case "enter_password":
                        return "Parolingizni kiriting:";
                    case "create_password":
                        return "Parol yarating: ";
                    case "repeat_password":
                        return "Parolingizni qayta kiriting: ";
                    case "no_match_password":
                        return "Parollar bir biriga mos tushmadi. Qaytadan urinib ko'ring.";
                    case "invalid_password":
                        return "Parol xato. Qaytadan urinib ko'ring: ";
                    case "success":
                        return "Muvaffaqiyatli ro'yxatdan o'tdingiz, ortga qaytib tizimga kirishga urinib ko'ring.";
                    case "too_many_attempts":
                        return "Juda ko'p urinishlar soni, telefon raqamingizni qaytadan kiritiing.";
                    default:
                        return "Tarjima topilmadi.";
                }
            case 3:
                switch (key) {
                    case "invalid_phone_number":
                        return "Nesushestvuyushiy nomer telefona, poprobuyte snova.";
                    case "invalid_phone_number_format":
                        return "Neverniy format nomera telefona. Ubetites' chto on nachinayetsa na + i sostoit iz 12 chisel.";
                    case "already_registered":
                        return "Etot nomer telefona ranee bil zaregistrirovan. Poprobuyte voyti v sistemu.";
                    case "enter_phone_number":
                        return "Vvedite nomer telefona: ";
                    case "welcome":
                        return "Dobro pozhalovat'!";
                    case "enter_password":
                        return "Vvedite parol':";
                    case "create_password":
                        return "Sozdayte parol':  ";
                    case "repeat_password":
                        return "Povtorite parol':";
                    case "no_match_password":
                        return "Paroli ne sovpadayut. Poprobuyte snova.";
                    case "invalid_password":
                        return "Neverniy parol', poprobuyte snova.";
                    case "success":
                        return "Udachnaya registratsiya. Voydite v sistemu.";
                    case "too_many_attempts":
                        return "Slishkom mnogo neudachnix popitok, vvedite nomer telefona.";
                    default:
                        return "Perevod ne nayden.";
                }
            default:
                return "Language not supported";
        }
    }
}
