// 206. Reverse Linked List
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p2 = head;
        ListNode p3 = head.next;
        while(p3 != null){
            ListNode temp = p3.next;
            p3.next = p2;
            p2 = p3;
            p3 = temp;
        }
        head.next = null;
        return p2;
    }
}
