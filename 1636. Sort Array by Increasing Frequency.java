class Solution {
    public int[] frequencySort(int[] nums) {
        
        int n = nums.length ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1) ;
        }
        Integer[] temp = new Integer[n] ;
        for(int i = 0 ; i<n ; i++){
            temp[i] = nums[i] ;
        }
        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a , Integer b){
                if(map.get(a) == map.get(b)){ // frequency same 
                    return b-a ; // large number first then small
                }
                return map.get(a)-map.get(b) ; // low frequqncy first then large frequqncy
            }
        }) ;
        for(int i = 0 ; i<n ; i++){
            nums[i] = temp[i] ;
        }
        return nums ;
    }
}
