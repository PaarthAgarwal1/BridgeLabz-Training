
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class InsuranceClaim{
    String claimType;
    double amount;

    public InsuranceClaim(String claimType,double amount) {
        this.claimType=claimType;
        this.amount=amount;
    }
    public String getClaimType(){
        return claimType;
    }
    public double getAmount(){
        return amount;
    }
    
}
public class InsuranceAnalysis {
    public static void main(String[] args) {
        List<InsuranceClaim> claims=Arrays.asList(new InsuranceClaim("Health", 50000),
            new InsuranceClaim("Health", 30000),
            new InsuranceClaim("Vehicle", 20000),
            new InsuranceClaim("Vehicle", 40000),
            new InsuranceClaim("Life", 100000),
            new InsuranceClaim("Life", 80000),
            new InsuranceClaim("Travel", 15000)
        );
        Map<String,Double> avgClaimByType=claims.stream().collect(Collectors.groupingBy(InsuranceClaim::getClaimType,Collectors.averagingDouble(InsuranceClaim::getAmount)));
        avgClaimByType.forEach((type,avg)->System.out.println(type+" -> Average Claim: "+avg));
    }
}
