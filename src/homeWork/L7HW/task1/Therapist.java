package homeWork.L7HW.task1;

import homeWork.L7HW.task1.types.IDoctor;
import homeWork.L7HW.task1.types.ITherapist;
import homeWork.L7HW.task1.types.TreatmentCode;

public class Therapist implements IDoctor, ITherapist {
    public String treat() {
        return "Дал таблеточки";
    }

    public String getName() {
        return "Терапевт";
    }

    public IDoctor appointDoctor(TreatmentCode treatmentCode) {
        return switch (treatmentCode) {
            case CODE_1 -> new Surgeon();
            case CODE_2 -> new Dentist();
            case ANY_CODE -> new Therapist();
        };
    }
}
