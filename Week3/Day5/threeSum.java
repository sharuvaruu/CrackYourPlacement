class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> result = new HashSet<>();
        
        // Agar array null hai ya uski length 3 se chhoti hai, to result ke roop mein empty array return karo
        if(arr == null || arr.length < 3) return new ArrayList<>();
        
        // Pehle array ko sort karte hain taaki triplets dhundhna aasan ho
        Arrays.sort(arr); // Pehle hum array ko sort karenge taaki har element ko fix karke triplets dhundha ja sake
        
        // For loop lagate hain arr.length-2 tak, kyunki har element ko fix karna hai aur arr.length-2 tak index fix kiya ja sakta hai
        for(int i = 0; i < arr.length - 2; i++) {
            int left = i + 1; // Left pointer ko current element ke baad set karo
            int right = arr.length - 1; // Right pointer ko end par set karo
            
            // Two sum approach apply karte hain
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if(sum == 0) { // Agar sum 0 hai, to triplet mil gaya
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++; // Left pointer ko aage badhao
                    right--; // Right pointer ko piche hatao
                } else if(sum < 0) {
                    left++; // Agar sum negative hai, to left pointer ko aage badhao taaki sum badhe
                } else {
                    right--; // Agar sum positive hai, to right pointer ko piche hatao taaki sum kam ho
                }
            }
        }
        
        return new ArrayList<>(result); // Result ko ArrayList mein convert karke return karo
    }
}
