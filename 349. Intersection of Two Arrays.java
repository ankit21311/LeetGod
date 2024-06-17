class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>() ;
        HashSet<Integer> set2 = new HashSet<>() ;
        for(int i : nums1){
            set.add(i) ;
        }
        for(int i : nums2){
            if(set.contains(i)){
                set2.add(i) ;
            }
        }
        int[] res = new int[set2.size()] ;
        int k = 0;
        for(int i : set2){
            res[k] = i;
            k++ ;
        }
        return res ;
    }
}




class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;
        int n1 = nums1.length ;
        int n2 = nums2.length ;
        int i = 0 , j = 0 ;
        ArrayList<Integer> arr = new ArrayList<>() ;
        while(i<n1 && j<n2){
            if(nums1[i] == nums2[j]){
                if(arr.size() == 0 || arr.get(arr.size()-1) != nums1[i]){
                    arr.add(nums1[i]) ;
                }
                i++ ;
                j++ ;
                
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        int[] res = new int[arr.size()] ;
        for(int a = 0 ; a<arr.size() ;a++){
            res[a]=arr.get(a);
        }
        return res;
    }
}
