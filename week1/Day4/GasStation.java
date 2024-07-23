class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int start=0;
        int gasCount=0;//to calculate the net gas count from current start
        for(int i=0;i<n;i++){
            gasCount+=gas[i]-cost[i];//dusre jagah tk pohche te pochte kitna petrol kharch hua
            if(gasCount<0){
                //agar gas count kam hua 0 se to iska matlab us stop tk petrol katam ho skta to pohochhi nahi payenge
                //isilie starting point increase krna padega
                start=i+1;
                gasCount=0;
            }
        }
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<n;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        return start;
    }
}