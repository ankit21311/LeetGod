
class Pair{
    Node node ;
    int hd ;
    Pair(Node node , int hd){
        this.node = node ;
        this.hd = hd ;
    }
}
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        Queue<Pair> q = new ArrayDeque<>() ;
        Map<Integer,Integer> map = new TreeMap<>() ;
        q.add(new Pair(root,0)) ;
        while(!q.isEmpty()){
            Pair curr = q.poll() ;
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data) ;
            }
            
            if(curr.node.left != null){
                q.add(new Pair(curr.node.left , curr.hd-1)) ;
            }
            if(curr.node.right != null){
                q.add(new Pair(curr.node.right,curr.hd+1)) ;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>() ;
        for(int key : map.keySet()){
            arr.add(map.get(key)) ;
        }
        return arr ;
        
    }
}

