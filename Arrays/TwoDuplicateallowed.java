package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDuplicateallowed {
     public static void main(String[] args) {
        int arr[]={1,1,1,1,1,2,2,2,3,4};
       isDuplicateElement(arr);
       

     }
     static void isDuplicateElement(int nums[])
     {
        ArrayList<Integer> newNums=new ArrayList<>();
        int flag=1;
        int k=1;
        newNums.add(nums[k]);
        for(int i=1;i<nums.length;i++)
        {
          if(nums[i]==nums[i-1])
          {
            
            if(flag<=2)
            {
               newNums.add(nums[i]);
               k++;
            }
            
          }

          else{
            flag=1;
            newNums.add(nums[i]);
            flag++;
            k++;
          }
         
        }
        System.out.println(k);
        System.out.print(newNums);
     }
}
