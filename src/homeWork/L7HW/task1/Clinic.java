package homeWork.L7HW.task1;

import homeWork.L7HW.task1.types.IDoctor;
import homeWork.L7HW.task1.types.ITherapist;
import homeWork.L7HW.task1.types.TreatmentCode;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private final List<IDoctor> doctors;

    public Clinic() {
        this.doctors = new ArrayList<>();

        doctors.add(new Surgeon());
        doctors.add(new Dentist());
        doctors.add(new Therapist());
    }

    public void firstAppointment(TreatmentCode treatmentCode, Patient patient) {
        ITherapist therapist = null;

        for (IDoctor doctor : doctors) {
            if (doctor instanceof Therapist) {
                therapist = (ITherapist) doctor;
            }
        }

        assert therapist != null;

        IDoctor currentDoctor = therapist.appointDoctor(treatmentCode);
        patient.setTreatmentPlan(currentDoctor.treat(), currentDoctor);
    }
}
