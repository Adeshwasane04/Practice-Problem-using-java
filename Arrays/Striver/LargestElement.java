package Arrays.Striver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={3,3,0,99,-40};
        System.out.println(largestElement(arr));
    }
     public static int largestElement(int[] nums) {
         //first ways to solve
        /* Arrays.sort(nums);
           int largeElem=nums[nums.length-1];
           return  largeElem;
        */ 

        ///2nd way
        int isLargest=nums[0];
        for(int i:nums)
        {
            if(i>isLargest)
            {
                isLargest=i;
            }
        }
        return isLargest;
    }

}
