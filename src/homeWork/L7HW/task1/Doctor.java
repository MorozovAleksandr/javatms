package homeWork.L7HW.task1;

import homeWork.L7HW.task1.types.IDoctor;

public class Doctor implements IDoctor {
    public String treat() {
        return "Лечние";
    }

    public String getName() {
        return "Имя";
    }
}
