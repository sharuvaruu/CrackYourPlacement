class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Strings ko lexicographically sort karte hain
        Arrays.sort(strs);
        
        // idx variable ko 0 se initialize karte hain
        int idx = 0;
        
        // Sorting ke baad, pehla string lexicographically smallest hoga
        // aur aakhri string lexicographically largest hoga
        String s1 = strs[0]; // Sabse pehla string
        String s2 = strs[strs.length - 1]; // Sabse aakhri string
        
        // Common prefix sirf pehle aur aakhri string ke beech me hi common hoga,
        // kyunki agar pehla aur aakhri string me common prefix hai, to beech wale strings me bhi hoga.
        // isi wajah se sirf pehle aur aakhri strings ko compare karte hain.
        while (idx < s1.length() && idx < s2.length()) {
            // Jab tak idx dono strings ke length se chhota hai tab tak loop chalayenge
            if (s1.charAt(idx) == s2.charAt(idx)) {
                // Agar dono strings ke current character match karte hain to idx ko increment karte hain
                idx++;
            } else {
                // Agar character match nahi karte hain to loop se bahar nikal jaate hain
                break;
            }
        }
        
        // s1 substring ko return karte hain jo longest common prefix hoga
        return s1.substring(0, idx);
    }
}
