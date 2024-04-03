package homeWork.L6HW;

public class ATM {
    private int banknote20 = 0;
    private final int DENOMINATION20 = 20;
    private int banknote50 = 0;
    private final int DENOMINATION50 = 50;
    private int banknote100 = 0;
    private final int DENOMINATION100 = 100;


    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void deposit(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public boolean withdraw(double amount) {
        int amountAtAtm = banknote20 * DENOMINATION20 + banknote50 * DENOMINATION50 + banknote100 * DENOMINATION100;

        if (amount > amountAtAtm) {
            System.out.println("Недостаточно средств в банкомате");
            return false;
        }

        Withdraw check100 = new Withdraw(amount, this.banknote100, DENOMINATION100);
        amount = check100.getAmount();

        Withdraw check50 = new Withdraw(amount, this.banknote50, DENOMINATION50);
        amount = check50.getAmount();

        Withdraw check20 = new Withdraw(amount, this.banknote20, DENOMINATION20);
        amount = check20.getAmount();

        if (amount > 0) {
            System.out.println("Нет купюр подходящего номинала для данной суммы");
            return false;
        }

        System.out.println("Снято купюр номиналом 100: " + check100.getCountBanknote());
        System.out.println("Снято купюр номиналом 50: " + check50.getCountBanknote());
        System.out.println("Снято купюр номиналом 20: " + check20.getCountBanknote());

        return true;
    }
}
