package Numerical;
import java.util.Scanner;
public class SumOfSmallandLargePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the start : ");
        int start=sc.nextInt();
        System.out.println("Enter the last : ");
        int end=sc.nextInt();
        sc.close();
        System.out.println("Sum of Smallest and largest Prime number is : "+isSumOfFirstAndLastPrime(start, end));

    }
    static int isSumOfFirstAndLastPrime(int start,int end)
    {
        int smallest=-1;
        int largest=-1;
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            if(checkPrime(i) )
            {
                if(smallest==-1) 
                {
                    smallest=i;
                }
                largest=i;
            }
            
        }

        if(smallest!=-1 && largest !=-1)
        {
            sum=smallest+largest;
               
        }
      return sum;
    }
    static boolean checkPrime(int num)
    {    if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                 return false;
            }
        }
        return true;
    }
}
