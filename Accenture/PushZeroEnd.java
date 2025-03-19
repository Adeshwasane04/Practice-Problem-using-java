package Accenture;

import java.util.Arrays;

public class PushZeroEnd {
    
    /*Question 2. Given an array of random numbers, Push all the zero’s of a given an
array to the end of the array. All non-zero elements should come in front and
Order of all non-zero elements should be same.
Input Format: Given an array of random numbers.
Output Format: Move all zeros to end of array and keeping all non-zero
element in same position.

Input 1: 1 2 0 4 3 0 5 0
Output 1: 1 2 4 3 5 0 0 0

Input 1: 1 2 0 0 0 3 6
Output 1: 1 2 3 6 0 0 0 */

public static void main(String[] args) {
    int arr[]={1,2,0,0,0,3,6};
    int result[]=isMoved(arr);
    System.out.println("array found : "+Arrays.toString(result));
}
static int[] isMoved(int arr[])
{
    
    int newArr[]=new int[arr.length];
    int n=arr.length-1;
    int j=0;
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]==0)
    {
       newArr[n]=arr[i];
       n--; 
    }
    else{
        newArr[j]=arr[i];
        j++;
    }
  }
  return newArr;
}
}
