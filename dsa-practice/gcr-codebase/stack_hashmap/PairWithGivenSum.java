import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Pair found at indices: " +
                        map.get(complement) + " and " + i);
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}
