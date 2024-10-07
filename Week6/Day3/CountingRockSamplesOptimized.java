import java.util.Arrays;

public class CountingRockSamplesOptimized {
    public static void main(String[] args) {
        // Sample input arrays
        int[] samples = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811};
        int[][] ranges = {{300, 380}, {400, 700}};
        
        // Call the optimized function to count samples within the ranges
        int[] result = countSamplesInRangeOptimized(samples, ranges);
        
        // Print the result
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    // Optimized function to count the number of samples in each range
    public static int[] countSamplesInRangeOptimized(int[] samples, int[][] ranges) {
        // Sort the samples array to enable binary search
        Arrays.sort(samples);  // Sorting helps us use binary search later
        
        // Array to store the count for each range
        int[] counts = new int[ranges.length];  // To store results for each range
        
        // Iterate over each range
        for (int i = 0; i < ranges.length; i++) {
            int lowerBound = ranges[i][0];  // L = ranges[i][0]
            int upperBound = ranges[i][1];  // R = ranges[i][1]
            
            // Find the first index where sample >= lowerBound using binary search
            int lowIndex = lowerBoundIndex(samples, lowerBound);
            
            // Find the first index where sample > upperBound using binary search
            int highIndex = upperBoundIndex(samples, upperBound);
            
            // The number of elements in range is the difference between indices
            counts[i] = highIndex - lowIndex;
        }
        
        return counts;
    }
    
    // Binary search to find the first index where sample >= lowerBound
    public static int lowerBoundIndex(int[] samples, int lowerBound) {
        int low = 0, high = samples.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (samples[mid] < lowerBound) {
                low = mid + 1;  // Move right if mid element is less than lowerBound
            } else {
                high = mid;  // Move left if mid element is greater than or equal
            }
        }
        return low;  // This is the first index where sample >= lowerBound
    }
    
    // Binary search to find the first index where sample > upperBound
    public static int upperBoundIndex(int[] samples, int upperBound) {
        int low = 0, high = samples.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (samples[mid] <= upperBound) {
                low = mid + 1;  // Move right if mid element is less than or equal to upperBound
            } else {
                high = mid;  // Move left if mid element is greater than upperBound
            }
        }
        return low;  // This is the first index where sample > upperBound
    }
}
