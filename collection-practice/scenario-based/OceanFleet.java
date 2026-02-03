
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vessel{
    private String vesselId;
    private String vesselName;
    private double  averageSpeed;
    private String vesselType;

    public Vessel() {
    }

    public Vessel(String vesselId, String vesselName, double  averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }
    public String getVesselId(){
        return vesselId;
    }
    public String getVesselName(){
        return vesselName;
    }
    public double getVesselAverageSpeed(){
        return averageSpeed;
    }
    public String getVesselType(){
        return vesselType;
    }
    @Override
    public String toString(){
        return vesselId+" | "+vesselName+" | "+vesselType+" | "+averageSpeed+" knots";
    }
}
class VesselUtil{
    private List<Vessel> vesselList=new ArrayList<>();
    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String vesselId){
        for(Vessel vessel:vesselList){
            String currVesselId=vessel.getVesselId();
            if(currVesselId.equals(vesselId)){
                return vessel;
            }
        }
        return null;
    }
    public List<Vessel> getHighPerformanceVessels(){
        List<Vessel> result=new ArrayList<>();
        double maxSpeed=0;
        for(Vessel vessel:vesselList){
            if(vessel.getVesselAverageSpeed()>maxSpeed){
                maxSpeed=vessel.getVesselAverageSpeed();
            }
        }
        for(Vessel vessel:vesselList){
            if(vessel.getVesselAverageSpeed()==maxSpeed){
                result.add(vessel);
            }
        }
        return result;
    }
}
public class OceanFleet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VesselUtil util=new VesselUtil();
        System.out.println("Enter the number of vessels to be added");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter vessel details");
        for(int i=0;i<n;i++){
            String vessel=sc.nextLine();
            String[]data=vessel.trim().split(":");
            util.addVesselPerformance(new Vessel(data[0],data[1],Double.parseDouble(data[2]),data[3]));
        }
        System.out.println("Enter the Vessel Id to check speed");
        String vesselId=sc.nextLine();
        Vessel vessel=util.getVesselById(vesselId);
        if(vessel!=null){
            System.out.println(vessel.toString());
        }else{
            System.out.println("Vessel Id "+vesselId+" not found");
        }
        List<Vessel> highPerformancVessels=util.getHighPerformanceVessels();
        System.out.println("High performance vessels are");
        for(Vessel v:highPerformancVessels){
            System.out.println(v.toString());
        }

    }
}
