import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {6,2,5,4,7,1};

       
        System.out.println( cyclicSort(arr)); 
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
    
        while (i < arr.length) {
            int correct = arr[i] - 1; 
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            
            } 
            System.out.print(arr[i]+" ");
            i++;
            
        }
        System.out.println(arr);
        int j;
        for( j=arr.length-1;j>=0;j--)
        {
              if(arr[j]==j+1)
              {
               continue;
              }
              else{
                return j+1;
              }
        }
       return 0;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
