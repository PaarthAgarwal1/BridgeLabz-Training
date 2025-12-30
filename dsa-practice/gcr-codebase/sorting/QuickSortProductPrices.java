public class QuickSortProductPrices {

    // Quick sort method
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            // Find pivot position
            int pi = partition(prices, low, high);

            // Sort left part
            quickSort(prices, low, pi - 1);

            // Sort right part
            quickSort(prices, pi + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;

        // Place smaller elements on left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {1200, 750, 1800, 500, 999};

        quickSort(prices, 0, prices.length - 1);

        // Print sorted prices
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
