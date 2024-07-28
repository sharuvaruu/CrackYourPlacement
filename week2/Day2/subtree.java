class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        // Agar subRoot null hai to true return karo kyunki null tree kisi bhi tree ka part ho sakti hai
        if(subRoot == null) return true;
        // Agar root null hai aur subRoot non-null hai to false return karo kyunki ek empty tree non-empty tree ko contain nahi kar sakta
        if(root == null) return false;
        // Agar current nodes match karte hain to helper function se check karo aur agar match karta hai to true return karo
        if(helper(root, subRoot)) return true;
        // Recursively left aur right subtrees check karo agar koi bhi subRoot ko contain karte hain
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }
     
    public boolean helper(TreeNode root1, TreeNode root2)
    {
        // Agar dono nodes null hain to true return karo kyunki dono end pe aa gaye hain
        if(root1 == null && root2 == null)
            return true;
        // Agar dono nodes non-null hain aur unka value same hai tab recursively left aur right subtrees ko check karo
        return (root1 != null && root2 != null && root1.val == root2.val) && 
            helper(root1.left , root2.left) && helper(root1.right , root2.right);
    }
}
