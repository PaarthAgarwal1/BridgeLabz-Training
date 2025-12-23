public class RandomStats {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random number between 1000 and 9999
            numbers[i] = 1000 + (int) (Math.random() * 9000);
        }

        return numbers;
    }

    // Method to find average, minimum, and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = (int) Math.min(min, num);
            max = (int) Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[] { average, min, max };
    }

    public static void main(String[] args) {

        int size = 5;
        // calling method for generating 5 four digits number 
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-Digit Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();
        // calling method for finding the average ,min and max of the radom generated five number 
        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\nAverage Value: " + result[0]);
        System.out.println("Minimum Value: " + (int) result[1]);
        System.out.println("Maximum Value: " + (int) result[2]);
    }
}
