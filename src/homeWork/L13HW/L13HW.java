package homeWork.L13HW;

import homeWork.L13HW.task1.Credentials;

public class L13HW {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        boolean result = Credentials.checkCredentials("USER", " 1337", "1337");
        System.out.println(result ? "Успех" : "Неуспех");
    }
}
