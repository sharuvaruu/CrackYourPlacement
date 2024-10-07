import java.util.Scanner;

public class MaxSumofSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking dynamic array size from user
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        // Initialize array with user-provided size
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Taking array input from user
        }

        // Calling function to find maximum sum of subarray of size k
        System.out.println("Enter the subarray size:");
        int k = sc.nextInt();
        
        int maxSum = findMaxSum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum);

        sc.close();  // Closing the scanner
    }

    public static int findMaxSum(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;  // Initialize max to the smallest value

        // Sliding window logic
        while (j < arr.length) {
            sum += arr[j];  // Add current element to the sum

            // If the window size is smaller than k, just move the window forward
            if (j - i + 1 < k) {
                j++;
            } 
            // When the window size reaches k
            else if (j - i + 1 == k) {
                // Update the maximum sum
                max = Math.max(max, sum);
                // Slide the window by subtracting the element at the start of the window
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
