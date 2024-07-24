class Solution {
    public int maxArea(int[] height) {
        int left=0;//left index or left side of the container
        int right=height.length-1;//right side of the container
        int max=0;//variable to keep track of of maximum area of water to be filled in the container
        while(left<=right){
            int lh=height[left];//height at left ind
            int rh=height[right];//height at right ind
            int w=right-left; //width b/w left and right ind
            int h=Math.min(lh,rh);//we conside minimum of two heights as if we conside taller ones there are chances of water overflowing
            int curr_area=w*h;//area of water container
            max=Math.max(max,curr_area);//update max area till now
            if(lh<rh) left++;//if lh is small move l pointer ahead
            else right--;//vice versa
        }
        return max;//max area returned
    }
}