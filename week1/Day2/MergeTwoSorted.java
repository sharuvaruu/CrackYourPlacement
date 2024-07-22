//https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     if(n==0)return; //if array 2 is empty there is no point in merging
     int len1=nums1.length;
     int end_ind=len1-1;
     while(n>0 && m>0){
         if(nums1[m-1]>=nums2[n-1]){
            nums1[end_ind]=nums1[m-1];
            m--;
         }else{
            nums1[end_ind]=nums2[n-1];
            n--;
         }
         end_ind--;
     }
     while(n>0){
        nums1[end_ind]=nums2[n-1];
        n--;
        end_ind--;
     }
    }
}