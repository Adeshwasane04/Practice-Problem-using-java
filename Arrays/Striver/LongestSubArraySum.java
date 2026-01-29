package Arrays.Striver;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(isLongestSubarray(arr, k));
    }
    static int isLongestSubarray(int arr[],int k)
    {
        int LongestSubArr=0;
            
            for(int i=0;i<arr.length;i++)
            {
                int sum=0;
                
                for(int j=i;j<arr.length;j++)
                {
                    sum+=arr[j];
                    if(sum==k)
                    {
                       LongestSubArr= Math.max(LongestSubArr,j-i+1);
                    }
                }
            }
            return LongestSubArr;
    }
}
