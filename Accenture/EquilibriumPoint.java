package Accenture;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[]={3,4,6,5,7,3,3};
        int n=arr.length;
     System.out.println(isCheck(n, arr));
       
        
    }
    static int isCheck(int n, int arr[])
    {
        for(int i=0;i<n;i++)
        {
            if(isSum(arr,0,i-1)==isSum(arr, i+1, n-1))
            {
               return i;
            }
           
        }
        return -1;
    }
    static int isSum(int arr[], int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
