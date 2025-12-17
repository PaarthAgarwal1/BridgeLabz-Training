// Program to generate Pascal's Triangle
// for a given number of rows.
import java.util.*;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // fill values for the current row
            for (int j = 0; j <= i; j++) {

                // first and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // sum of the two values just above this position
                    int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    row.add(val);
                }
            }

            // add the completed row to result
            result.add(row);
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // try generating a few rows
        int numRows = 5;
        List<List<Integer>> triangle = sol.generate(numRows);

        // print row by row
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
