package TwodARRAYS;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2},
                     {4,5},
                     {6,7}
                    };
        int row=arr.length;
        int col=arr[0].length;
         printMatrix(arr);

         //transpose of the matrix
         int matrix[][]=new int[col][row];
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                matrix[j][i]=arr[i][j];

            }
         }
         printMatrix(matrix);
    }
    static void printMatrix(int arr[][])
    {
        System.out.println("the oringinal matrix is: ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


