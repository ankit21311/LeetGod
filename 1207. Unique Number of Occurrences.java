import java.util.* ;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        int n = arr.length ;
        for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0) ;
            }
            map.put(arr[i],map.get(arr[i])+1);
        }

        HashSet<Integer> set = new HashSet<>();
        Collection<Integer> values = map.values();
        for(int i : values){
            set.add(i) ;
        }
        return set.size() == map.size();
        
    }
}
