package Accenture;

import java.util.Arrays;

public class NextGreaterElement {

   /*  Ques 1. Given an array of N size, Print the Next Greater Element of every
element.
Input 1: 4 5 2 25
Output 1: 5 25 25 -1
Input 2: 5 7 1 7 6 0
Output 2: 7 -1 7 -1 -1 -1
*/

    public static void main(String[] args) {
        int arr[]={4,5, 2 ,25};
        int [] result=isNext(arr);
        
        
        System.out.println( Arrays.toString(result));
    }
    static int[] isNext(int arr[])
    {
        int prev=arr[0];
        int j=0;
        int newArr[]=new int[arr.length];
        newArr[arr.length-1]=-1;
        for(int i=1;i<arr.length;i++)
        {
           if(prev<arr[i])
           {
             newArr[j]=arr[i];
             j++;
             prev=arr[i];
           }
           else
           {
            newArr[j]=-1;
            j++;
            prev=arr[i];
           }
        }
        
        return newArr;
    }
}
