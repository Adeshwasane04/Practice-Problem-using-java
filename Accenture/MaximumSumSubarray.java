
package Accenture;
public class MaximumSumSubarray {
    public static void main(String[] args) {
        int arr[]={-2, 1 ,-3, 4, -1 ,2 ,1 ,-5,4};
        System.out.println("is Maximum sum of subarray : "+isMaximumSumOfSubarray(arr));

    }
    static int isMaximumSumOfSubarray(int arr[])
    {
        int isMaxSum=0;
        int sum=0;
       int product=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                product=product+arr[j];
              
                if(sum<product)
                {
                   sum=product;
                }
            }
            product=0;
          isMaxSum=Math.max(isMaxSum, sum);
        }
        return isMaxSum;
    }
}
