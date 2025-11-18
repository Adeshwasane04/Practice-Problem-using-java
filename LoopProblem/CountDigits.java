package LoopProblem;

public class CountDigits {
    public static void main(String[] args) {
        int num=24;
         System.out.println("count of integer inn the given number is: "+ isCountDigits(num));
    }
    static int isCountDigits(int num)
    {
  
        int ans=0;
        while(num!=0)
        {
           
            ans++;
            num/=10;
        }
       
        return  ans;
    }
}
