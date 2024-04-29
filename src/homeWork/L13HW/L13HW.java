package homeWork.L13HW;

import homeWork.L13HW.task1.Credentials;

public class L13HW {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        boolean result = Credentials.checkCredentials("USER ", "asd ", "1337");
        
        System.out.println(result ? "Успех" : "Неуспех");
    }

    public static void additionalTask() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.exit(0);
        } finally {
            System.out.println("finally");
        }
    }
}
