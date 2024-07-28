
class Solution {
    public int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // Calculate the length of the array
        int len = nums.length;
        
        // Calculate the product of the three largest numbers
        int max1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        
        // Calculate the product of the two smallest numbers and the largest number
        int max2 = nums[0] * nums[1] * nums[len - 1];
        
        // Return the maximum of the two products
        return Math.max(max1, max2);
    }
}

