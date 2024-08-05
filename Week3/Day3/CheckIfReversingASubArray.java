public class Main {
    public static String canBeSortedByReversingSubarray(int[] arr) {
        int n = arr.length;
        
        // Step 1: Identify the segment that is out of order
        int i = 0;
        while (i < n - 1 && arr[i] <= arr[i + 1]) {
            i++;
        }
        
        // If array is already sorted
        if (i == n - 1) {
            return "Yes";
        }
        
        // Start of the unsorted segment
        int start = i;
        
        // Step 2: Continue till the end of the unsorted segment
        while (i < n - 1 && arr[i] >= arr[i + 1]) {
            i++;
        }
        
        // End of the unsorted segment
        int end = i;
        
        // Step 3: Check if the rest of the array is sorted after the unsorted segment
        while (i < n - 1 && arr[i] <= arr[i + 1]) {
            i++;
        }
        
        // If the rest of the array is not sorted, return "No"
        if (i != n - 1) {
            return "No";
        }
        
        // Step 4: Check if reversing the identified segment makes the array sorted
        if ((start == 0 || arr[start - 1] <= arr[end]) && 
            (end == n - 1 || arr[start] <= arr[end + 1])) {
            return "Yes";
        }
        
        return "No";
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        System.out.println(canBeSortedByReversingSubarray(arr));  // Output: No

        int[] arr2 = {1, 2, 6, 5, 4, 3, 7, 8};
        System.out.println(canBeSortedByReversingSubarray(arr2)); // Output: Yes
    }
}
