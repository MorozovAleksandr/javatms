public class Main {
    public static void main(String[] args) {
        System.out.println(task1(4, 3));

        System.out.println(task2(99));

        System.out.println(task3(999));

        System.out.println(task4(3.49));

        System.out.println(task5(21, 8));

        task6(7, 4);
    }

    public static int task1(int b, int c) {
        return 4 * (b + c - 1) / 2;
    }

    public static int task2(int n) {
        int firstNumber = n / 10;
        int secondNumber = n % 10;

        return firstNumber + secondNumber;
    }

    public static int task3(int n) {
        int firstNumber = n / 100;
        int doubleDigitNumber = (n - firstNumber * 100);

        return firstNumber + task2(doubleDigitNumber);
    }

    public static int task4(double n) {
        int firstNumber = (int) n;
        double fraction = n - firstNumber;

        return fraction * 100 >= 50 ? ++firstNumber : firstNumber;
    }

    public static String task5(int q, int w) {
        // TODO: Если q < w?
        int integerNumber = q / w;
        int leftNumber = q % w;

        return integerNumber + " и " + leftNumber + " в остатке";
    }

    public static void task6(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a); // 2
        System.out.println(b); // 1
    }
}










