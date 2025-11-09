package Arrays;
import java.util.Arrays;
import java.util.stream.IntStream;

// Here we have given an array and we have to rotate that arrays from nth element
// input : 1,2,3,4,5,6
// output : 4,5,6,1,2,3
/*  Way to solve: 
  rotate 1 steps to the right: [7,1,2,3,4,5,6]
  rotate 2 steps to the right: [6,7,1,2,3,4,5]
  rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int num=3;
        int [] ans=isRotatedArray(arr, num);
        for (int i = 0; i < ans.length; i++) {
         System.out.print(ans[i]+" ");   
        }
    }
    static int[] isRotatedArray (int [] nums, int k)
{ 
        k = k % nums.length;
    for (int i =0;i<k; i++) {
        int lastFirst=nums[nums.length-1];
      for(int j=nums.length-1;j>0;j--)
       {
          nums[j]=nums[j-1];
       
       }
       nums[0]=lastFirst;
       
    }       
      
    return nums;
}
}