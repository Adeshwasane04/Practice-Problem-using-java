package Accenture;

public class NearestInteger {
    public static void main(String[] args) {
        int num=26;
        int M=3;
        System.out.println("Nearest multiple of " + M + " to " + num + " is: " + isNearest(num, M));
    }
    static int isNearest(int num,int M)
    {
       int minDiff= Integer.MAX_VALUE;
       int diff=0;
       int output=0;
       for(int i=1;i<=10;i++)
       {
      
           diff=Math.abs(num-M*i);
         
          if(diff<minDiff)
          {
            
            minDiff=diff;
            output=M*i;
             
          }
         
        
       }
       
       
       return output;
    }
  
}
