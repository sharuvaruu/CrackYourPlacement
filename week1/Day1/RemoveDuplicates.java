//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int slow=1; //for keep the position for next unique element
        
        for(int fast=1;fast<nums.length;fast++){
            //fast pointer is for finding unique elemt
          if(nums[fast]!=nums[fast-1]){
            nums[slow]=nums[fast];//if unique found at fast put it at slowth position
            slow++;
          }
        }
        return slow;//return lenth of array of unique elemnts
    }
}