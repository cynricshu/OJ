package Q2;

/**
 * Created by Cynric on 8/21/16.
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer retBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == ' ') {
                retBuffer.append("%20");
            } else {
                retBuffer.append(a);
            }

        }
        return retBuffer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.replaceSpace(new StringBuffer("We Are Happy")));
    }
}