package homeWork.L15HW.task2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Animals {
    private final Deque<Animal> animals = new ArrayDeque<>();

    public Animals(String[] initAnimals) {
        for (String animal : initAnimals) {
            animals.add(new Animal(animal));
        }
    }

    public void add(String name) {
        animals.addFirst(new Animal(name));
    }

    public void remove() {
        try {
            animals.removeLast();
        } catch (NoSuchElementException e) {
            System.out.println("Животных нету");
        }

    }

    @Override
    public String toString() {
        return animals.toString();
    }
}
