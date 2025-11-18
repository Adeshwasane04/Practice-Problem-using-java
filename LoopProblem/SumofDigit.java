package LoopProblem;

public class SumofDigit {
     public static void main(String[] args) {
        int num=2433444;
         System.out.println("sum of digit in the given number is: "+ isSumDigits(num));
    }
    static int isSumDigits(int num)
    {
  
        int ans=0;
        
        while(num!=0)
        {
           
            int rem=num%10;
            ans+=rem;
            num/=10;
        }
       
        return  ans;
    }
}
