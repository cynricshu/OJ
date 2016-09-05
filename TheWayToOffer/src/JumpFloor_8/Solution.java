package JumpFloor_8;

/**
 * Created by Cynric on 8/23/16.
 */
public class Solution {
    public int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }

        int f = 1;
        int g = 2;

        for (int i = 2; i <= target; i++) {
            g += f;
            f = g - f;

        }
        return f;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.JumpFloor(0));
        System.out.println(solution.JumpFloor(3));
        System.out.println(solution.JumpFloor(4));
    }
}
