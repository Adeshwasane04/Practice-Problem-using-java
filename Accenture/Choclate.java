package Accenture;

import java.util.ArrayList;
import java.util.Arrays;

public class Choclate {
    public static void main(String[] args) {
        int arr[]={4,5,0,1,9,0,5,6};
       
            int ans[]=moveZerosToEnd(arr);
        System.out.print(Arrays.toString(ans));
    }
    static int [] moveZerosToEnd(int arr[])
    {
         int newArray[]=new int[arr.length];
         int index=0;

         for(int i=0;i<arr.length ;i++)
         {
           if(arr[i]!=0 )
           {
              newArray[index++]=arr[i];
             
           }
           
         }
         return newArray;
    }
}
