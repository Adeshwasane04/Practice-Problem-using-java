package Accenture;

public class ToogingBinaryBits {
    public static void main(String[] args) {
        int num=10;
         System.out.println(isTogged(num));
    }
    static int isTogged(int num)
    {
        if(num==1)
        {
            num=0;
        }
        else{
            num=1;
        }
        return num;
    }
}
