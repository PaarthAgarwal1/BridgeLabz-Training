public class FootballTeamHeights {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150 to 250
        }
        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) Math.round(sum * 100/ heights.length)/100.0;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {

        int teamSize = 11;

        int[] heights = generateHeights(teamSize);

        System.out.println("Player Heights (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n");

        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
