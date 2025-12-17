// Program to find the single number in an array
// where every element appears twice except one.
class Solution {

    public int singleNumber(int[] nums) {

        // Using XOR to cancel out duplicates
        for (int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i];  // keep XORing with the first element
        }

        // whatever remains is the single number
        return nums[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // example values
        int[] arr = {4, 1, 2, 1, 2};

        int ans = sol.singleNumber(arr);
        System.out.println("Single element = " + ans);
    }
}
