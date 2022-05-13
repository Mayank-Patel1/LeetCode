// 203. Remove Linked List Elements
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val == val){
            head=head.next;
        }
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
