package TwodARRAYS;

public class SumOfRow {
    public static void main(String[] args) {
        int [][] arr={{1,4,9},{11,4,3},{2,2,3}};
        int targetRow=2;
        System.out.println(sumOfTargetedRow(arr, targetRow));
    }
    static int sumOfTargetedRow(int arr[][],int targetRow)
    {
        int sum=0;
        for(int j=0;j<arr[0].length;j++)
        {
            sum+=arr[targetRow][j];
        }   
        return sum;
    }
}
