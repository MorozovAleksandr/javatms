package homeWork.L8HW;

public class L8HW {
    public static void main(String[] args) {
        // task1();

        additionalTask();
    }

    public static void task1() {
        Dog d = Dog.getInstance();
        d.voice();
        d.eat(Foods.GRASS);
        d.eat(Foods.MEAT);

        Tiger t = new Tiger();
        t.voice();
        t.eat(Foods.GRASS);
        t.eat(Foods.MEAT);

        Rabbit r = new Rabbit();
        r.voice();
        r.eat(Foods.GRASS);
        r.eat(Foods.MEAT);
    }

    public static void additionalTask() {
        // Signleton - паттерн который гарантирует единственный экземпляр класса(это полезно например для доступа к какому-то ресурсу или базе данных).
        // экземпляр класса создается во время его загрузки
        // Доступ к единственному классу мы имеем через метод.

        Dog d = Dog.getInstance();
        d.voice();
        d.eat(Foods.GRASS);
    }
}
