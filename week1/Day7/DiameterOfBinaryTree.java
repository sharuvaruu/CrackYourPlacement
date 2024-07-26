/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter = 0; // Diameter ko track karne ke liye variable

    public int diameterOfBinaryTree(TreeNode root) {
        height(root); // Height function ko call karte hain
        // Diameter - 1 karke return karte hain kyunki hume nodes ke beech ke edges chahiye
        return diameter - 1; 
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0; // Agar node null hai, to height 0 hoti hai
        }
        int lh = height(root.left); // Left subtree ki height calculate karte hain
        int rh = height(root.right); // Right subtree ki height calculate karte hain
        
        // Diameter ko update karte hain maximum value se, jo ya to current diameter hoga ya phir lh + rh + 1
        diameter = Math.max(diameter, lh + rh + 1);

        // Current node ki height return karte hain, jo ki maximum subtree height + 1 hoti hai
        return Math.max(lh, rh) + 1; 
    }
}
