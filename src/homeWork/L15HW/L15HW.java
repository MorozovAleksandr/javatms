package homeWork.L15HW;

import homeWork.L15HW.task2.Animals;
import homeWork.L15HW.task3.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class L15HW {
    public static void main(String[] args) {
        // task1();
        // task2();

        task3();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        String[] numbers = scanner.nextLine().replace(",", "").split(" ");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));

        System.out.println(linkedHashSet);
    }

    public static void task2() {
        Animals animals = new Animals(new String[]{"Tiger", "Cat"});
        System.out.println(animals);

        animals.add("Pig");
        System.out.println(animals);

        animals.remove();
        System.out.println(animals);
    }

    public static void expelStudents(ArrayList<Student> students) {
        final double MINIMUM_AVERAGE_GRADE = 3.0;
        students.removeIf(student -> student.getAverageGrade() < MINIMUM_AVERAGE_GRADE);
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void task3() {
        ArrayList<Student> students = new ArrayList<>();

        Student vasya = new Student("Vasya", "13371488", 1);
        vasya.addSubjectGrade("Math", 5);
        vasya.addSubjectGrade("Chemistry", 7);

        Student petka = new Student("petka", "13371488", 1);
        petka.addSubjectGrade("Math", 2);
        petka.addSubjectGrade("Chemistry", 3);

        Student dimka = new Student("dimka", "1337", 2);
        dimka.addSubjectGrade("Math", 4);
        dimka.addSubjectGrade("Chemistry", 3);

        students.add(vasya);
        students.add(petka);
        students.add(dimka);

        expelStudents(students);

        System.out.println(students);

        printStudents(students, 1);
    }
}
