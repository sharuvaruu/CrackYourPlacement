import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length; // Temperatures array ka length store karne ke liye
        Stack<Integer> stk = new Stack<>(); // Yeh stack hume indices store karne mein help karega
        int[] res = new int[n]; // Result array jismein hum answer store karenge
        
        for (int i = 0; i < n; i++) { // Har temperature pe iterate karne ke liye loop
            // Jab tak stack khaali nahi hai aur current temperature stack ke top wale se zyada hai
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                // Stack se index nikaalo jahan temperature kam tha
                int prevDay = stk.pop();
                // Difference calculate karo jo batayega kitne din baad temperature bada
                res[prevDay] = i - prevDay;
            }
            // Current index ko stack mein daalo
            stk.push(i);
        }
        
        return res; // Result array return karo
    }
}

/*
Detailed Explanation:

Stack Ka Use:
- Yeh stack humein un days ke indices store karne mein madad karta hai jahan hum abhi tak kisi zyada temperature ka intezaar kar rahe hain. 
- Stack ka concept isme efficient hote hue temperature compare karne mein help karta hai bina extra iterations ke.

Logic:
- Jab hum array ke elements pe iterate karte hain, hum current day's temperature compare karte hain stack mein stored indices ke temperatures ke saath.
- Agar current temperature zyada hai, iska matlab pehle stored day ke temperature ke baad zyada temperature aaj aaya. 
- Isliye, hum stack se us din ka index nikaal ke result array mein number of days ka difference store kar dete hain.
- Agar current temperature kam ya barabar hai, to current index ko stack mein daal dete hain, taki aage chalke hum isko compare kar sakein.

Q: Stack Kyun Use Karna?:
- Stack ka use karne se hum efficiently backward jaake dekhe bina, har element ke liye pehle zyada temperature milte hi calculation kar sakte hain.
- Yeh approach time complexity ko O(n) banati hai, kyunki har element stack mein sirf ek baar push aur pop hota hai. 
- Ye ek efficient method hai as compared to brute force approach jisme hum har element ke liye aage ke sab elements check karte.

This detailed explanation with Hinglish comments should help you understand the logic and the use of the stack in the dailyTemperatures problem.
*/
