public class AddTwoNumber {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        ListNode p1 = l1, p2 = l2;
        int carry = 0;

        while (p1 != null || p2 != null) {
            int x = p1 != null ? p1.val : 0;
            int y = p2 != null ? p2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(2);
        p1.next = new ListNode(4);
        p1.next.next = new ListNode(3);

        ListNode p2 = new ListNode(2);
        p2.next = new ListNode(4);
        p2.next.next = new ListNode(3);

        ListNode listNode = new AddTwoNumber().addTwoNumbers(p1, p2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);

    }

}
