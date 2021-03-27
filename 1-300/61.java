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
    public ListNode rotateRight(ListNode head, int k) {
        // edge case
        if(head==null||head.next==null||k==0) return head;
        // calculate the length of list        
        ListNode temp = head;
        int l = 0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        if(k%l==0) return head;
        // find partion point
        int right_l = l-(k%l);        
        temp = head;
        ListNode pre = null;
        while(right_l!=0){
            pre = temp;
            temp = temp.next;
            right_l--;
        }
        // divide the list into two part
        pre.next = null;
        ListNode new_head = temp;
        while(temp.next!=null){
            temp = temp.next;
        }
        // concat two list
        temp.next = head;
        return new_head;
    
    }
}
