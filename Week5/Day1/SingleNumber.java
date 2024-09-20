class Solution {
    public int singleNumber(int[] nums) {
        // Result ko 0 se initialize kar rahe hain
        int result = 0;

        // Array ke har number par iterate kar rahe hain
        for (int num : nums) {
            // XOR operation ka use kar rahe hain single number dhoondhne ke liye
            // XOR operation ki kuch properties hain:
            // 1. x ^ x = 0: Kisi bhi number ko khud se XOR karne par result 0 hota hai.
            // 2. x ^ 0 = x: Kisi bhi number ko 0 se XOR karne par number waise ka waise rahta hai.
            // 3. XOR commutative aur associative hai: Operations ka order matter nahi karta.
            //
            // Jab hum array mein iterate karte hain, to jo pairs identical numbers hain,
            // wo cancel ho jayenge pehli property ki wajah se (x ^ x = 0).
            // Is tarah, jab hum sabhi numbers ko XOR karte hain, to sab duplicates khatam ho jate hain,
            // sirf wahi unique number bachta hai jo ek baar aata hai.
            result ^= num;
        }

        // Wo single number return kar rahe hain jo sirf ek baar aata hai
        return result;
    }
}
