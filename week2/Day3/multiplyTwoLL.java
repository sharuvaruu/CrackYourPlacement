class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long num1 = 0, num2 = 0;
        long MOD = 1000000007;

        // Convert first linked list to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }

        // Convert second linked list to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }

        // Multiply the two numbers and return the result modulo 10^9 + 7
        return (num1 * num2) % MOD;
    
        
    }
}