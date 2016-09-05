package RectCover_10;

/**
 * Created by Cynric on 8/26/16.
 * http://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution {
    public int RectCover(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        int f = 1;
        int g = 2;
        for (int i = 0; i < target - 1; i++) {
            g = f + g;
            f = g - f;
        }

        return f;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.RectCover(3));
        System.out.println(solution.RectCover(4));
        System.out.println(solution.RectCover(5));
    }


}