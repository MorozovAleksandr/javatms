package homeWork.L7HW;

import homeWork.L7HW.task1.Clinic;
import homeWork.L7HW.task1.Patient;
import homeWork.L7HW.task1.types.TreatmentCode;
import homeWork.L7HW.task2.Apple;

import java.lang.reflect.Field;

public class L7HW {
    public static void main(String[] args) {
        task1();

        additionalTask();
    }

    public static void task1() {
        Clinic clinic = new Clinic();
        Patient patient = new Patient("Петька");

        clinic.firstAppointment(TreatmentCode.CODE_2, patient);

        System.out.println(patient.getName());
        System.out.println(patient.getCurrentDoctor().getName());
        System.out.println(patient.getCurrentTreatmentPlan());
    }

    public static void additionalTask() {
        Apple apple = new Apple();

        // Рефлексия
        try {
            // Получаем поле
            Field field = apple.getClass().getDeclaredField("COLOR");

            // Получаем доступ для работы с ним
            field.setAccessible(true);

            field.set(apple, "green");
            String name = (String) field.get(apple);

            System.out.println(name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
