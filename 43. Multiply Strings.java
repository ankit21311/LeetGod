class Solution {
    public String multiply(String num1, String num2) {
        
        int n1 = num1.length() ;
        int n2 = num2.length() ;
        if(n1 == 1 || n2 == 1){
            if(num1.charAt(0) == '0'){
                return "0";
            }
            else if(num2.charAt(0) == '0'){
                return "0";
            }
        }

        int[] ans = new int[n1+n2] ;
        char[] ch1 = num1.toCharArray() ;
        char[] ch2 = num2.toCharArray() ;

       int pf = 0;
        for(int i = n1-1 ; i>=0 ; i--){
            int k = ans.length-1-pf ;
            int carry = 0 ;
            for(int j = n2-1 ; j>=0 || carry != 0 ; j--){
                int a = ch1[i]-'0' ;
                int b = j >= 0 ? ch2[j] - '0' : 0;
                int prod = (a*b)+carry+ans[k] ;
                int res = prod % 10 ;
                carry = prod/10 ;
                ans[k] = res ;
                k-- ;
            }
            pf++;
        }
        boolean flag = false ;
        String str = "" ;
        for(int i = 0 ; i < ans.length ; i++){
            if(ans[i] == 0 && flag == false){
                continue ;
            }else{
                str += ans[i] ;
                flag = true ;
            }
        }
        return str ;
    }
}
