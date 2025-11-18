package LoopProblem;
public class SumOfSeries {
    public static void main(String[] args) {
        int arr[]={1,-2,3,-4,5};
        System.out.println("Sum of the given array is :  "+isSum(arr));
    }
   static int isSum(int arr[]) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) {
            ans += arr[i];
        } else {
            ans -= arr[i];
        }
    }
    return ans;
}

}
