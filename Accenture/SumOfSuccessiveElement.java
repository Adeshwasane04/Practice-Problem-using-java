package Accenture;

import java.util.Scanner;
//sum of successive element 
//Input : 
/*
 arr:10,12,16,1,5,6,3,21
 len:8
 n:3
 output:22

 Explaination: n=3 so take to value of 3rd index of array i.e 16 and 6th index i.e 6 sum=22
 */
public class SumOfSuccessiveElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int len=sc.nextInt();
        System.out.print("Enter the array element");
        int arr[]=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("Sum of sucessive is: "+isSumOfSuccessive(arr, n));
    }

    static int isSumOfSuccessive(int [] arr,int n)
    {
        int sum=0;
        if(arr==null)
        {
            return -1;
        }
        if(n<0 || n>=arr.length)
        {
            return 0;
        }
       
        for(int i=n-1;i<arr.length;i+=n)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
