package homeWork.L6HW;

public class L6HW {
    public static void main(String[] args) {
        // task1();

        additionalTask();
    }

    public static void task1() {
        CreditCard creditCard = new CreditCard("228", 1000);
        creditCard.deposit(1);
        creditCard.displayInfo();

        CreditCard creditCard2 = new CreditCard("1488", 2000);
        creditCard2.deposit(2);
        creditCard2.displayInfo();

        CreditCard creditCard3 = new CreditCard("1337", 3000);
        creditCard3.withdraw(3);
        creditCard3.displayInfo();
    }

    public static void additionalTask() {
        ATM atm = new ATM(1, 1, 1);
        atm.deposit(50, 50, 50);
        boolean result = atm.withdraw(5570);

        System.out.println(result ? "Успех" : "Неуспех");
    }
}
