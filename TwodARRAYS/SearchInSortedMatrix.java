package TwodARRAYS;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
         int key=33;
       isAddressOfKey(key, matrix) ; 
    }
    static boolean isAddressOfKey(int key,int matrix[][])
    {  int run=0;
       int row=matrix.length-1;;
       int col=0;
       while(row>=0 && col<matrix[0].length)
       {
         int specialElemnt=matrix[row][col];
         if(specialElemnt==key)
         {  run++;
            System.out.println(run);
            System.out.println("found key at : "+"("+row+","+col+")");
            return true;
         }
         else if(key>specialElemnt)
         {
            col++;
         }
         else
         {
            col--;
         }
       }
          System.out.println("Elemnt Not found ! ");
          return false;
    }
}
