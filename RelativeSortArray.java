class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length ;
        int n2 = arr2.length ;
        Arrays.sort(arr1) ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0 ; i<n1 ; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],0) ;
            }
            map.put(arr1[i],map.get(arr1[i])+1) ;
        }
        int count = 0 ;
        int k = 0 ;
        for(int i = 0 ; i<n2 ; i++){
            count = map.get(arr2[i]) ;
            while(count > 0){
                arr1[k] = arr2[i] ;
                k++ ;
                count-- ;
            }
            map.remove(arr2[i]) ;
        }
        
        List<Integer> remainingKeys = new ArrayList<>(map.keySet());
        Collections.sort(remainingKeys); // Sort keys in ascending order
        
        for (int key : remainingKeys) {
            count = map.get(key);
            while (count > 0) {
                arr1[k] = key;
                k++;
                count--;
            }
        }
        return arr1 ;
    }
}




Solution 2 

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length , n2 = arr2.length ;
        int Max = Integer.MIN_VALUE ;
        for(int i = 0 ; i< n1 ; i++){
            Max = Math.max(Max,arr1[i]) ;
        }
        int[] count = new int[Max+1] ;
        for(int i = 0 ; i<n1 ; i++){
            int element = arr1[i] ;
            count[element]++ ;
        }
        int k = 0 ;
        for(int i = 0 ; i<n2 ; i++){
    
            while(count[arr2[i]] > 0){
                arr1[k] = arr2[i];
                k++ ;
                count[arr2[i]]-- ;
            }
        }
        for(int i = 0 ; i<Max+1 ; i++){
            while(count[i] > 0){
                arr1[k] = i ;
                k++ ;
                count[i]-- ;
            }
        }
        return arr1 ;
    }
}
