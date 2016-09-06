import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Cynric on 9/5/16.
 */
public class Main {
    public static void main(String args[]) {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int count = cin.nextInt();
            int[] inputArray = new int[count];
            for (int i = 0; i < count; i++) {
                inputArray[i] = cin.nextInt();
            }

            for (int i = 0; i < count; i++) {
                int input = inputArray[i];
                int ret = 0;
                if (i == 0) {
                    ret = countLuckNum(1, input);
                } else {
                    int last = inputArray[i - 1];
                    ret = countLuckNum(last + 1, input) + map.get(last);
                }
                map.put(input, ret);
                System.out.println(ret);
            }
        }
//        System.out.println(fx(20));
//        System.out.println(fx(123));
//        System.out.println(gx(20));

    }

    public static int fx(int n) {
        int sum = 0;
        while (n > 10) {
            int i = n % 10;
            sum += i;
            n = (n - i) / 10;
        }
        sum += n;
        return sum;
    }

    public static int gx(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;

        }
        return count;
    }

    public static int countLuckNum(int start, int n) {
        int count = 0;
        for (int i = start; i <= n; i++) {
            if (fx(i) == gx(i)) {
                count += 1;
            }
        }
        return count;
    }
}
