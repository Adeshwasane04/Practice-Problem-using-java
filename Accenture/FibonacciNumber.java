package Accenture;

public class FibonacciNumber {
    
	public static void main(String[] args) {

        int num1=0;
        int num2=1;
        int fibo=5;
      
        System.out.print(num1+" "+num2);
        for (int i=2;i<fibo;i++ ) 
        {
            int next=num1+num2;
            System.out.print(" "+next);
            num1=num2;
            num2=next;
        }
        
    }
 
}
