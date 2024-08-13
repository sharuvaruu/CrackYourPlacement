
class Solution
{
    public void swap(int[] nums, int x, int y) {
    int t = nums[x]; // Save the value at index x
    nums[x] = nums[y]; // Assign the value at index y to index x
    nums[y] = t; // Assign the saved value to index y
}
    
    //Function to find the minimum number of swaps required to sort the numsay.
    public int minSwaps(int nums[])
    {
        // Code here
     int n=nums.length;
     int count=0;//to count the no. of swaps
    HashMap<Integer, Integer> map = new HashMap<>();
    
     for(int i=0;i<n;i++){
        map.put(nums[i],i);
     }
     Arrays.sort(nums);
     for(int i=0;i<n;i++){
         if(i==map.get(nums[i])){
             continue;
         }else{
             count++;
             swap(nums,i,map.get(nums[i]));
             i--;//forrechecking the current index after swapping
         }
     }
       
       return count;  
        
    }
}