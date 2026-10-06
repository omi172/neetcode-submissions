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
    static boolean check(TreeNode root,TreeNode r){
            if(root == null && r == null){
                return true;
            }
            if(root == null || r == null){
                return false;
            }
            if(root.val != r.val){
                return false;
            }
            return check(root.left,r.left) && check(root.right,r.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
            if(root == null){
                return false;
            }
            if(root.val == subRoot.val && check(subRoot,root)){
                return true;
            }
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
