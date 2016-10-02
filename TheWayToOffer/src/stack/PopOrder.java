package stack;

import java.util.Stack;

/**
 * Created by Cynric on 02/10/2016.
 */
public class PopOrder {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        int aIndex = 0;
        int bIndex = 0;
        Stack<Integer> temp = new Stack<>();

        for (aIndex = 0; aIndex < pushA.length; aIndex++) {
            temp.push(pushA[aIndex]);
            if (popA[bIndex] == pushA[aIndex]) {
                temp.pop();
                bIndex++;
            }
        }

        if (pushA.length == 0) {
            return true;
        }

        for (int i = bIndex; i < popA.length; i++) {
            if (temp.pop() != popA[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        PopOrder popOrder = new PopOrder();
        int[] pushA = new int[]{1, 2, 3, 4, 5};
        int[] popA = new int[]{4, 5, 3, 2, 1};
        System.out.println(popOrder.IsPopOrder(pushA, popA));

        popA = new int[]{4, 3, 5, 1, 2};
        System.out.println(popOrder.IsPopOrder(pushA, popA));
    }
}
