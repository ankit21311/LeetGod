Approach 1

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;
        ArrayList<Integer> arr = new ArrayList<>() ;
        int i = 0 , j = 0 ;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                arr.add(nums1[i]) ;
                i++ ;
                j++ ;
            }
            else if(nums1[i] > nums2[j]){
                j++ ;
            }else{
                i++ ;
            }
        }
        int[] res = new int[arr.size()] ;
        int k = 0 ;
        for(int s : arr){
            res[k] = s ;
            k++ ;
        }
        return res; 
    }
}


Approach 2
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1) ;
        }
        ArrayList<Integer> arr = new ArrayList<>() ;
        for(int i = 0 ; i<nums2.length ; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                map.put(nums2[i],map.get(nums2[i])-1) ;
                arr.add(nums2[i]) ;
            }
        }
        int[] res = new int[arr.size()] ;
        int k = 0 ;
        for(int i : arr){
            res[k] = i ;
            k++ ;
    }
    return res ;
    }
}
    
