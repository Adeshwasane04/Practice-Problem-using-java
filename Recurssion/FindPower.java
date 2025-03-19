package Recurssion;

public class FindPower {
    public static void main(String[] args) {
        int num=2;
        int pow=10;
        System.out.println("Power of given num is: "+isPower(num, pow));
    }
    static int isPower(int num,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        
        return num*isPower(num, pow-1);
    }
}
