package Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        int k = removeDuplicate(arr);
        System.out.println("Number of unique elements: " + k);

        // Printing modified array
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicate(int arr[]) {
        if (arr.length == 0) return 0;

        int k = 1; // Pointer for unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i]; // Move unique elements forward
                k++;
            }
        }
        return k; // New length of unique elements
    }
}
