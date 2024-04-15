package homeWork.L9HW;

import homeWork.L9HW.task1.AbstractWorker;
import homeWork.L9HW.task1.Accountant;
import homeWork.L9HW.task1.Director;
import homeWork.L9HW.task1.Worker;

public class L9HW {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        AbstractWorker[] workers = new AbstractWorker[]{new Worker(), new Director(), new Accountant()};

        for (AbstractWorker worker : workers) {
            worker.printingJobTitle();
        }
    }
}
