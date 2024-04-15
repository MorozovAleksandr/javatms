package homeWork.L9HW;

import homeWork.L9HW.additionalTask.SomeClass;
import homeWork.L9HW.task1.AbstractWorker;
import homeWork.L9HW.task1.Accountant;
import homeWork.L9HW.task1.Director;
import homeWork.L9HW.task1.Worker;
import homeWork.L9HW.task2.AbstractFigure;
import homeWork.L9HW.task2.Circle;
import homeWork.L9HW.task2.Rectangle;
import homeWork.L9HW.task2.Triangle;

public class L9HW {
    public static void main(String[] args) throws CloneNotSupportedException {
        // task1();

        // task2();

        additionalTask();
    }

    public static void task1() {
        AbstractWorker[] workers = new AbstractWorker[]{new Worker(), new Director(), new Accountant()};

        for (AbstractWorker worker : workers) {
            worker.printingJobTitle();
        }
    }

    public static void task2() {
        AbstractFigure[] figures = new AbstractFigure[]{new Circle(5.0), new Rectangle(3.0, 4.0), new Triangle(4.0, 5.0, 6.0, 7.0), new Circle(6.0), new Circle(7.0)};

        double sumPerimeter = 0;

        for (AbstractFigure figure : figures) {
            sumPerimeter += figure.getPerimeter();
        }

        System.out.println(sumPerimeter);
    }

    public static void additionalTask() throws CloneNotSupportedException {
        SomeClass someClass = new SomeClass();
        someClass.x = 5;

        // клонируем
        SomeClass cloneClass = (SomeClass) someClass.clone();

        System.out.println(cloneClass.x);
        System.out.println(cloneClass.y);
    }
}
