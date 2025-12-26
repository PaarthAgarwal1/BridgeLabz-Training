// Patient class
class Patient {
    private String patientName;

    Patient(String patientName) {
        this.patientName = patientName;
    }

    String getName() {
        return patientName;
    }
}

// Doctor class
class Doctor {
    private String doctorName;

    Doctor(String doctorName) {
        this.doctorName = doctorName;
    }

    // Communication between doctor and patient
    void consult(Patient patient) {
        System.out.println("Doctor " + doctorName + " is consulting patient " + patient.getName());
    }
}

// Hospital class
class Hospital {
    void startConsultation(Doctor doctor, Patient patient) {
        doctor.consult(patient);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Rao");
        Doctor d2 = new Doctor("Dr. Singh");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");

        Hospital hospital = new Hospital();

        hospital.startConsultation(d1, p1);
        hospital.startConsultation(d1, p2);
        hospital.startConsultation(d2, p1);
    }
}
