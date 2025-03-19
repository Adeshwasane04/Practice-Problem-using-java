package Numerical;
import java.util.Scanner;
public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Email Address : ");
        String str=sc.nextLine();
        sc.close();
        if(isCheckEmail(str))
        {
            System.out.println("This Valid Email Address");
        }
        else{
            System.out.println("This is Invalid Email Address");
        }
        
    }

    static boolean isCheckEmail(String str)
    {
        String isCheck="@gmail.com";
        if(str.contains(isCheck))
        {
            return true;
        }
        return false;
    }
}
