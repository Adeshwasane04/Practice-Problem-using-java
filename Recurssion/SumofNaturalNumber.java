package Recurssion;

public class SumofNaturalNumber {
    public static void main(String[] args) {
        int num=5;
        System.out.println("Sum of Natural Number Upto "+num +" is : "+isSumOfNaturalNumber(num));
    }
    static int isSumOfNaturalNumber(int num)
    {
        
        if(num==1){
            return 1;
    }
    return num+isSumOfNaturalNumber(num-1);
}
}