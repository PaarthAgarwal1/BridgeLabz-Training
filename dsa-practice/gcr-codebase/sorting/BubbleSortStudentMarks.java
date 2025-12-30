public class BubbleSortStudentMarks {

    // Bubble sort method
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap if order is wrong
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // Stop if array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 32, 67};

        bubbleSort(marks);

        // Print sorted marks
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
