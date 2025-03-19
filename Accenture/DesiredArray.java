package Accenture;
import java.util.*;
public class DesiredArray {
    public static void main(String[] args) {
        int arr[] = {3,6,9,12};
        int k = 4;
        System.out.println("Sum of k-Smallest non-Divisible Integers is: " + isOutput(arr, k));
    }

    static int isOutput(int arr[], int k) {
        int result = 0;  // To store the sum of k smallest non-divisible integers
        int num = 1;     // Starting number to check for non-divisibility
        int count = 0;   // To keep track of how many non-divisible numbers have been found

        // Loop until we find k non-divisible numbers
        while (count < k) {
            boolean isDivisible = false;

            // Check if num is divisible by any element in arr
            for (int i = 0; i < arr.length; i++) {
                if (num % arr[i] == 0) {
                    isDivisible = true;
                    break;  // Stop checking if num is divisible by any element in arr
                }
            }

            // If num is not divisible by any element in arr, add it to result
            if (!isDivisible) {
                result += num;
                count++;
            }

            // Move to the next number
            num++;
        }

        return result;

}
}
