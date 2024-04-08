package homeWork.L6HW;

public class CreditCard {
    private String account;
    private double balance;

    public CreditCard(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayInfo() {
        System.out.println("На счету " + this.account + ": " + this.balance);
    }


}
