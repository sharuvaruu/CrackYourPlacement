import java.util.*;  // Importing all utility classes from the java.util package

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through each element in the array 'nums'
        for (int i : nums) {
            // For each element 'i', either update its frequency if it exists in the map,
            // or add it with an initial frequency of 1 using getOrDefault method
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Create a PriorityQueue (min-heap) to store map entries based on their frequency
        // PriorityQueue uses a custom comparator to sort entries by their values (frequencies) in ascending order
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (entry1, entry2) -> entry1.getValue() - entry2.getValue()
        );

        // Step 3: Iterate through each entry in the frequency map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // Add the current entry to the min-heap
            minHeap.offer(entry);

            // If the size of the heap exceeds 'k', remove the element with the smallest frequency
            // This ensures that the heap always contains the top 'k' most frequent elements
            if (minHeap.size() > k) {
                minHeap.poll();  // Removes the entry with the smallest frequency from the heap
            }
        }

        // Step 4: Extract the keys of the top 'k' frequent elements from the min-heap
        int[] result = new int[k];  // Initialize an array to store the result
        for (int i = 0; i < k; i++) {
            // Remove the top element from the heap and store its key in the result array
            result[i] = minHeap.poll().getKey();
        }

        // Step 5: Return the result array containing the top 'k' frequent elements
        return result;
    }
}
