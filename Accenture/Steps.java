package Accenture;
import java.util.Scanner;

public class Steps {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter N and M: ");
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        
        long steps =(N % M);
        System.out.println("Minimum steps required: " + steps);
        
        scanner.close();
    }
}


