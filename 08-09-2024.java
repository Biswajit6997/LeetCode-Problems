class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int d = size / k;
        int rem = size % k;

        ListNode[] ans = new ListNode[k];
        temp = head;
        int len = 0, j = 0;
        while (temp != null) {
            if (len == 0) {
                ans[j++] = temp;
            }

            ListNode next = temp.next;
            len++;

            int extra = rem > 0 ? 1 : 0;

            if (len == d + extra) {
                len = 0;
                rem--;
                temp.next = null;
            }
            temp = next;
        }

        return ans;
    }
}
