package Accenture;

import java.util.Scanner;

public class MangoDistribution {
 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of mango : ");
    int m=sc.nextInt();
    System.out.print("Enter the number of person : ");
    int p=sc.nextInt();
    sc.close();
    System.out.println(isDistribution(m, p));
   }
   static int isDistribution(int m,int p)
   {
    if(p==0)
    {
            return m==0?1:0;
        }
   int ways=0;
        for(int i=m;i>=0;i--)
        {
            ways+=isDistribution(m-i, p-1);
        }
        return ways;
    }

}
