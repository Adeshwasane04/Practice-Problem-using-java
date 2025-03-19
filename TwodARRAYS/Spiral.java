package TwodARRAYS;

public class Spiral {
    public static void main(String[] args) {
        int [] [] arr={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16},
                       {17,18,19,20}
                    };

                    System.out.println("Spiral Matrix is : "+ printSpiralMatrix(arr));
    }
    static String printSpiralMatrix(int arr[][])
    {
         int startRow=0;
         int endRow=arr.length-1;
         int startCol=0;
         int endCol=arr[0].length-1;

         StringBuilder output=new StringBuilder();
         while(startRow<endRow && startCol<endCol)
         {
            //top
            for(int i=startCol;i<=endCol;i++)
            {
                 output.append(arr[startRow][i]).append(" ");
            }
            //right
            for(int j=startRow+1;j<=endRow;j++)
            {
                output.append(arr[j][endCol]).append(" ");
            }
            //bottom
            if(startRow<endRow)
            {
                for(int k=endCol-1;k>=startCol;k--)
            {
                output.append(arr[endRow][k]).append(" ");
            }

            }
            
            //right
            if(startCol<endCol)
            {
                for(int l=endRow-1;l>startRow;l--)
                {
                    output.append(arr[l][startCol]).append(" ");
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
         
         }
         return output.toString();
    }
}
