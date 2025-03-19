package Recurssion;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
       System.out.println("Factorial of "+num +" is : "+isFactorial(num));
    }

    //Time complexity : O(n)
    //space complexity : O(n)
    static int isFactorial(int num)
    {
        if(num==0)
        {
            return 1;
        }
        int factN=num*isFactorial(num-1);
        return factN;
    }
}
