import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Policy implements Comparable<Policy> {

    String policyNumber, holderName, coverageType;
    LocalDate expiryDate;
    double premium;

    public Policy(String pn, String hn, String ed, String ct, double p) {
        policyNumber = pn;
        holderName = hn;
        expiryDate = LocalDate.parse(ed);
        coverageType = ct;
        premium = p;
    }

    // Uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Policy p = (Policy) o;
        return Objects.equals(policyNumber, p.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    // Used by TreeSet to sort policies by expiry date
    @Override
    public int compareTo(Policy o) {
        return this.expiryDate.compareTo(o.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " expires on " + expiryDate;
    }
}

public class InsuranceSystem {

    public static void main(String[] args) {

        // Different Set implementations
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p1 = new Policy("P1", "A", "2026-02-01", "Health", 100);
        Policy p2 = new Policy("P2", "B", "2026-06-01", "Auto", 200);

        hashSet.add(p1);
        hashSet.add(p2);
        linkedSet.add(p1);
        linkedSet.add(p2);
        treeSet.add(p1);
        treeSet.add(p2);

        // Find policies expiring within 30 days
        System.out.println("Expiring soon:");
        LocalDate today = LocalDate.now();

        for (Policy p : hashSet) {
            long days = ChronoUnit.DAYS.between(today, p.expiryDate);
            if (days >= 0 && days <= 30) {
                System.out.println(p);
            }
        }

        // Simple performance check for HashSet search
        long start = System.nanoTime();
        hashSet.contains(p1);
        long end = System.nanoTime();

        System.out.println("HashSet Search Time: " + (end - start) + " ns");
    }
}
