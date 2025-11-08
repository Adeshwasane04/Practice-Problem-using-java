package Twopointer;
// problem to find the two sum
public class TwoSum {
    public static void main(String[] args) {
        int[] num = {-10, -8, -2, 1, 2, 5, 6};
        int target = 0;

        int newArr[] = isTwoSum(num, target);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    static int[] isTwoSum(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        int arr[] = new int[2];

        while (start < end) {
            int sum = num[start] + num[end];

            if (sum == target) {
                arr[0] = start + 1; // 1-based indexing
                arr[1] = end + 1;
                return arr;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return arr; 
    }
}
