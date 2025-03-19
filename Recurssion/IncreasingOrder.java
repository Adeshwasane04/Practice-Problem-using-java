package Recurssion;

public class IncreasingOrder {
    public static void main(String[] args) {
        int num=10;
         printInc(num);
    }
    static void printInc(int num)
    {
        if(num==1)
        {
           System.out.print(num+" ");
            return ;
        }
      printInc(num-1);
     
      System.out.print(num+" ");
    }
}
