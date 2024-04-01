package homeWork.L4HW;

import java.util.Scanner;

public class CustomArray {
    private int[] array;

    public CustomArray(boolean isRandomFill) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");

        this.array = new int[scanner.nextInt()];

        if (isRandomFill) {
            this.randomFill();
        } else {
            this.manualFill();
        }
    }

    private void randomFill() {
        for (int i = 0; i < array.length; i++) {
            this.array[i] = (int) (Math.random() * 100);
        }
    }

    private void manualFill() {
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("index " + i + " = ");

            this.array[i] = scanner.nextInt();
        }
    }

    public void displayArray(boolean isReverse) {
        StringBuilder strArray = new StringBuilder();
        int initItem = isReverse ? this.array.length - 1 : 0;

        for (int i = initItem; isReverse ? (i >= 0) : (i < this.array.length); i = isReverse ? i - 1 : i + 1) {
            strArray.append(this.array[i]);

            boolean checkOriginal = i != this.array.length - 1;
            boolean checkReverse = i != 0;
            boolean check = isReverse ? checkReverse : checkOriginal;

            if (check) {
                strArray.append(", ");
            }
        }

        System.out.println("[" + strArray + "]");
    }

    public void getMinMax(boolean isMin) {
        int value = this.array[0];
        int index = 0;

        for (int i = 0; i < this.array.length; i++) {
            boolean checkMin = this.array[i] < value;
            boolean checkMax = this.array[i] > value;
            boolean check = isMin ? checkMin : checkMax;

            if (check) {
                value = this.array[i];
                index = i;
            }
        }

        String message = isMin ? "Min: " : "Max: ";
        System.out.println(message + value + "(index - " + index + ")");
    }

    public void getZeroElements() {
        int count = 0;

        for (int i : this.array) {
            if (i == 0) {
                count++;
            }
        }

        System.out.println(count != 0 ? "Number of zero elements: " + count : "No null elements");
    }

    public void swapElements() {
        for (int i = 0; i < this.array.length / 2; i++) {
            int element = this.array[i];
            int elementOppositeIndex = this.array.length - 1 - i;

            this.array[i] = this.array[elementOppositeIndex];
            this.array[elementOppositeIndex] = element;
        }
    }

    public void arrayIsSequence() {
        for (int i = 0; i < this.array.length; i++) {
            if (i + 1 < this.array.length) {
                if (array[i + 1] < array[i]) {
                    System.out.println("isn't Sequence");
                    return;
                }
            } else if (array[i - 1] > array[i]) {
                System.out.println("isn't Sequence");
                return;
            }
        }

        System.out.println("is Sequence");
    }


    // TODO: как упростить алгоритм?
    public void addOne() {
        int lastItem = this.array[this.array.length - 1];
        final int N = 9;

        if (lastItem == N) {
            this.array[this.array.length - 1] = 0;

            for (int i = this.array.length - 2; i >= 0; i--) {
                if (this.array[i] == N) {
                    this.array[i] = 0;
                } else {
                    this.array[i] += 1;
                    return;
                }
            }

            if (this.array[0] == 0) {
                this.array = new int[this.array.length + 1];
                this.array[0] = 1;
                for (int i = 1; i < this.array.length; i++) {
                    this.array[i] = 0;
                }
            }
        } else {
            this.array[this.array.length - 1] += 1;
        }
    }
}
