class NumArray {
    // Prefix sum array banane ke liye private member variable
    private int[] prefixSum;

    // Constructor: Prefix sum array initialize karte hain
    public NumArray(int[] nums) {
        // Prefix sum array ko nums ke length ke barabar banate hain
        prefixSum = new int[nums.length];

        // Prefix sum array fill karte hain
        for (int i = 0; i < nums.length; i++) {
            // Pehle prefixSum[i] mein nums[i] ki value daalte hain
            prefixSum[i] = nums[i];
            // Agar i > 0 hai, to previous sum ko add karte hain current sum mein
            if (i > 0) prefixSum[i] += prefixSum[i - 1];
        }
    }

    // sumRange function: Kisi bhi subarray ka sum return karne ke liye
    public int sumRange(int left, int right) {
        // Agar left > 0 hai, to prefixSum[right] mein se prefixSum[left-1] ko minus karte hain
        // Agar left == 0 hai, to seedha prefixSum[right] return karte hain
        return prefixSum[right] - (left > 0 ? prefixSum[left - 1] : 0);
    }
}
