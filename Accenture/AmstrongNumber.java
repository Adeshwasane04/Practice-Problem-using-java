package Accenture;

public class AmstrongNumber {
    	 public static void main(String[] args) {
      int num=153;
     
      if(isArmstrong(num)==num)
      {
          System.out.println("is Armstrong Number");
      }
      else System.out.println("is not Armstrong Number");
    }
    public static int isPower(int num){
        int count=0;
         while(num!=0)
         {
             int rem=num%10;
              count++;
              num=num/10;
         }
        return count;
    }
    public static int isArmstrong(int num)
    {
        int ans=0;
        int originalNumber=num;
        int digitCount=isPower(num);
        while(originalNumber!=0)
        {
            int rem=originalNumber%10;
            ans+=(int)Math.pow(rem,digitCount);
            originalNumber/=10;
        }
        return ans;
    }
}
