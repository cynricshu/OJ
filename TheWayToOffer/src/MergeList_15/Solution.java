package MergeList_15;

/**
 * Created by Cynric on 24/09/2016.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode(-1);
        ListNode p = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                p = p.next;
                list1 = list1.next;
            } else {
                p.next = list2;
                p = p.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            p.next = list2;
        }

        if (list2 == null) {
            p.next = list1;
        }
        return head.next;
    }
}
