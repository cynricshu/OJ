package Power_12;

/**
 * Created by Cynric on 9/5/16.
 * http://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        if (exponent < 0) {
            return 1 / Power(base, -exponent);
        }

        if (exponent % 2 == 1) {
            return base * Power(base, exponent - 1);
        }

        return Power(base * base, exponent / 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Power(2, 5));
    }
}
