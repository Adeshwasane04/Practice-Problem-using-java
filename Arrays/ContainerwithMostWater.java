package Arrays;
import java.lang.Math;
//l-11
public class ContainerwithMostWater {
    public static void main (String args[])
    {
        int [] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
   public static  int maxArea(int[] height) {
          int start=1;
         int end=height.length-1;
       
           if(end<2 )
           { 
           if (height[start - 1] > 0 && height[end] > 0) {
              return 1;
            }
           }
   
       
        int leftMax=height[0];
        int rightmax=height[end];
       int leftMaxIndex=0;
       int rightMaxIndex=end;
        
           int Area=0;
           int maxArea=0;
           if(end==2)
       {
             int min=Math.min(leftMax,rightmax);
             return maxArea=end*min;
       }
    
        while(end>0)
        {
           if(leftMax<height[start] )
           {
            leftMax=height[start];
              leftMaxIndex=start;
           }
           else if(rightmax<height[end])
            {
                rightmax=height[end];
              rightMaxIndex=end;
             
               
            }
        
            Area=(rightMaxIndex-leftMaxIndex)*Math.min(rightmax,leftMax);
           
           if(maxArea<Area)
           {
              maxArea=Area;
           }
                start++;
                end--;
        }
        return maxArea;
    }
}
