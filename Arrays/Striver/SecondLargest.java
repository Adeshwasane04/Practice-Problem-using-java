package Arrays.Striver;


//Program to find Second largest Element in the array
public class SecondLargest {
    public static void main(String[] args) {
        int nums[]={9,10, 17,15,10};

     // int nums[]={10,10,10} output=-1
        System.out.println(secondLargestElement(nums));
    }
     public static int secondLargestElement(int[] nums) {
     
       int largest=Integer.MIN_VALUE;
       int SecLargest=Integer.MIN_VALUE;

       for(int num:nums)
       {
        if(num>largest)
        {
           SecLargest=largest;
          largest=num;
        
        }
        else if(num<largest && num>SecLargest)
        {
          SecLargest=num;
        }
       }
       return  SecLargest==Integer.MIN_VALUE?-1:SecLargest;
    }
}
