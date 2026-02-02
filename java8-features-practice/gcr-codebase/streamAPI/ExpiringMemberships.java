
import java.time.LocalDate;
import java.util.List;

class GymMember{
    String name;
    LocalDate expiryDate;

    public GymMember(String name,LocalDate expirDate) {
        this.name=name;
        this.expiryDate=expirDate;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    @Override
    public String toString(){
        return name+" -> Expiry Date: "+expiryDate;
    }
    
}
public class ExpiringMemberships {
    public static void main(String[] args) {
        List<GymMember> members = List.of(
            new GymMember("Amit", LocalDate.now().plusDays(10)),
            new GymMember("Neha", LocalDate.now().plusDays(25)),
            new GymMember("Rohit", LocalDate.now().plusDays(45)),
            new GymMember("Pooja", LocalDate.now().minusDays(5)), // already expired
            new GymMember("Rahul", LocalDate.now().plusDays(30))
        );
        LocalDate today=LocalDate.now();
        LocalDate next30Days=today.plusDays(30);
        members.stream().filter(m->!m.getExpiryDate().isBefore(today)).filter(m->!m.getExpiryDate().isAfter(next30Days)).forEach(System.out::println);
    }
    
}
