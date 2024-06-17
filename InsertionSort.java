
class Solution
{
    
  public static void swap(int[] arr , int a , int b){
      int temp = arr[a] ;
      arr[a] = arr[b] ;
      arr[b] = temp ;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 0 ; i<n-1 ; i++){
          int j = i+1 ;
          while(j>0 && arr[j]<arr[j-1]){
              swap(arr,j,j-1) ;
              j-- ;
          }
      }
  }
}
