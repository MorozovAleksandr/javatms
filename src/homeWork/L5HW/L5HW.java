package homeWork.L5HW;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class L5HW {
    public static void main(String[] args) {
        task1();

        task2();

        additionalTask();
    }

    public static int[][] fillRandomArr(int[][] arr, int randomBound) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        int randomValue = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(randomBound) + randomValue;
            }
        }

        return arr;
    }

    public static void getSumArrayElements(int[][] arr) {
        int sum = 0;

        for (int[] i : arr) {
            for (int j : i) {
                sum += j;
            }
        }

        System.out.println(sum);
    }

    public static void task1() {
        final int RANDOM_BOUND = 5;
        int[][] arr = fillRandomArr(new int[3][3], RANDOM_BOUND);

        getSumArrayElements(arr);
    }

    // TODO: СЛОЖНАА, но снижено количество итераций
    public static String[][] fillChessArr(String[][] arr) {
        final String WHITE = "W";
        final String BLACK = "B";

        String[] arrStartWhite = new String[arr[0].length];
        String[] arrStartBlack = new String[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arrStartWhite[i] = WHITE;
                arrStartBlack[i] = BLACK;
                continue;
            }
            arrStartWhite[i] = Objects.equals(arrStartWhite[i - 1], WHITE) ? BLACK : WHITE;
            arrStartBlack[i] = Objects.equals(arrStartBlack[i - 1], BLACK) ? WHITE : BLACK;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i % 2 == 0) ? arrStartWhite : arrStartBlack;
        }

        return arr;
    }

    public static void task2() {
        String[][] arr = fillChessArr(new String[8][8]);

        System.out.println(Arrays.deepToString(arr));
    }

    public static void additionalTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();

        int[][] arr = new int[columns][rows];

        // TODO: думаю можно без счетчика, но лень думать :D
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = counter;
                } else {
                    arr[i][arr[i].length - j - 1] = counter;
                }

                counter++;
            }

            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
