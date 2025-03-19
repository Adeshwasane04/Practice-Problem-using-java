package Accenture;

import java.util.ArrayList;

public class LeastSumSubarray {
    public static void main(String[] args) {
        int arr[]={3,2,1,-4,6,3,1};
        int k=3;

    }
    static int [] isLeastSum(int arr[],int k)
    {
        int start=0;
        int end=k-1;
        int min=0;
        int sum=0;
        ArrayList <Integer> least =new ArrayList<>();
        while(start<end)
        {
            for(int i=start;i<end;i++)
            {
                   sum+=arr[i];
                   min=sum;
            }
        }
    }
}
