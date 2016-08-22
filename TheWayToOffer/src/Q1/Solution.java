package Q1;

/**
 * Created by Cynric on 8/21/16.
 */
public class Solution {
    public boolean Find(int[][] array, int target) {
        int m = array.length;
        int n = array[0].length;

        int i = m - 1;
        int j = 0;

        while (i >= 0 && j < n) {
            int val = array[i][j];

            if (val < target) {
                j += 1;
            } else if (val > target) {
                i -= 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
