class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev = head, curr = head.next;
        while (curr != null) {
            int val = gcd(prev.val, curr.val);
            ListNode node = new ListNode(val);
            prev.next = node;
            node.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
