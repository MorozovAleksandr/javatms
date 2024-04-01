package homeWork.L5HW;

import java.util.Random;
import java.util.Scanner;

public class L5HW {
    public static void main(String[] args) {
       /*
       Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.
        */
    }

    public static void task1() {
        int[][] arr = new int[3][3];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        int randomValue = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100) + randomValue;
            }
        }


    }
}
