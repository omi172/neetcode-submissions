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
    static int ans[];
    public int kthSmallest(TreeNode root, int k) {
        ans = new int[]{k,-1};
        inOrder(root, ans);
        return ans[1];
    }
    static void inOrder(TreeNode root, int ans[]){
        if(root == null){
            return;
        }
        
        inOrder(root.left, ans);
        ans[0]--;
        if(ans[0] == 0){
            ans[1] = root.val;
            return;
        }
        inOrder(root.right, ans);
    }
}
