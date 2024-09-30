public int[] findSmallestAndSecondSmallest(int[] arr) {
    // Result array to hold the smallest and second smallest values
    int res[] = new int[2];
    
    // Initialize both to maximum possible integer values (for largest, initialize to Integer.MIN_VALUE)
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    
    // Iterate through the array
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallest) {
            // Update secondSmallest before updating smallest (for largest, compare arr[i] > largest)
            secondSmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
            // If arr[i] is greater than smallest but smaller than secondSmallest 
            // (for largest, this would be: arr[i] > secondLargest && arr[i] != largest)
            secondSmallest = arr[i];
        }
    }

    // Store the results in the array
    res[0] = smallest; // (For largest, store res[0] = largest)
    res[1] = secondSmallest; // (For largest, store res[1] = secondLargest)

    return res; // Return the array containing the smallest and second smallest (or largest and second largest)
}
