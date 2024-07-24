//Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
//1. Each student gets exactly one packet.
//2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);//sabse pehle sort krlia so that consequtive sorted positions se min diff find krna easy he
        int left=0;//start of window
        int right=m-1;//end of window of size m
        long result=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            if(right<a.size()){//jb tk right side of window array ke end tk nahi pohochti
                long res=a.get(right)-a.get(left);//
                result=Math.min(result,res);
            }else{
                break;
            }
            left++;
            right++;
        }
        return result;
        
    }
}