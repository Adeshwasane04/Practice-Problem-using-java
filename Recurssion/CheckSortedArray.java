package Recurssion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6};
        int i=0;
        System.out.println("Given array is a sorted ? : "+checkSorted(arr, i));
    }

    // this program is to check that given array is sorted or not by using a recurrsive approach
    static boolean checkSorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return checkSorted(arr, i+1);
    }
}
