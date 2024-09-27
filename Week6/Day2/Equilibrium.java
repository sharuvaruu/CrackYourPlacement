class Solution {
    String equilibrium(int arr[]) {
        // code here
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            int rightsum=totalsum-leftsum-arr[i];
            if(leftsum==rightsum){
                return "true";
            }
            
            leftsum+=arr[i];
        }
        
        return "false";
    }
}