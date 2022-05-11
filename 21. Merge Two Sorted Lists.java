// 21. Merge Two Sorted Lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode start = new ListNode();
        if( list1.val < list2.val){
            start = list1;
            list1 = list1.next;
        } else {
            start = list2;
            list2 = list2.next;
        }
        ListNode curr = start;
        while(list1 != null && list2 != null){
            while(list1 != null && list1.val <= list2.val){
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            }
            while(list2 != null && list1!= null && list2.val <= list1.val){
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }
        if(list1 != null && list2 == null){
            curr.next = list1;
            return start;
        }
        if(list1 == null && list2 != null){
            curr.next = list2;
            return start;
        }
        return start;
    }
}
