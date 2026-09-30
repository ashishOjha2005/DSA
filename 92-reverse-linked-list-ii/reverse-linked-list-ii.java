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
        while(left<right){
            ListNode temp1=head;
        ListNode temp2=head;
        for(int i=1;i<=left-1;i++){
            temp1=temp1.next;
        }
        for(int i=1;i<=right-1;i++){
            temp2=temp2.next;
        }
        if(temp1!=null&&temp2!=null){
        int x=temp1.val;
        temp1.val=temp2.val;
        temp2.val=x;
        }
        left++;
        right--;
        }

        return head;
    }
}