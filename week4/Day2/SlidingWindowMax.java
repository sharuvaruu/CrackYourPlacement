import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Handle the base case where the input array is null or empty
        if (nums == null || nums.length == 0) return new int[0];
        
        int n = nums.length; // Length of the input array
        // Create a result array to store the maximum of each sliding window
        // Result size is n - k + 1 because this is the number of valid windows in the array
        int[] result = new int[n - k + 1];
        
        // PriorityQueue to act as a max-heap. Elements are arrays of the form [value, index].
        // The heap will keep track of the maximum value in the sliding window efficiently.
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        
        // Populate the initial window of size k
        for (int i = 0; i < k; i++) {
            // Why: Add the first k elements to the heap with their indices.
            // How: The heap maintains the elements such that the maximum element is always on top.
            maxHeap.offer(new int[]{nums[i], i});
        }
        
        // Store the maximum of the first window in the result array.
        // Why: The maximum of the initial window is the top of the max-heap.
        // How: `maxHeap.peek()[0]` gives the maximum value of the first window.
        result[0] = maxHeap.peek()[0];
        
        // Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            // Add the new element to the heap
            // Why: As the window slides, we need to include the new element in our consideration.
            // How: Insert the new element with its index into the heap.
            maxHeap.offer(new int[]{nums[i], i});
            
            // Remove elements that are out of bounds of the current window
            while (!maxHeap.isEmpty() && maxHeap.peek()[1] <= i - k) {
                // Why: Remove elements from the heap if their indices are outside the current window.
                // How: `maxHeap.peek()[1]` gives the index of the element at the top of the heap.
                // If this index is less than or equal to `i - k`, it means it's out of the current window range.
                // `maxHeap.poll()` removes this element from the heap.
                maxHeap.poll();
            }
            
            // Store the current maximum in the result array
            // Why: After removing out-of-bounds elements, the top of the heap is the maximum value for the current window.
            // How: `maxHeap.peek()[0]` provides the maximum value of the current window.
            // Store this value in the result array at the position corresponding to the current window's start.
            result[i - k + 1] = maxHeap.peek()[0];
        }
        
        // Return the result array containing the maximum values for each sliding window
        // Why: The result array now holds the maximum value for each window of size k.
        // How: Simply return the result array which contains all the maximum values.
        return result;
    }
}
