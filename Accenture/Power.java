package Accenture;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        int num1=2;
        int num2=3;
     
       System.out.println(findPower(num1, num2));
    }
    static int findPower(int num1,int num2)
    {
       int ans=(int)Math.pow(num2, num2);
       return ans;
    }
}
