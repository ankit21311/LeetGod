class Solution {
    public String decodeString(String s) {
        Stack<Integer> number = new Stack<>() ;
        Stack<StringBuilder> str = new Stack<>() ;

        StringBuilder res = new StringBuilder() ;
        StringBuilder temp = new StringBuilder() ;
        int num = 0 ;
        int count = 0 ;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0') ;
                
            }
            else if(ch == '['){
                number.push(num) ;
                str.push(temp) ;
                temp = new StringBuilder() ;
                num = 0 ;
            }
            else if(ch == ']'){
                res = temp ;
                temp = str.pop() ;
                count = number.pop() ;
                while(count > 0){
                    temp.append(res) ;
                    count-- ;
                }
            }else{
                temp.append(ch) ;
            }
        }
        return temp.toString() ;
    }
}
