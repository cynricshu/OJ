package reOrderArray_13;

/**
 * Created by Cynric on 9/20/16.
 */
public class Solution {
    public void reOrderArray(int[] array) {
        int left = 0;

        int[] newArray = new int[array.length];
        int oddCount = 0;

        for (int i : array) {
            if (isOdd(i)) {
                newArray[oddCount] = i;
                oddCount++;
            }
        }

        for (int i : array) {
            if (!isOdd(i)) {
                newArray[oddCount] = i;
                oddCount++;
            }
        }

        for (int i = 0;i < array.length; i++) {
            array[i] = newArray[i];
        }

    }

    public boolean isOdd(int n) {
        return (n & 0x1) != 0; // 奇数的最后一位肯定是1，与上1就变成了0.
    }

    public static void main(String[] args) {

    }
}
