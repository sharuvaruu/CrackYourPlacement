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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0); // we create the start of a new linked list and initialize it to a value of 0
        ListNode tail = head; // the tail is the head when there is only 1 node
        int carry = 0;

        while (l1 != null || l2 != null || carry!= 0){
            int l1Value = (l1 != null) ? l1.val : 0; // if l1 is null, then set the addition value to 0
            int l2Value = (l2 != null) ? l2.val : 0; // if l2 is null, then set the addition value to 0

            int sum = l1Value + l2Value + carry;
            // the very first sum will have a carry of 0
            // all the other ones will be calculated below

            int digit = sum % 10;
            // for example: we have 6 + 7 = 11, then 13 % 10 = 3
            // this 3 is what is kept, the 1 will be added onto the sum of the next two values
            carry = sum / 10;
            // moving on with the example, we have 13 / 10 = 1 (.3 is truncated due to integer division)

            ListNode newNode = new ListNode(digit); // create the new node with the digit
            tail.next = newNode; // set the tail of the linked list to the new node that is created
            tail = tail.next; // iterate the linked list to the next node

            l1 = (l1 != null) ? l1.next : null; // we check if the next node is null -> if so, don't iterate
            l2 = (l2 != null) ? l2.next : null; // we check if the next node is null -> if so, don't iterate
        }

        ListNode result = head.next; // remember that our very first node was a value of 0, just to start off the linked list
        return result; // return the result
    }
}