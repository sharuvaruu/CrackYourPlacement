class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Step 1: Create a dummy node `ans` which helps in easily handling edge cases
        // A dummy node is an extra node added before the actual head of the list.
        // It simplifies deletion of head and provides a non-null previous node for easy reference.
        ListNode ans = new ListNode();
        
        // `curr` will be used to construct the new list without nodes having the value `val`.
        ListNode curr = ans;

        // Step 2: Traverse the entire original list
        while (head != null) {  // Continue until the end of the list is reached.
            // Step 3: If the current node's value is not equal to `val`
            if (head.val != val) {
                // Include this node in the new list.
                curr.next = head;
                // Move `curr` to point to this newly added node.
                curr = curr.next;
            }
            // Step 4: Move `head` to the next node in the original list.
            head = head.next;
        }

        // Step 5: Terminate the new list.
        // If the last node(s) in the original list had value `val`, `curr` would be pointing to the
        // last node included in the new list, which should now be the end of the list.
        curr.next = null;

        // Step 6: Return the new list, skipping the dummy node.
        // `ans.next` points to the head of the new list.
        return ans.next;
    }
}
