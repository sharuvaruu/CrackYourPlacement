import java.util.Arrays;
import java.util.Collections;

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Primitive long array cannot use a custom comparator,
        // so convert long[] a to Long[] along for sorting with a custom comparator.
        Long[] along = new Long[n];
        for (int i = 0; i < n; i++) {
            along[i] = a[i];
        }

        // Sort the array along[] in decreasing order using Collections.reverseOrder().
        Arrays.sort(along, Collections.reverseOrder());

        // Sort the array b[] in increasing order using Arrays.sort().
        Arrays.sort(b);

        // Check the condition for each index:
        // We iterate through both arrays and check if the sum of elements at each index
        // in along[] and b[] is at least k.
        // If we find any index where the sum is less than k, return false.
        for (int i = 0; i < n; i++) {
            if (along[i] + b[i] < k) {
                return false; // If condition fails for any index, return false.
            }
        }

        // If all sums are at least k, return true.
        return true;
    }
}
