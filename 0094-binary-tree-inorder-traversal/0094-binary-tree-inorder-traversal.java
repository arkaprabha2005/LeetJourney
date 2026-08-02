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
    public List<Integer> inorderTraversal(TreeNode root) {
        //TreeNode tr=new TreeNode();
        List<Integer> l1=new ArrayList<>();
        inorder(root,l1);
        return l1;
    }

    private void inorder(TreeNode node,List<Integer> ans){
        if(node==null){
            return;
        }
        inorder(node.left,ans);
        ans.add(node.val);
        inorder(node.right,ans);

    }
}