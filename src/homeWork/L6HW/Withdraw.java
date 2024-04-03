package homeWork.L6HW;

public class Withdraw {
    private int countBanknote = 0;
    private double amount;

    public Withdraw(double amount, int banknotes, int denomination) {
        this.amount = amount;

        for (int i = 0; i < banknotes; i++) {
            if (this.amount < denomination) {
                break;
            }

            countBanknote++;
            this.amount -= denomination;
        }
    }

    public int getCountBanknote() {
        return countBanknote;
    }

    public double getAmount() {
        return amount;
    }
}
