package homeWork.L17HW;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L17HW {
    static final double EXCHANGE_RATE_BYN_TO_USD = 3.0;
    static String bynBalance = "90 BYN";

    public static void main(String[] args) {
        // task1();

        // task2();

        // task3();

        // task4();

        task5();
    }

    public static void task1() {
        int yearBirth = getIntFromScanner("year");
        int monthBirth = getIntFromScanner("month");
        int dayBirth = getIntFromScanner("day");

        LocalDate birthDate = LocalDate.of(yearBirth, monthBirth, dayBirth);

        System.out.println("Your 100th birthday will be on " + birthDate.plusYears(100));
    }

    public static int getIntFromScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + message + " of birth: ");

        return scanner.nextInt();
    }

    public static void task2() {
        int[] numbers = {-5, -7, 3, 4, 5, 1, 0};
        Predicate<Integer> isPositive = item -> item > 0;

        for (int number : numbers) {
            if (isPositive.test(number)) {
                System.out.println(number);
            }
        }
    }


    public static void task3() {
        Function<String, String> convertToUsd = x -> {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(bynBalance);

            if (matcher.find()) {
                double amountInByn = Double.parseDouble(matcher.group());
                double amountInUsd = amountInByn / EXCHANGE_RATE_BYN_TO_USD;
                return String.format("%.2f USD", amountInUsd);
            }
            return "Сумма не определена";
        };

        System.out.println(convertToUsd.apply(bynBalance));
    }

    public static void task4() {
        Consumer<String> convertToUsd = x -> {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(bynBalance);

            if (matcher.find()) {
                double amountInByn = Double.parseDouble(matcher.group());
                double amountInUsd = amountInByn / EXCHANGE_RATE_BYN_TO_USD;
                System.out.printf("%.2f USD%n", amountInUsd);
            } else {
                System.out.println("Сумма не определена");
            }
        };

        convertToUsd.accept(bynBalance);
    }

    public static void task5() {
        Supplier<String> reverseStr = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter line: ");
            StringBuilder sb = new StringBuilder(scanner.nextLine());

            return String.valueOf(sb.reverse());
        };

        System.out.println(reverseStr.get());
    }
}
