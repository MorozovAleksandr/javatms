package homeWork.L8HW;

public class Dog extends Animal {
    private static final Dog INSTANCE = new Dog();

    private Dog() {
    }

    void voice() {
        System.out.println("Говорит Dog");
    }

    void eat(Foods food) {
        if (Foods.MEAT.equals(food)) {
            System.out.println("Я песик и люблю мясо");
        } else {
            System.out.println("Люблю только мясо");
        }
    }

    public static Dog getInstance() {
        return INSTANCE;
    }
}
