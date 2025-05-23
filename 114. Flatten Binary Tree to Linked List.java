Approach 1
  
class Solution {
    public void flatten(TreeNode root) {

        if(root == null) return ;
        TreeNode templeft = root.left ;
        TreeNode tempright = root.right ;

        root.left = null ;
        flatten(templeft) ;
        flatten(tempright) ;
        
        root.right = templeft ;
        TreeNode curr = root ;
        while(curr.right != null) curr = curr.right ;
        curr.right = tempright ;

    }
}
