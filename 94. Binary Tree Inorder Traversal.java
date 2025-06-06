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
    public List<Integer> Morris(TreeNode root,List<Integer> ls){

        if(root == null) return ls ;
        TreeNode curr = root ;
        while(curr != null){
            if(curr.left == null){
            ls.add(curr.val) ;
            curr = curr.right ;
        }
        else{
            TreeNode prev = curr.left ;
            while(prev.right != null && prev.right != curr){
                prev = prev.right ;
            }
            if(prev.right == null){
                prev.right = curr ;
                curr = curr.left ;
            }
            else{
                prev.right = null ;
                ls.add(curr.val) ;
                curr = curr.right ;
            }
        }
        }
        return ls ;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList() ;
        return Morris(root,ls) ;
    }
}
