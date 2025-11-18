package LoopProblem;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=27374;
      System.out.println("Reverse number is : "+isReverseNumber(num));
    }
    static int isReverseNumber(int num)
    {
         int reverseNum=0;
        while(num!=0)
        {
            int rem=num%10;
             reverseNum=reverseNum*10+rem;
             num/=10;
        }
       return  reverseNum;
    }
}
