public class Solution{
    public void moveZeros(int[] nums){
        int n=nums.length;
        int j=0;//for putting zeros at the end
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
               nums[j]=nums[i];
               j++;
            }          
        }
        for(int i=j;i<n;i++){
            nums[i]=0;
        }
    }
}