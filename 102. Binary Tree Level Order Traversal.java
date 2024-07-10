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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>() ;
        List<List<Integer>> ls = new ArrayList<>() ;
        
        if(root == null) return ls ;
        q.add(root) ;
        q.add(null) ;
        List<Integer> arr = new ArrayList() ;
        while(!q.isEmpty()){

            TreeNode curr = q.poll() ;

            if(curr == null){
                
                ls.add(arr) ;
                if(q.isEmpty()){
                    return ls ;
                }
                
                arr = new ArrayList() ;
                q.add(null) ;
                continue ;
                
            }
           
            arr.add(curr.val) ;

            if(curr.left != null){
                q.add(curr.left) ;
            }

            if(curr.right != null){
                q.add(curr.right) ;
            }
            

        }
        return ls ;
    }
}
