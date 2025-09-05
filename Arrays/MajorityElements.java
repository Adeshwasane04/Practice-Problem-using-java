package Arrays;

import java.util.Arrays;

public  class MajorityElements {
    public static int majorityElement(int[] nums) {
        int normalCount=1;
        int maxCount=1;
      
        Arrays.sort(nums);
          int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
             
            if(nums[i]==nums[i-1])
            {
               normalCount++;  
             
            }
            else{
                   normalCount = 1;  
            }
          if (normalCount > maxCount) {
                maxCount = normalCount;
                ans = nums[i];
            }

        }
        return ans;
    }

	public static void main(String[] args) {
		int nums[]={3,3,4};
	    System.out.println(majorityElement(nums));
	}
}
