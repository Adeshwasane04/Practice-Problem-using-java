package Twopointer;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
       removeDuplicates(arr);
     
    }
    static void removeDuplicates(int[] nums)
    {
       
       int j=1;
       int seq=0;
       for(int k=0;k<nums.length-1;k++)
       {
          if(nums[k]==nums[j])
          {
            j++;
          }
          else{
            if(j==nums.length)
            {
                nums[seq]=nums[j];
            }
             nums[seq]=nums[k];
            seq++;
            j++;
            
          }
        
       }
      for(int i=0;i<=seq;i++)
      {
        System.out.print(nums[i]);
      }
    }   
 }

