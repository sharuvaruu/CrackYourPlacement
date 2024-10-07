import java.util.*;

public class SubsetCheck {

    public static boolean isSubset(List<Integer> arr1, List<Integer> arr2) {
        // Sort both lists
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        int i = 0, j = 0;

        // Traverse both arrays using two pointers
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++; // Move pointer in arr1 if arr1[i] is smaller
            } 
            // Use .equals() for comparison between Integer values
            else if (arr1.get(i).equals(arr2.get(j))) {
                i++;
                j++;
            } else {
                return false; // arr2[j] not found in arr1
            }
        }

        // Return true if all elements of arr2 were found in arr1
        return j == arr2.size(); // Check if all elements in arr2 are matched
    }
}
