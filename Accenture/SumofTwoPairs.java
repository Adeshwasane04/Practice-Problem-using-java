package Accenture;

public class SumofTwoPairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 7, 15,3};
        int isEqual = 18;
        int result[] = isPairs(arr, isEqual);

        if (result[0] == 0 && result[1] == 0) {
            System.out.println("No pairs found with the given sum.");
        } else {
            System.out.println("The pair with the highest product and sum equal to " + isEqual + " is: (" + result[0] + ", " + result[1] + ")");
        }
    }

    static int[] isPairs(int arr[], int isEqual) {
        int pair[] = new int[2];
        int maxProduct = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Start from j = i + 1 to avoid pairing an element with itself
                if (arr[i] + arr[j] == isEqual) {
                    int product = arr[i] * arr[j];
                    if (product >= maxProduct && arr[i]>arr[j]) {
                        maxProduct = product;
                        pair[0] = arr[i];
                        pair[1] = arr[j];
                    }
                }
            }
        }

        return pair;
    }
}
