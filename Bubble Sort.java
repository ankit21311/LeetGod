class Solution
{
    //Function to sort the array using bubble sort algorithm.
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i = n-1; i>=1 ; i--){
            for(int j = 0 ; j<=i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1) ;
                }
            }
        }
    }
}
