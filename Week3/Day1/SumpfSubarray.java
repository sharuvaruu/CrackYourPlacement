class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0; // Yeh cumulative sum ko track karega
        int ans = 0; // Yeh subarrays ki count rakhega jo k ke barabar hain
        HashMap<Integer, Integer> map = new HashMap<>(); // Yeh map cumulative sum ko store karega
        map.put(0, 1); // Yeh map ko initialize kar raha hai ki agar sum se k minus kar ke 0 mile, to ek subarray mil gaya
        
        // Array ke elements pe iterate karte hain
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j]; // Har element ko sum mein add karte jao
            
            // Check karo agar sum - k map mein already hai
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k); // Agar hai, to uske frequency ko ans mein add kar do
            }
            
            // Map ko update karo current cumulative sum ke sath
            map.put(sum, map.getOrDefault(sum, 0) + 1); // Agar sum already hai, to uski count increase karo, nahi to naya entry add karo
        }
        
        return ans; // Total subarrays jo k ke barabar sum karte hain, unki count return karo
    }
}
