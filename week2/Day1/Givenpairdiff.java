import java.util.Arrays;

class Solution {
    public int findPair(int n, int x, int[] arr) {
        // Array ko sort karte hain taki two-pointer approach use kar sakein
        Arrays.sort(arr);
        
        // Do pointers initialize karte hain
        int i = 0;
        int j = 1;
        
        // Array ko do pointers ke sath iterate karte hain
        while (j < n && i < n) {
            // Check karte hain agar dono elements ka difference x ke barabar hai
            if (arr[j] - arr[i] == x && i != j) {
                return 1; // Pair mil gaya, 1 return karte hain
            } 
            // Agar difference x se kam hai
            else if (arr[j] - arr[i] < x) {
                j++; // Second pointer ko increase karte hain taki difference bada sakein
            } 
            // Agar difference x se zyada hai
            else {
                i++; // First pointer ko increase karte hain taki difference ghata sakein
            }
        }
        
        // Agar koi pair nahi mila to -1 return karte hain
        return -1;
    }
}
