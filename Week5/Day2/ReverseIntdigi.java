public int reverse(int x) {
    int reversed = 0; // Yeh variable reversed number ko store karega.
    int sign = (x < 0) ? -1 : 1; // Agar x negative hai, toh sign ko -1 set karo, nahi toh 1.
    x = Math.abs(x); // x ka absolute value le lo, taaki hum positive numbers ke sath kaam kar sakein.
    
    while (x != 0) { // Jab tak x mein digits hain, tab tak loop chalayenge.
        int pop = x % 10; // Last digit ko pop kar rahe hain (extract kar rahe hain).
        x /= 10; // Last digit ko remove kar rahe hain (x ko 10 se divide karte hain).
        
        // Overflow check karte hain yahan. Agar reversed number 32-bit signed integer ki limit se bada hone wala hai,
        // toh hum 0 return karenge, kyunki overflow se bacha rahe hain.
        if (reversed > (Integer.MAX_VALUE - pop) / 10) {
            return 0; // Agar overflow hone wala hai, toh 0 return kar do.
        }
        
        // Reversed number ko update karo, 10 se multiply kar ke aur pop add karke.
        reversed = reversed * 10 + pop;
    }
    
    // Final reversed number ko sign ke saath return karte hain (original number ka sign apply karo).
    return sign * reversed;
}
