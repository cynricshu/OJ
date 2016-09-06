
/**
 * Created by Cynric on 9/5/16.
 */
public class Apples {
    public static int getInitial(int n) {
        for (int i = n + 1; ; i++) {
            int temp = i;
            int bear = n;
            while (bear > 0) {

                if (temp % n == 1) {
                    temp = temp - temp / n - 1;
                    bear--;
                } else {
                    break;
                }

            }
            if (bear == 0) {
                return i;
            }
        }
    }

    public static void main(String[] args) {
        Apples apples = new Apples();
        System.out.println(apples.getInitial(2));
        System.out.println(apples.getInitial(3));
    }
}
