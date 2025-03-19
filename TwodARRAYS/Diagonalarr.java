package TwodARRAYS;

public class Diagonalarr {
    public static void main(String[] args) {
        int [][] arr=/*{{1,2,3,4},
                      {5,6,7,8},
                       {9,10,11,12},
                      {13,14,15,16}};*/

                      {{1,2,3},
                        {4,5,6},
                       {7,8,9}};

       System.out.println("Diagonal  Sum : "+isDiagonalarr(arr));
    }

    //time complexity O^2
    //brute force approach 
    // static int isDiagonalarr(int [][] arr)
    // {
        
    //     int endRow=arr.length-1;
       
    //     int endCol=arr[0].length-1;
    //     int sumDiagonal1=0;
    //     int sumDiagonal2=0;
       
    //     for(int i=0;i<=endRow;i++)
    //     {
    //         for(int j=0;j<=endCol;j++)
    //         {
    //             if(i==j)
    //             {
    //                 sumDiagonal1+=arr[i][j];
    //             }
    //             else if(i+j==arr.length-1)
    //             {
    //                 sumDiagonal1+=arr[i][j];
    //             }
    //         }   
    //     }
        
    //     return sumDiagonal1+sumDiagonal2;
    // }


    static int isDiagonalarr(int [][] arr)
    {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            //primaryDiiagonal
            sum1+=arr[i][i];

            //SecondaryDiagonal
            if(i!=arr.length-i-1)
            {
                sum2+=arr[i][arr.length-i-1];
            }
        }
        return sum1+sum2;
    }

}
