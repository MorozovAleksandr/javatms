package homeWork.L4HW;

public class L4HW {
    public static void main(String[] args) {
        task1();
        //task23();
        //task4();
        //task5();
        //task6();

        //additionalTask();
    }

    public static void task1() {
        CustomArray customArray = new CustomArray(false);
        customArray.displayArray(false);
        customArray.displayArray(true);
    }

    public static void task23() {
        CustomArray customArray = new CustomArray(false);
        customArray.getMinMax(true);
        customArray.getMinMax(false);
    }

    public static void task4() {
        CustomArray customArray = new CustomArray(false);
        customArray.getZeroElements();
    }

    public static void task5() {
        CustomArray customArray = new CustomArray(false);
        customArray.swapElements();
        customArray.displayArray(false);
    }

    public static void task6() {
        CustomArray customArray = new CustomArray(false);
        customArray.arrayIsSequence();
    }

    public static void additionalTask() {
        CustomArray customArray = new CustomArray(false);
        customArray.addOne();
        customArray.displayArray(false);
    }
}
