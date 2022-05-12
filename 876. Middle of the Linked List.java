// 876. Middle of the Linked List

class Solution {
    public ListNode middleNode(ListNode head) {
        int i=0;
        ListNode curr = head;
        while( curr.next != null){
            curr = curr.next;
            i++;
        }
        if(i%2 == 1) i+=1;
        i = i/2;
        for(int j=0; j<i; j++){
            head = head.next;
        }
        return head;
    }
}
