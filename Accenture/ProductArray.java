package Accenture;

import java.util.Arrays;

public class ProductArray {

//you have given a array and ex:arr[]={2,3,7,5}
//and at 0th index you have to put the multiple of index 1*2*3
//i.e 105 means at 0th index element of the array is 105 
// and condition is that you have to dont consider that array element where you are going to placed 
//the output value

    public static void main(String[] args) {
        int arr[]={2,3,7,5};
        System.out.println(Arrays.toString(isOutput(arr)));

    }

    //Time Complexity of this Function is O(n2)
    // static int[] isOutput(int arr[])
    // {
    //     int product=1;
    //     int arrayProduct[]=new int[arr.length];
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=0;j<arr.length;j++)
    //         {
    //             if(i!=j)
    //             {
    //                 product*=arr[j];
    //             }
    //         }
    //         arrayProduct[i]=product; 
    //         product=1;   
    //     }
    //    return arrayProduct;
    // }


    //time Complexity of this function is O(N)
    static int[] isOutput(int arr[])
    {
        int productArray[]=new int[arr.length];
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
        }
        int rem=1;
        for(int i=0;i<arr.length;i++)
        {
           rem=product/arr[i];
           productArray[i]=rem;
        }
        return productArray;
    }
}
