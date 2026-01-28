

public class TemperatureAnalyzer {
    public static void analyze(float [][] temp){
        int hottestDay=0;
        int coldestDay=0;
        float maxTemp=Float.MIN_VALUE;
        float minTemp=Float.MAX_VALUE;

        for(int day=0;day<temp.length;day++){
            float sum=0;
            for(int hour=0;hour<temp[day].length;hour++){
                sum+=temp[day][hour];
                if(temp[day][hour]>maxTemp){
                    maxTemp=temp[day][hour];
                    hottestDay=day;
                }
                if(temp[day][hour]<minTemp){
                    minTemp=temp[day][hour];
                    coldestDay=day;
                }
            }
            System.out.println("Average temperature for day " + (day+1) + ": " + (sum/temp[day].length));
            
        }
        System.out.println("Hottest day: Day " + (hottestDay+1) + " with temperature " + maxTemp);
        System.out.println("Coldest day: Day " + (coldestDay+1) + " with temperature " + minTemp);
    }
    
    public static void main(String[] args) {
        float[][] temperatures = {
        // Day 1
        {18.2f, 18.0f, 17.8f, 17.5f, 17.3f, 17.6f, 18.5f, 20.1f,
        22.3f, 24.5f, 26.0f, 27.4f, 28.1f, 29.0f, 29.5f, 30.2f,
        29.8f, 28.6f, 26.9f, 24.7f, 22.8f, 21.0f, 20.0f, 19.1f},

        // Day 2
        {17.9f, 17.6f, 17.2f, 17.0f, 16.8f, 17.1f, 18.0f, 19.8f,
        21.9f, 24.0f, 25.6f, 27.0f, 28.0f, 28.7f, 29.1f, 29.8f,
        29.3f, 28.0f, 26.4f, 24.1f, 22.2f, 20.5f, 19.6f, 18.7f},

        // Day 3 (Hottest Day)
        {19.0f, 18.7f, 18.4f, 18.2f, 18.0f, 18.5f, 19.8f, 21.5f,
        23.8f, 26.0f, 28.2f, 30.1f, 31.5f, 32.8f, 33.6f, 34.2f,
        33.5f, 31.9f, 29.8f, 27.2f, 25.0f, 23.1f, 21.6f, 20.4f},

        // Day 4
        {16.8f, 16.5f, 16.2f, 16.0f, 15.8f, 16.1f, 17.0f, 18.7f,
        20.9f, 23.0f, 24.6f, 26.0f, 27.1f, 27.8f, 28.0f, 28.4f,
        27.9f, 26.7f, 25.1f, 22.8f, 21.0f, 19.4f, 18.5f, 17.6f},

        // Day 5
        {17.5f, 17.2f, 16.9f, 16.7f, 16.5f, 16.9f, 17.8f, 19.4f,
        21.6f, 23.7f, 25.2f, 26.6f, 27.5f, 28.1f, 28.6f, 29.0f,
        28.5f, 27.2f, 25.7f, 23.4f, 21.5f, 20.0f, 19.0f, 18.2f},

        // Day 6 (Coldest Day)
        {15.2f, 15.0f, 14.8f, 14.6f, 14.5f, 14.8f, 15.6f, 17.1f,
        19.2f, 21.0f, 22.6f, 24.0f, 25.0f, 25.6f, 26.0f, 26.4f,
        25.9f, 24.6f, 23.0f, 21.0f, 19.4f, 18.0f, 17.0f, 16.2f},

        // Day 7
        {18.0f, 17.8f, 17.5f, 17.3f, 17.1f, 17.5f, 18.6f, 20.2f,
        22.5f, 24.8f, 26.4f, 27.8f, 28.7f, 29.3f, 29.9f, 30.4f,
        29.8f, 28.5f, 26.8f, 24.5f, 22.6f, 21.0f, 20.1f, 19.2f}
        };
        analyze(temperatures);
    }
}
