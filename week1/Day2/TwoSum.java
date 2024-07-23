//https://leetcode.com/problems/two-sum/submissions/1328555124/
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                 result[0]=i;
                 result[1]=map.get(target-nums[i]);
                 return result;
            }  
            map.put(nums[i],i);         
        }     
        return result;
    }   
}