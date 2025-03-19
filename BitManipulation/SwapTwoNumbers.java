package BitManipulation;

//this is the program is for swap two Numbers without using third variable 
// for that we have to use xor operator

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("num1 ="+num1 + " num2 = "+num2);
    }
}
