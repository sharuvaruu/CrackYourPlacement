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
    // Method to find the k-th smallest element in the binary search tree
    public int kthSmallest(TreeNode root, int k) {
        int[] res = new int[2];  // Array to store results
        // res[0] will hold the k-th smallest value
        // res[1] will keep track of the count of nodes visited
        
        inorder(root, k, res);  // Perform in-order traversal of the tree
        return res[0];  // Return the k-th smallest value
    }
  
    // Helper method for in-order traversal
    public void inorder(TreeNode node, int k, int[] result) {
        // Base case: if node is null or we've visited enough nodes
        if (node == null || result[1] >= k) {
            return;  // Stop recursion
        }
        
        // Traverse the left subtree
        inorder(node.left, k, result);
        
        // Visit the current node
        result[1]++;  // Increment the count of visited nodes
        
        // Check if this node is the k-th smallest
        if (result[1] == k) {
            result[0] = node.val;  // Store the k-th smallest value
            return;  // Stop further traversal as we found the k-th smallest element
        }
        
        // Traverse the right subtree
        inorder(node.right, k, result);
    }
}
