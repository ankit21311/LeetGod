



/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    public static void PrintLeft(Node root ,ArrayList<Integer> arr, int level){
        
        if(root == null){
            return ;
        }
        if(arr.size() == level){
            arr.add(root.data) ;
        }
        PrintLeft(root.left , arr, level+1) ;
        PrintLeft(root.right , arr, level+1) ;
        
    }
    
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> arr = new ArrayList<>();

      if(root == null){
          return arr ;
      }
    //   ArrayList<Integer> arr = new ArrayList() ;
      PrintLeft(root , arr , 0) ;
      return arr ;
      
    }
}
