class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node banate hain, jo linked list ka head ko point karega
        ListNode dummy = new ListNode(0);
        dummy.next = head; // Dummy ka next head par set karte hain
        
        ListNode slow = dummy; // Slow pointer ko dummy node par set karte hain
        ListNode fast = dummy; // Fast pointer ko bhi dummy node par set karte hain
        
        // Fast pointer ko n + 1 steps aage badhate hain
        // Taaki slow pointer uss node se pehle ho jab fast end par pahunchta hai
        for (int i = 0; i <= n; i++) {
            fast = fast.next; // Fast pointer ko aage badhao
        }
        
        // Ab dono pointers ko aage badhao jab tak fast null nahi hota
        while (fast != null) {
            fast = fast.next; // Fast pointer ko next node par le jao
            slow = slow.next; // Slow pointer ko bhi next node par le jao
        }
        
        // Slow pointer ke next ko skip karke nth node ko remove karte hain
        slow.next = slow.next.next;
        
        // Dummy ka next return karte hain, jo updated head hai
        return dummy.next; // Modified linked list ka head
    }
}
