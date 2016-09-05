package NumberOf1_11;

/**
 * Created by Cynric on 9/5/16.
 * http://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count += 1;
        }

        return count;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.NumberOf1(7));
        System.out.println(solution.NumberOf1(-2147483648));
        System.out.println(solution.NumberOf1(-1));
    }
}
