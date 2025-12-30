public class InsertionSortEmployeeIDs {

    // Insertion sort method
    public static void insertionSort(int[] empIds) {
        int n = empIds.length;

        // Start from second element
        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;

            // Shift elements to make space
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert element at correct position
            empIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] empIds = {105, 102, 109, 101, 103};

        insertionSort(empIds);

        // Print sorted IDs
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
