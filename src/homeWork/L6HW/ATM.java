package homeWork.L6HW;

public class ATM {

    private final int DENOMINATION20 = 20;
    private final int DENOMINATION50 = 50;
    private final int DENOMINATION100 = 100;

    private int banknote20 = 0;
    private int banknote50 = 0;
    private int banknote100 = 0;


    public ATM(int banknote20, int banknote50, int banknote100) {
        deposit(banknote20, banknote50, banknote100);
    }

    public void deposit(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    Withdraw[] generateCombinations(int[][] items, double initAmount) {
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length; j++) {
                for (int k = 0; k < items.length; k++) {
                    if (i != j && i != k && j != k) {
                        double amount = initAmount;
                        Withdraw firstItem = new Withdraw(amount, items[i][0], items[i][1]);
                        amount = firstItem.getAmount();

                        Withdraw secondItem = new Withdraw(amount, items[j][0], items[j][1]);
                        amount = secondItem.getAmount();

                        Withdraw thirdItem = new Withdraw(amount, items[k][0], items[k][1]);
                        amount = thirdItem.getAmount();


                        if (amount == 0.0) {
                            return new Withdraw[]{firstItem, secondItem, thirdItem};
                        }
                    }
                }
            }
        }

        return null;
    }

    public boolean withdraw(double amount) {
        int amountAtAtm = banknote20 * DENOMINATION20 + banknote50 * DENOMINATION50 + banknote100 * DENOMINATION100;

        if (amount > amountAtAtm) {
            System.out.println("Недостаточно средств в банкомате");
            return false;
        }

        int[][] combinations = {{this.banknote100, DENOMINATION100}, {this.banknote50, DENOMINATION50}, {this.banknote20, DENOMINATION20}};

        Withdraw[] generateComb = generateCombinations(combinations, amount);

        if (generateComb == null) {
            System.out.println("Нет купюр подходящего номинала для данной суммы");
            return false;
        }

        for (Withdraw item : generateComb) {
            System.out.println("Снято купюр номиналом " + item.getDenomination() + ": " + " " + item.getCountBanknote());
        }

        return true;
    }
}
