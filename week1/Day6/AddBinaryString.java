class Solution {
    public String addBinary(String a, String b) {
        int carry = 0; // carry ko initialize kar rahe hain 0 se
        String result = ""; // result string ko initialize kar rahe hain
        int i = 0; // index i ko initialize kar rahe hain
        int len1 = a.length(); // string a ki length ko len1 me store kar rahe hain
        int len2 = b.length(); // string b ki length ko len2 me store kar rahe hain
        
        // loop tab tak chalega jab tak i len1 ya len2 se chota ho ya carry 0 na ho
        while (i < len1 || i < len2 || carry != 0) {
            int x = 0; // x ko initialize kar rahe hain 0 se
            if (i < len1 && a.charAt(len1 - 1 - i) == '1') x = 1; // agar i len1 se chota hai aur a ke last se i-th character '1' hai to x = 1 set kar rahe hain
            int y = 0; // y ko initialize kar rahe hain 0 se
            if (i < len2 && b.charAt(len2 - 1 - i) == '1') y = 1; // agar i len2 se chota hai aur b ke last se i-th character '1' hai to y = 1 set kar rahe hain
            
            // x, y aur carry ka sum le kar uska remainder 2 se nikal rahe hain aur result string me concatenate kar rahe hain
            result = (x + y + carry) % 2 + result; 
            carry = (x + y + carry) / 2; // x, y aur carry ka sum le kar usko 2 se divide kar rahe hain aur carry update kar rahe hain
            i++; // index i ko increment kar rahe hain
        }
        return result; // final result ko return kar rahe hain
    }
}
