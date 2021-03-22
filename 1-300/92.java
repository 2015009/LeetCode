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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode new_head = new ListNode(-1);
        ListNode temp = new_head;
        temp.next = head;

        for(int i = 0; i<left-1;i++){// find point before start point
            temp = temp.next;
        }

        ListNode rightNode = temp;
        for(int i =0; i<right-left+1;i++){// find point after the point
            rightNode = rightNode.next;
        }

        ListNode start = temp.next;
        ListNode new_strat = rightNode.next;

        temp.next = null;
        rightNode.next=null;

        reverseLinkedList(start);

        temp.next = rightNode;
        start.next = new_strat;

        return new_head.next;        
    }
    private void reverseLinkedList(ListNode head) {
        
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

}
