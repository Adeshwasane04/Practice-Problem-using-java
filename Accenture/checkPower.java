package Accenture;
import java.util.Scanner;
public class checkPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(isCheck(num, num2));
    }
    static String isCheck(int num,int num2)
    {
        if(num<1)
        {
            return "value is less than 1";
        }
        while(num%num2==0)
        {
            num/=num2;
        }
       return num==1 ? "not a power of "+num : "yes, this is power of "+num;
    }
}
