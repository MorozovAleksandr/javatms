package homeWork.L9HW.additionalTask;

// используем интерфейс маркер и переопределяем метод clone
public class SomeClass implements Cloneable {
    public int x = 2;
    public int y = 3;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
