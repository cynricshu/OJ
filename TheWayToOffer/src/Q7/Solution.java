package Q7;

/**
 * Created by Cynric on 8/22/16.
 */
public class Solution {
    public int Fibonacci(int n) {

        int f = 0, g = 1;

        while (n-- > 0){
            g += f;
            f = g - f;
        }
        return f;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Fibonacci(5));
        System.out.println(solution.Fibonacci(0));
        System.out.println(solution.Fibonacci(1));

    }
}
