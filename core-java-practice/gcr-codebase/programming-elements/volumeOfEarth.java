public class VolumeOfEarth {
    public static void main(String[] args) {
        int radiusKm = 6378;// Radius of the Earth in kilometers (given in question)
        double radiusMiles = Math.round(radiusKm * 0.621371 * 100.0) / 100.0;
        double volumeKM = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKM + " and cubic miles is " + volumeMiles);
    }
}
