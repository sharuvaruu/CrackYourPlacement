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
    public ListNode deleteDuplicates(ListNode head) {
        // Agar head null hai, to directly return kar do
        if(head == null){
            return head;
        }
        
        // Current node ko head se initialize karo
        ListNode current = head;
        
        // Jab tak next node exist karti hai
        while(current.next != null){
            // Agar current node ka value aur next node ka value same hai to next node ko skip kar do
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else {
                // Agar values alag hain to current node ko aage badhao
                current = current.next;
            }
        }
        
        // Modified linked list ka head return karo
        return head;
    }
}
