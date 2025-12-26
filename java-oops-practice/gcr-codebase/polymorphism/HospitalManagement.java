import java.util.ArrayList;

// Defining the medical record interface
interface MedicalRecord {
    // Adding a new record string
    void addRecord(String record);
    
    // Viewing existing records
    void viewRecords();
}

// Defining the abstract Patient class
abstract class Patient {
    // Encapsulating patient details
    private String patientId;
    private String name;
    private int age;
    
    // Protecting sensitive diagnosis data
    private ArrayList<String> diagnosisHistory = new ArrayList<>();

    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Adding to protected diagnosis list
    protected void addDiagnosis(String diagnosis) {
        diagnosisHistory.add(diagnosis);
    }

    // Accessing diagnosis history
    protected void showDiagnosis() {
        System.out.println("Medical History: " + diagnosisHistory);
    }

    // Calculating the bill abstractly
    abstract double calculateBill();

    // Getting basic details
    void getPatientDetails() {
        System.out.println("ID: " + patientId + " | Name: " + name + " | Age: " + age);
    }
}

// Extending for InPatients
class InPatient extends Patient implements MedicalRecord {
    double dailyRoomCharge;
    int daysAdmitted;

    InPatient(String id, String name, int age, double dailyRoomCharge, int days) {
        super(id, name, age);
        this.dailyRoomCharge = dailyRoomCharge;
        this.daysAdmitted = days;
    }

    @Override
    double calculateBill() {
        return dailyRoomCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        // Calling protected method from parent
        addDiagnosis(record);
    }

    @Override
    public void viewRecords() {
        showDiagnosis();
    }
}

// Extending for OutPatients
class OutPatient extends Patient implements MedicalRecord {
    double consultationFee;

    OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addDiagnosis(record);
    }

    @Override
    public void viewRecords() {
        showDiagnosis();
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        // Creating an InPatient
        InPatient p1 = new InPatient("P001", "John Doe", 45, 200.0, 5);
        
        // Adding medical records
        p1.addRecord("Admitted for surgery.");
        p1.addRecord("Recovering well.");

        // Creating an OutPatient
        OutPatient p2 = new OutPatient("P002", "Jane Smith", 30, 150.0);
        p2.addRecord("Flu consultation.");

        // Displaying details for p1
        p1.getPatientDetails();
        p1.viewRecords();
        System.out.println("Total Bill: $" + p1.calculateBill());
        System.out.println("-------------------");

        // Displaying details for p2
        p2.getPatientDetails();
        p2.viewRecords();
        System.out.println("Total Bill: $" + p2.calculateBill());
    }
}
