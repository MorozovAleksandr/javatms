package homeWork.L6HW;

public class Withdraw {
    private int countBanknote = 0;
    private double amount;
    int denomination;

    public Withdraw(double amount, int banknotes, int denomination) {
        this.amount = amount;
        this.denomination = denomination;

        for (int i = 0; i < banknotes; i++) {
            if (this.amount < this.denomination) {
                break;
            }

            countBanknote++;
            this.amount -= this.denomination;
        }
    }

    public int getCountBanknote() {
        return countBanknote;
    }

    public double getAmount() {
        return this.amount;
    }

    public int getDenomination() {
        return this.denomination;
    }
}
