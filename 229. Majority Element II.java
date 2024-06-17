Majority Element :
n/2 ======> 1
n/3 ======> 2
n/4 ======> 3

it means n/k ======> (k-1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE , ele2 = Integer.MIN_VALUE ;
        int count1 = 0 , count2 = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == ele1){
                count1++ ;
            }
            else if(nums[i] == ele2){
                count2++ ;
            }
            else if(count1 == 0){
                ele1 = nums[i] ;
                count1++;
            }
            else if(count2 == 0){
                ele2 = nums[i] ;
                count2++ ;
            }else{
                count1-- ;
                count2-- ;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>() ;
            count1 = 0 ;
            count2 = 0 ;
            for(int i = 0 ; i<nums.length ; i++){
                if(nums[i] == ele1){
                    count1++;
                }
                if(nums[i] == ele2){
                    count2++ ;
                }
            }
            if(count1 > nums.length/3){
                arr.add(ele1) ;
            }
            if(count2 > nums.length/3){
                arr.add(ele2) ;
            }
            return arr ;
        
    }
}





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
