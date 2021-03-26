class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // edge case
        if(head==null||head.next==null)
            return head;
        // normal case
        ListNode temp = head;
        while(temp!=null&&temp.next!=null){
            if(temp.next.val==temp.val){
                temp.next=temp.next.next;
            }else{
                temp = temp.next;
            }            
        }
        return head;
    }
}
