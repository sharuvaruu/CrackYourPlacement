import java.util.*;

public class MedianOfSortedArray {

    public double findMedian(int[] arr1, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;

        // Merging two sorted arrays
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                res.add(arr1[i]);
                i++;
            } else {
                res.add(arr2[j]);
                j++;
            }
        }
        
        // Adding remaining elements from arr1
        while (i < n) {
            res.add(arr1[i]);
            i++;
        }
        
        // Adding remaining elements from arr2
        while (j < m) {
            res.add(arr2[j]);
            j++;
        }

        int t = n + m; // Total number of elements
        
        // If odd, return middle element
        if (t % 2 != 0) {
            return res.get(t / 2);
        } 
        // If even, return the average of the two middle elements
        else {
            int m1 = res.get(t / 2);
            int m2 = res.get((t / 2) - 1);
            return (m1 + m2) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianOfSortedArray medianFinder = new MedianOfSortedArray();
        int[] arr1 = {1, 3, 8};
        int[] arr2 = {7, 9, 10, 11};

        double median = medianFinder.findMedian(arr1, arr2);
        System.out.println("Median: " + median);
    }
}
