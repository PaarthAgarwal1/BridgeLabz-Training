
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor{
    String name;
    String specialization;
    boolean isAvailable;

    public Doctor(String name, String specialization, boolean isAvailable) {
        this.name = name;
        this.specialization = specialization;
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString(){
        return "Doctor{name='" + name + "', specialization='" + specialization + "', isAvailable=" + isAvailable + "}";
    }
}
public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Neurology", false),
                new Doctor("Dr. Singh", "Orthopedics", true),
                new Doctor("Dr. Gupta", "Dermatology", true),
                new Doctor("Dr. Rao", "Neurology", true)
        );
        // Filter doctors avilable on weekend and Sorting on specialization
        List<Doctor> availableDoctors=doctors.stream().filter(doctor->doctor.isAvailable==true).sorted(Comparator.comparing(doctor->doctor.specialization)).toList();
        
        availableDoctors.forEach(System.out::println);
    }
    
}
