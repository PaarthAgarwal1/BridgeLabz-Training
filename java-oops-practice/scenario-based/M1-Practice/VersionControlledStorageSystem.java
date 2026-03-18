import java.util.*;

class V{
    String version;
    int size;
    V(String version,int size){
        this.version=version;
        this.size=size;
    }
    @Override
    public String toString(){
        return version+" "+size;
    }
}
public class VersionControlledStorageSystem {
    public static HashMap<String , List<V>> mapVersion=new HashMap<>();
    public static HashMap<String,V> mapLatest=new HashMap<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            String [] parts=str.split(" ");
            if(parts[0].equals("UPLOAD")){
                upload(parts);
            }
            if(parts[0].equals("FETCH")){
                fetch(parts);
            }
            if(parts[0].equals("LATEST")){
                latest(parts);
            }
            if(parts[0].equals("TOTAL_STORAGE")){
                totalStorage(parts);
            }
        }
    }

    private static void totalStorage(String[] parts) {
        List<V> versions=mapVersion.get(parts[1]);
        int totalSize=0;
        for (V version:versions){
            totalSize+=version.size;
        }
        System.out.println(parts[1]+" "+totalSize);
    }

    private static void latest(String[] parts) {
        System.out.println(parts[1]+" "+mapLatest.get(parts[1]));
    }

    private static void fetch(String[] parts) {
        if(!mapVersion.containsKey(parts[1])){
            System.out.println("File Not Found");
        }else{
            List<V> versions=mapVersion.get(parts[1]);
            Collections.sort(versions,(a,b)->Integer.compare(a.size,b.size));
            for(V version:versions){
                System.out.println(parts[1]+" "+version);
            }
        }
    }

    private static void upload(String[] parts) {
        V version=new V(parts[2],Integer.parseInt(parts[3]));
        if(!mapVersion.containsKey(parts[1])){
            mapVersion.put(parts[1],new ArrayList<>());
        }
        if(!mapVersion.get(parts[1]).contains(version)){
            mapVersion.get(parts[1]).add(version);
            mapLatest.put(parts[1],version);
        }
    }
}
