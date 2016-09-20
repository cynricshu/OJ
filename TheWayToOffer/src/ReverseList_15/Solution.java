package ReverseList_15;

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
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode newHead = null;

        while (curr != null) {
            ListNode next = curr.next;
            if (curr.next == null) {
                newHead = curr;
            }
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for (int i = 2; i <=5; i++) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        Solution solution = new Solution();
        ListNode tail = solution.ReverseList(head);
        while (tail != null) {
            System.out.println(tail.val);
            tail = tail.next;
        }
    }
}
