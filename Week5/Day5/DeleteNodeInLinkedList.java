/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;  // Yeh node ki value hai
 *     ListNode next;  // Yeh pointer hai jo agle node ko point karta hai
 *     ListNode(int x) { val = x; }  // Constructor jo value initialize karta hai
 * }
 */
class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        // Step 1: Agle node ki value ko iss node mein daalo
        // Hum iss node ki value ko agle node ki value se replace kar rahe hain
        // Taaki yeh node ab delete wali node jaisi dikhe
        node.val = node.next.val;

        // Step 2: Ab agle node ko skip karna hai, to agle node ke "next" pointer ko iss node ke next se link kar dete hain
        // Matlab, iss node ka next pointer agle wale node ke baad ke node ko point karega
        // Isse agla node list se effectively delete ho jaata hai
        node.next = node.next.next;
    }
}
