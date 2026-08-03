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

 //-----------------------Recursive

// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         return mirror(root.left,root.right);
//     }

//     private boolean mirror(TreeNode l,TreeNode r){
//         if(l==null && r==null) return true;

//         if(l==null || r==null) return false;
        
//         if(l.val!=r.val) return false;
        
//         boolean left=mirror(l.left,r.right);
//         boolean right=mirror(l.right,r.left);

//         return left && right;
        

//     }
// }

//-----------------Iterative

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q1=new LinkedList<>();
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        q1.offer(root.left);
        q1.offer(root.right);
        while(!q1.isEmpty()){
            TreeNode l=q1.poll();
            TreeNode r=q1.poll();
            if(l==null && r==null) continue;
            if(r==null ||l==null) return false;
            if(l.val!=r.val) return false;
            q1.offer(l.left);
            q1.offer(r.right);

            q1.offer(l.right);
            q1.offer(r.left);
        }

        return true;

    }
}