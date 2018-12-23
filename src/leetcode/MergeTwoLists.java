package leetcode;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dumpNode = new ListNode(0);
        ListNode currentNode = dumpNode;
        while (l1 != null || l2 != null) {
            if (l1 == null || (l2 != null && l1.val > l2.val)) {
                currentNode.next = new ListNode(l2.val);
                currentNode = currentNode.next;
                l2 = l2.next;
            } else {
                currentNode.next = new ListNode(l1.val);
                currentNode = currentNode.next;
                l1 = l1.next;
            }
        }
        return dumpNode.next;

    }
}
