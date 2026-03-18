import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Festival{
    String name;
    String location;
    int date;
    Festival(String name,String location,int date){
        this.name=name;
        this.location=location;
        this.date=date;
    }
}
class Music extends Festival{
    String headliner;
    String musicGenere;
    int ticketPrice;
    Music(String name,String location,int date,String headliner,String musicGenere,int ticketPrice){
        super(name,location,date);
        this.headliner=headliner;
        this.musicGenere=musicGenere;
        this.ticketPrice=ticketPrice;
    }
    @Override
    public String toString(){
        return "Festival Name: "+name+"\nLocation: "+location+"\nDate: "+date+"\nHeadliner: "+headliner+"\nMusic Genre: "+musicGenere+"\nTicket Price: "+ticketPrice;
    }
}
class Food extends Festival{
    String cuisine;
    int numStalls;
    int entryFee;
    Food(String name,String location,int date,String cuisine,int numStalls,int entryFee){
        super(name,location,date);
        this.cuisine=cuisine;
        this.numStalls=numStalls;
        this.entryFee=entryFee;
    }
    @Override
    public String toString(){
        return "Festival Name: "+name+"\nLocation: "+location+"\nDate: "+date+"\nCuisine: "+cuisine+"\nNumber of Stalls: "+numStalls+"\nEntry Fee: "+entryFee;
    }
}
class Art extends Festival{
    String artType;
    int numArtists;
    int exhibitionFee;
    Art(String name,String location,int date,String artType,int numArtists,int exhibitionFee){
        super(name,location,date);
        this.artType=artType;
        this.numArtists=numArtists;
        this.exhibitionFee=exhibitionFee;
    }
    @Override
    public String toString(){
        return "Festival Name: "+name+"\nLocation: "+location+"\nDate: "+date+"\nArt Type: "+artType+"\nNumber of Artists: "+numArtists+"\nExhibition Fee: "+exhibitionFee;
    }
}

class EventPlannerFestivalManger{
    List<Festival> festivals=new ArrayList<>();

    public void addFestival(String[] festivalParts){
        if(festivalParts[1].equals("MUSIC")){
            Music music=new Music(festivalParts[2],
                    festivalParts[3],
                    Integer.parseInt(festivalParts[4]),
                    festivalParts[5],
                    festivalParts[6],
                    Integer.parseInt(festivalParts[7]));
            festivals.add(music);
        }
        if(festivalParts[1].equals("FOOD")){
            Food food=new Food(festivalParts[2],
                    festivalParts[3],
                    Integer.parseInt(festivalParts[4]),
                    festivalParts[5],
                    Integer.parseInt(festivalParts[6]),
                    Integer.parseInt(festivalParts[7]));
            festivals.add(food);
        }
        if(festivalParts[1].equals("ART")){
            Art art=new Art(festivalParts[2],
                    festivalParts[3],
                    Integer.parseInt(festivalParts[4]),
                    festivalParts[5],
                    Integer.parseInt(festivalParts[6]),
                    Integer.parseInt(festivalParts[7]));
            festivals.add(art);
        }
    }
    public void displayDetails(String festivalName){
        for (Festival f:festivals){
            if(f.name.equalsIgnoreCase(festivalName)){
                System.out.println(f);
            }
        }
    }
}
public class EventPlannerFestivalManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EventPlannerFestivalManger epfm=new EventPlannerFestivalManger();
        while (sc.hasNextLine()){
            String str=sc.nextLine();
            if(str.equalsIgnoreCase("EXIT")){
                break;
            }
            String parts[]=str.split(" ");
            if(parts[0].equals("ADD_FESTIVAL")){
                epfm.addFestival(parts);
            }
            if(parts[0].equalsIgnoreCase("DISPLAY_DETAILS")){
                epfm.displayDetails(parts[1]);
            }
        }
    }
}
