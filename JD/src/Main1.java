import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Cynric on 9/5/16.
 */
public class Main1 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int[] a = new int[]{4, 7};
        while (cin.hasNextInt()) {
            int count = cin.nextInt();
            int[] res = new int[2 ^ 31];
            for (int i = 0; i < count; i++) {
                int input = cin.nextInt();
                int[] ret = findN(input);
                List<int[]> l = combine(a, ret[0]);
                System.out.println(getNumber(l.get(ret[1])));
            }
        }
//
//        System.out.println(findN(5));
//        System.out.println(findN(100));

//        int[] a = {4, 7};
//        int n = 3;
//        List<int[]> l = combine(a, n);
//        System.out.println(l.toString());
    }

    public static String getNumber(int[] a) {
        String s = "";
        for (int i : a) {
            s += i;
        }
        return s;
    }

    public static int[] findN(int input) {
        int sum = 0;
        int lastSum = 0;
        int i = 1;
        do {
            lastSum = sum;
            sum = sum + (int) Math.pow(2, i);
            i++;
        } while (sum < input);
        int index = input - lastSum - 1;
        return new int[]{i - 1, index};
    }


    public static List combine(int[] a, int n) {

        List<int[]> res = new ArrayList<>(2 ^ n);
        getCombination(a, n, res, new int[n], 0, 0);
        return res;
    }

    public static void getCombination(int[] a, int n, List<int[]> res, int[] temp, int index, int size) {
        if (index < n) {
            for (int i = 0; i < a.length; i++) {
                temp[index] = a[i];
                getCombination(a, n, res, Arrays.copyOf(temp, n), index + 1, size + 1);
            }
        } else {
            res.add(temp);
            return;
        }
    }

}
