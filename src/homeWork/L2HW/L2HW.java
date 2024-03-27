package homeWork.L2HW;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class L2HW {
    public static void main(String[] args) {
        scannerWrapper(L2HW::task1);

        /* scannerWrapper(L2HW::task2);

        task3();

        task4();

        scannerWrapper(L2HW::task5);*/
    }

    public static void task1(int n) {
        System.out.println(n % 2 == 0 ? "четное" : "нечетное");
    }

    public static void task2(int t) {
        if (t > -5) {
            System.out.println("Warm");
        }

        if (t <= -5 && t > -20) {
            System.out.println("Normal");
        }

        if (t <= -20) {
            System.out.println("Cold");
        }
    }

    public static void task3() {
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + " - " + i * i);
        }
    }

    public static void task4() {
        int value = 7;
        int step = 7;
        int limit = 98;
        String str = "";

        while (value <= limit) {
            str += value + " ";

            value += step;
        }

        System.out.println(str);
    }

    public static void task5(int value) {
        if (value > 0) {
            int accumulator = 0;
            for (int i = 1; i < value; i++) {
                accumulator += i;
            }

            System.out.println(accumulator);
        } else {
            System.out.println("Error: value is not positive");
        }
    }

    public static void scannerWrapper(IntConsumer callback) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");

        if (scanner.hasNextInt()) {
            callback.accept(scanner.nextInt());
        } else {
            System.out.println("Error: value is not integer");
        }

        scanner.close();
    }
}
