package Q6;

/**
 * Created by Cynric on 8/22/16.
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minNumberInRotateArray(new int[]{3, 4, 5, 1, 2, 3}));
    }

    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;
        int middle = 0;

        while (array[left] >= array[right]) {

            if (left + 1 == right) {
                middle = right;
                break;
            }

            middle = (left + right) / 2;

            int mVal = array[middle];
            int lVal = array[left];
            int rVal = array[right];

            if (lVal == rVal && lVal == mVal) {
                return minNumber(array, left, right);
            }


            if (mVal >= lVal) {
                left = middle;
            } else {
                right = middle;
            }

        }
        return array[middle];
    }

    public int minNumber(int[] array, int left, int right) {
        int min = array[left];
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

}