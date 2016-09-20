import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Cynric on 9/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int target = sc.nextInt();
            List<Integer> primeList = getPrimeList(target);
            List<List<Integer>> res = new ArrayList<>();
            findCombination(primeList, 0, target, 0, new ArrayList<Integer>(), res);
            System.out.println(res.size());

        }

    }

    public static void findCombination(List<Integer> candidates, int candidate, int target,
                                       int lastSum, List<Integer> solution, List<List<Integer>> res) {
        if (candidate != 0) {
            lastSum += candidate;
            solution.add(candidate);
        }
        if (lastSum < target) {
            for (int i : candidates) {
                if (i >= candidate) {
                    List temp = new ArrayList(solution);
                    findCombination(candidates, i, target, lastSum, temp, res);
                }
            }
        } else if (lastSum == target) {
            res.add(solution);
        } else {
            return;
        }
    }

    public static List<Integer> getPrimeList(int max) {
        List<Integer> ret = new ArrayList<>();
        boolean[] isprime = new boolean[max + 1];
        for (int i = 0; i <= max; i++)
            isprime[i] = true;
        isprime[0] = isprime[1] = false;

        int n = (int) Math.ceil(Math.sqrt(max));
        for (int i = 0; i <= n; i++) {
            if (isprime[i])
                for (int j = 2 * i; j <= max; j = j + i)
                    isprime[j] = false;
        }
        int largest;

        for (largest = 3; largest <= max; largest++) {
            if (isprime[largest])
                ret.add(largest);
//                System.out.print(" " + largest);
        }
        return ret;
    }

}

