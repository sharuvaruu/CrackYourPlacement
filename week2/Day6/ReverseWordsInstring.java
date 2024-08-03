class Solution {
    public String reverseWords(String s) {
        // Input string ko trim karte hain taaki leading aur trailing spaces hata sakein
        String[] str = s.trim().split("\\s+");

        // Output string ko initialize karte hain
        String out = "";

        // Words ko reverse order mein iterate karenge
        for (int i = str.length - 1; i > 0; i--) {
            // Current word aur space ko output string mein append karenge
            out += str[i] + " ";
        }

        // Pehle word ko output mein append karenge bina trailing space ke
        return out + str[0];
    }
}
