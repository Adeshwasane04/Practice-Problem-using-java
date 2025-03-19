package TwodARRAYS;

public class DiagonalSum {
    public static void main(String[] args) {
         int [][] arr={{0,1,2},
                       {3,4,5},
                       {6,7,8},
                       };
        isDiagonalSum(arr);
    }
    static void isDiagonalSum(int [][] arr)
    {
        int pd=0;
        int sd=0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i]==arr[j])
                {
                    pd+=arr[i][j];
                }
                else if(i+j==arr.length-1)
                {
                      sd+=arr[i][j];
                }
            }
        }
        System.out.println(pd+sd);
    }
}
