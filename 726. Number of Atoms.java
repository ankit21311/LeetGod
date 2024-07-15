class Solution {
    public String countOfAtoms(String formula) {

        int n = formula.length() ;
        Stack<Map<String , Integer>> stack = new Stack<>() ;
        stack.push(new HashMap<>());

        int i = 0 ;
        while(i<n){

            if(formula.charAt(i) == '('){
                stack.push(new HashMap<>()) ;
                i++; 
            } 
            else if(formula.charAt(i) == ')'){
                Map<String,Integer> map = stack.pop() ;
                i++ ;
                StringBuilder Multiplier = new StringBuilder() ;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    Multiplier.append(formula.charAt(i)) ;
                    i++ ;
                }

                int count =  Multiplier.length() > 0 ? Integer.parseInt(Multiplier.toString()) : 1 ;

                for(String key : map.keySet()){

                    int num = map.get(key) ;
                    map.put(key,num*count) ;
                }

                for(String key : map.keySet()){

                    stack.peek().put(key,stack.peek().getOrDefault(key,0)+map.get(key)) ;
                }

            }

            else{
                StringBuilder str = new StringBuilder() ;
                str.append(formula.charAt(i)) ;
                i++;
               
                while(i<n && Character.isLowerCase(formula.charAt(i))){
                    str.append(formula.charAt(i)) ;
                    i++ ;
                }

                StringBuilder Multiplier = new StringBuilder() ;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    Multiplier.append(formula.charAt(i)) ;
                    i++ ;
                }
                // int count = sb.length() > 0 ? Integer.parseInt(sb.toString()) : 1;
                int count = Multiplier.length() > 0 ? Integer.parseInt(Multiplier.toString()) : 1 ;

                stack.peek().put(str.toString() , stack.peek().getOrDefault(str.toString(),0)+count) ;
            }
        }
        StringBuilder ans = new StringBuilder() ;
        TreeMap<String,Integer> sortedMap = new TreeMap<>(stack.peek()) ;
        for(String key : sortedMap.keySet()){
            ans.append(key) ;
            int count = sortedMap.get(key) ;
            if(count > 1){
                ans.append(count) ;
            }
        }
        return ans.toString() ;

    }
}
