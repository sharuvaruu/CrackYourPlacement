public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // Ek naya node create karte hain jo merged list ka start point hoga
    ListNode prehead = new ListNode(-1);
    // 'cur' pointer ko prehead pe set karte hain
    ListNode cur = prehead;

    // Jab tak dono lists null nahi hote, comparison karte hain
    while (l1 != null && l2 != null) {
        // Agar l1 ka current value l2 ke current value se chhota ya barabar hai
        if (l1.val <= l2.val) {
            // current node ke next ko l1 ke node pe set karte hain
            cur.next = l1;
            // l1 ko aage badhate hain
            l1 = l1.next;
        } else {
            // Agar l2 ka value chhota hai, current node ke next ko l2 ke node pe set karte hain
            cur.next = l2;
            // l2 ko aage badhate hain
            l2 = l2.next;
        }
        // cur ko aage badhate hain
        cur = cur.next;
    }

    // Agar koi ek list bacha hai, use directly current node ke next pe set karte hain
    cur.next = l1 == null ? l2 : l1;

    // prehead ka next hi actual merged list ka start point hai
    return prehead.next;
}
