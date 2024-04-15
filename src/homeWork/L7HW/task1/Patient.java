package homeWork.L7HW.task1;

import homeWork.L7HW.task1.types.IDoctor;

public class Patient {
    private final String name;
    private String currentTreatmentPlan;
    private IDoctor currentDoctor;

    public Patient(String name) {
        this.name = name;
    }

    public IDoctor getCurrentDoctor() {
        return currentDoctor;
    }

    public String getName() {
        return name;
    }

    public String getCurrentTreatmentPlan() {
        return currentTreatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan, IDoctor currentDoctor) {
        this.currentTreatmentPlan = treatmentPlan;
        this.currentDoctor = currentDoctor;
    }
}
