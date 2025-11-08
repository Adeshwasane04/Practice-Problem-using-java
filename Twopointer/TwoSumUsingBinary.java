package Twopointer;
    public class TwoSumUsingBinary {
        public static void main(String[] args) {
            int nums[]={2,7,11,15};
            int target=9;
            int ans[]=isTwoSum(nums, target);
            for(int i=0;i<ans.length;i++)
            {
                System.out.print(ans[i]+" ");
            }
        }
        static int[] isTwoSum(int [] nums,int target)
        {
            int start = 0;
            int end = nums.length-1;
            int mid=(start+end)/2;
            int arr[]=new int[2];
                    
            if(nums[mid]+nums[mid-1]<target)
            {
                start=mid;
                
            }
            else{
                end=mid;
            }
            while(start<end)
            {
        
                int sum=nums[start]+nums[end];
                if (sum == target) {
                    arr[0] = start+1; // 1-based indexing
                    arr[1] = end+1;
                    return arr;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            } 
            return arr;
    }

    }