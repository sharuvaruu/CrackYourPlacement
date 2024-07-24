class Solution {
    public int longestrepeat(String s, int k) {
        // k -- the maximum number of characters you can replace
        int ans = 0; // variable to store the length of the longest valid substring

        int n = s.length(); // length of the input string
        for (char ch = 'A'; ch <= 'Z'; ch++) { // iterate over each character from 'A' to 'Z'
            int i = 0, j = 0, replaced = 0; // initialize two pointers and a counter for replacements
            while (j < n) { // slide the window until the end of the string
                if (s.charAt(j) == ch) {
                    // if the current character matches 'ch', expand the window to the right
                    j++;
                } else if (replaced < k) {
                    // if the current character does not match and we can still replace, expand the window to the right and increment the replaced counter
                    j++;
                    replaced++;
                } else if (s.charAt(i) == ch) {
                    // if the left character matches 'ch', just move the left pointer to the right
                    i++;
                } else {
                    // if the left character does not match and we are at the replacement limit, move the left pointer to the right and decrement the replaced counter
                    i++;
                    replaced--;
                }
                // update the answer with the maximum length of the valid substring found so far
                ans = Math.max(ans, j - i);
            }
        }
        return ans; // return the length of the longest valid substring
    }
}
