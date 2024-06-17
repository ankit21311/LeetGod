
class Solution
{
    
	int  select(int arr[], int i)
	{
	   int n = arr.length ;
	   int mn = Integer.MAX_VALUE ;
	   int ans = 0 ;
       while(i<n){
           if(arr[i]<mn){
               mn = Math.min(mn,arr[i]) ;
               ans = i ;
           }
           i++ ;
       }
       return ans ;
	}
	
	void swap(int[] arr , int i , int j){
	    int temp = arr[i] ;
	    arr[i] = arr[j] ;
	    arr[j] = temp ;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int i = 0 ;
	    
	    int j = 0 ;
	    while(i<n){
	        j = select(arr,i) ;
	        swap(arr,i,j) ;
	        i++;
	    }
	    
	    
	    
	}
}
