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
    public TreeNode invertTree(TreeNode root) {
        // Agar root null hai toh null return kar do
        if (root == null) {
            return null;
        }
        // Left subtree ko invert karo
        TreeNode left = invertTree(root.left);
        // Right subtree ko invert karo
        TreeNode right = invertTree(root.right);
        // Left aur right subtree ko swap kar do
        root.left = right;
        root.right = left;
        // Inverted root return karo
        return root;
    }
}
