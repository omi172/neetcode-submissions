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
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        max = 0;
        solve(root);
        return max - 1;
    }
    static void solve(TreeNode root){
        if(root == null){
            return;
        }
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(left + right + 1,max);
        solve(root.left);
        solve(root.right);
    }
    static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
}
