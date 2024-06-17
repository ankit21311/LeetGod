Majority Element :
n/2 ======> 1
n/3 ======> 2
n/4 ======> 3

it means n/k ======> (k-1)



class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,0) ;
            }
            map.put(i,map.get(i)+1) ;
        }
        ArrayList<Integer> arr = new ArrayList<>() ;
        for(int i : map.keySet()){
            if(map.get(i) > nums.length/3){
                arr.add(i) ;
            }
        }
        return arr ;
    }
}
