package Numerical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Prime numbers from 1 to " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {  
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) { // Fix: Run loop till sqrt(num)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
