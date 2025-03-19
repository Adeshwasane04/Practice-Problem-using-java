package Recurssion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int num=10;
         System.out.println("fibonacci of the Number is : " +isSumOfFibonaacciNumber(num));
    }
    static int isSumOfFibonaacciNumber(int num)
    {
        if(num==0 || num==1)
        {
            return num;
        }
       
        return isSumOfFibonaacciNumber(num-1)+isSumOfFibonaacciNumber(num-2);
    }
}
