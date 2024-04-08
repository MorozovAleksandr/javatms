package homeWork.L8HW;

public class Tiger extends Animal {
    void voice() {
        System.out.println("Говорит Tiger");
    }

    void eat(Foods food) {
        if (Foods.MEAT.equals(food)) {
            System.out.println("Я тигр и люблю мясо");
        } else {
            System.out.println("Люблю только мясо");
        }
    }
}
