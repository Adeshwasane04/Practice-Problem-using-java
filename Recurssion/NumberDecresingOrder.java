package Recurssion;

public class NumberDecresingOrder {
    public static void main(String[] args) {
        int num=10;
     
        System.out.println(isMethod(num));

        
    }
    static String isMethod(int num)
    {   

        if(num==0)
        {
            return " ";
        }
     
     return num +" "+ isMethod(num-1);
}
}