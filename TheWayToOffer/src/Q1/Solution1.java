package Q1;

/**
 * Created by Cynric on 8/21/16.
 * 思路: 先在第一列中找,找到那些第一个元素小于target的,大于target的直接排除
 * 这样我们就得到了一个行的列表,然后对每行使用二分查找,就可以找到target
 */
public class Solution1 {
    private int m = 0;
    private int n = 0;

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

    }

    public boolean Find(int[][] array, int target) {
        m = array.length; // row number
        n = array[0].length; // column number

        if (array[0][0] > target) {
            return false;
        }
        if (array[0][0] == target) {
            return true;
        }

        int[] colRange = getColRange(array, 0, n, target);

        if (colRange[0] == -1 && colRange[1] == -1) {
            return true;
        }

        for (int rowIndex = colRange[0]; rowIndex <= colRange[1]; rowIndex++) {
            if (array[rowIndex][n] < target) {
                continue;
            } else if (array[rowIndex][n] == target) {
                return true;
            } else {
                return find(array, rowIndex, target);
            }
        }

        return false;
    }


    public int[] getColRange(int[][] array, int min, int max, int target) {
        int low = min;
        int high = max;
        int middle = (low + high) / 2;

        while (middle <= high) {
            if (array[middle][0] < target) {
                low = middle;
                middle = (middle + high) / 2;
            } else if (array[middle][0] == target) {
                return new int[]{-1, -1};
            } else {
                high = middle - 1;
                middle = Math.max(low + 1, (low + high) / 2);
            }
        }
        return new int[]{min, middle};

    }

    public boolean find(int[][] array, int rowIndex, int target) {
        int low = 0;
        int high = n;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (array[rowIndex][middle] < target) {
                low = middle + 1;
            } else if (array[rowIndex][middle] > target) {
                high = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}