// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
class Solution{
    public int[] countBits(int num) {
    // Create an array 'f' of size num + 1 to store the count of '1' bits for each integer
    int[] f = new int[num + 1];
    
    // Iterate through each integer from 1 to num
    for (int i = 1; i <= num; i++) {
        // Calculate the number of '1' bits in the binary representation of 'i'
        // 'i >> 1' shifts 'i' one bit to the right (i.e., divides by 2)
        // 'i & 1' checks if the least significant bit of 'i' is 1
        f[i] = f[i >> 1] + (i & 1);
    }
    
    // Return the array containing the count of '1' bits for each integer from 0 to num
    return f;
}
}
 // Main logic:
            // 'i >> 1' shifts the bits of 'i' one place to the right, which is like dividing 'i' by 2
            // This means dp[i >> 1] gives us the number of '1' bits in 'i' without its last bit

            // '(i & 1)' checks if the last bit of 'i' is 1
            // If 'i' is odd, (i & 1) will be 1 (because the last bit is 1)
            // If 'i' is even, (i & 1) will be 0 (because the last bit is 0)

            // So, dp[i] is the number of '1' bits in 'i' divided by 2 (dp[i >> 1])
            // Plus 1 if 'i' is odd (i & 1)
            //dp[i >> 1] gives us the number of 1 bits in the binary representation of i / 2


            /* Why i / 2? Because shifting right by one bit effectively removes the least
             significant bit and gives us
             the count of 1 
             bits in the remaining part of the
              number.
Why i / 2 + (i & 1)? Because the total count of 1 bits in i is 
the count in i / 2 plus 1 if 
i is odd (i.e., if the least 
significant bit of i is 1).
Removing the LSB allows us to use the already computed results
 for i / 2 (i.e., dynamic programming).


 */