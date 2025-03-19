package Accenture;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 6, 7, 8,5,10};
        System.out.println("Missing number in the array: " + findMissingNumber(arr));
    }

    static int findMissingNumber(int[] arr) {
        int n=arr.length+1;
        int sum=0;  
        int Tsum=0;
       for(int i=1;i<=n;i++)
       {
        Tsum+=i;
       }
       for (int num : arr) {
        sum += num;
    }
       return Tsum-sum;
    }
}
