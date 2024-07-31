/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Agar kisi list ka head null hai, to intersection nahi mil sakta
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while(a != b) {
            // Agar pointer `a` null hai (List A ka end ho gaya hai)
            if (a == null) {
                a = headB;  // To `a` ko List B ke head pe set kar do
            } else {
                a = a.next;  // Warna, List A mein agle node pe move karo
            }
            
            // Agar pointer `b` null hai (List B ka end ho gaya hai)
            if (b == null) {
                b = headA;  // To `b` ko List A ke head pe set kar do
            } else {
                b = b.next;  // Warna, List B mein agle node pe move karo
            }
        }

        // Agar intersection hai, to `a` (ya `b`) wahi node return karega
        return a;
    }
}
