package homeWork.L8HW;

public class Rabbit extends Animal {
    void voice() {
        System.out.println("Говорит Rabbit");
    }

    void eat(Foods food) {
        if (Foods.GRASS.equals(food)) {
            System.out.println("Я кролик и люблю травку");
        } else {
            System.out.println("Люблю только травку");
        }
    }
}
