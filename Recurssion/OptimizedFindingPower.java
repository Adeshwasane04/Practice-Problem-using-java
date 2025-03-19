package Recurssion;

public class OptimizedFindingPower {
    public static void main(String[] args) {
        int num=2;
        int pow=5;
       System.out.println("power of tthe given number is : "+findPower(num, pow));
    }
    static int findPower(int num,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        int halfpowSqu=findPower(num, pow/2)*findPower(num, pow/2);
       
        if((pow & 1)!=0)
        {
           halfpowSqu=num*halfpowSqu;
        }
        return halfpowSqu;
}
}
