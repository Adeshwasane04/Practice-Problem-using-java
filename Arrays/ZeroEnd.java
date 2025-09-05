package Arrays;

public class ZeroEnd {
    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        int j=0;
       
           for(int i=1;i<nums.length;i++)
	        {
                    if(nums[i-1]==0)
	            {
	                if(nums[i]!=0)
	                {
	                  int temp=nums[i-1];
                      nums[j]=nums[i];
                      nums[i]=temp;
                   j++;
	                }
	            }
	        }

            for(int k=0;k<nums.length;k++)
            {
                System.out.print(nums[k]+" ");
            }
    }
       
}
