public boolean validPalindrome(String s) {
    // Starting aur ending indices initialize karte hain
    int i = 0, j = s.length() - 1;

    // Loop jab tak start index chhota hai end index se
    while (i < j) {
        // Agar characters match nahi karte
        if (s.charAt(i) != s.charAt(j)) {
            // Do tarike se check karte hain:
            // 1. i character ko hata ke check karte hain (i+1 to j)
            // 2. j character ko hata ke check karte hain (i to j-1)
            return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        // Agar characters match karte hain to indices ko move karte hain
        i++;
        j--;
    }

    // Agar pura string match kar gaya, to true return karte hain
    return true;
}

/* Check karte hain ki s[i...j] ek palindrome hai ya nahi. */
private boolean isPalindrome(String s, int i, int j) {
    // Loop jab tak start index chhota hai end index se
    while (i < j) {
        // Agar characters match nahi karte
        if (s.charAt(i) != s.charAt(j)) {
            return false; // Agar match nahi kiya to palindrome nahi hai
        }
        // Agar characters match karte hain to indices ko move karte hain
        i++;
        j--;
    }
    // Agar pura substring match kar gaya, to true return karte hain
    return true;
}
