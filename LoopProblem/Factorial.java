package LoopProblem;

public class Factorial {
    
    public static void main(String[] args) {
        int num=5;
        System.out.println(isFactorial(num));
    }
    static int isFactorial(int num)
    {
        int ans=num;
        if(num==1)
        {
          return 1;
        }
        ans=ans*isFactorial(num-1);
        return ans;
    }
}
