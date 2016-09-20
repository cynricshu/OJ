package FindKthToTail_14;

/**
 * Created by Cynric on 9/20/16.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode curr = head;
        ListNode kthPos = head;

        for (int i = 1; i < k; i++) {
            if (kthPos.next != null) {
                kthPos = kthPos.next;
            } else {
                return null;
            }
        }

        while (kthPos.next != null) {
            curr = curr.next;
            kthPos = kthPos.next;
        }

        return curr;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for (int i = 2; i <=5; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        Solution solution = new Solution();
        System.out.println(solution.FindKthToTail(head, 1).val);
    }
}
