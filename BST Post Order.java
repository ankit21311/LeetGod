class Solution {
    public List<Integer> HelperP(TreeNode root, List<Integer> arr){
            if(root == null) return arr ;
            HelperP(root.left, arr) ;
            HelperP(root.right, arr) ;
            arr.add(root.val) ;
            
            return arr ;

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>() ;
        return HelperP(root,arr) ;
    }
}
