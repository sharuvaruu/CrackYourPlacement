// Definition for a Node.
class Node {
    int val;        // Node ki value
    Node next;      // Next node
    Node random;    // Random node

    // Constructor to initialize node with value
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        // Agar list empty hai, toh null return karenge
        if (head == null) {
            return null;
        }
        
        // Pehle loop mein, har node ke saath ek copy node banayenge
        Node curr = head;
        while (curr != null) {
            // Current node ki copy banai
            Node copy = new Node(curr.val);
            
            // Copy node ko current node ke next ke sath link kiya
            copy.next = curr.next;
            
            // Current node ke next ko copy node se link kiya
            curr.next = copy;
            
            // Move to the next original node
            curr = copy.next;
        }
        
        // Second loop mein, random pointers ko set karenge
        curr = head;
        while (curr != null) {
            // Agar current node ka random pointer hai, toh
            // copy node ke random pointer ko original node ke random node ke copy se link karenge
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            // Move to the next original node
            curr = curr.next.next;
        }
        
        // Third loop mein, original aur copied nodes ko separate karenge
        curr = head;
        Node newHead = head.next;      // New list ka head node
        Node newCurr = newHead;        // Current node in new list
        
        while (curr != null) {
            // Original list ka next pointer ko next original node se link karenge
            curr.next = curr.next.next;
            
            // New list ka next pointer ko next new node se link karenge
            if (newCurr.next != null) {
                newCurr.next = newCurr.next.next;
            }
            
            // Move to the next original and new nodes
            curr = curr.next;
            newCurr = newCurr.next;
        }
        
        // New list ka head return karenge
        return newHead;
    }
}
