// Program to return the indices of two numbers
// whose sum equals the target value.
import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;

        // check each pair once
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // when the pair matches the target
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break; // found the pair
                }
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // try with a small example
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = sol.twoSum(nums, target);

        System.out.println("Indices: " + res[0] + ", " + res[1]);
    }
}
