
import java.util.Arrays;
import java.util.List;

class Patient{
    String name;
    int id;

    Patient(String name, int id){
        this.name = name;
        this.id = id;
    }

    void printID() {
        System.out.println("Patient ID: " + id);
    }
}
public class HospitalPatientId {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
            new Patient("Vyomi", 101),
            new Patient("Paarth", 102),
            new Patient("Garvit", 103)
        );

        // Lambda to extract patient IDs
        patients.forEach(Patient::printID);
        
    }
    
}
