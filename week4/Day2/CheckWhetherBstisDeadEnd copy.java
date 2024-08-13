class Solution
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return solve(root,1,Integer.MAX_VALUE);
    }
    
    public static boolean solve(Node root,int min,int max){
        if(root==null){
            return false;
        }
        if(min==max){
            return true;
        }
        return solve(root.left,min,root.data-1)|| solve(root.right,root.data+1,max);
    }
}