package TwodARRAYS;
//page number : 2
public class StairCaseSearch {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50} 
                };
        int key=33;
        searchElement(arr, key);
            }
       static boolean searchElement(int arr[][],int key)
       {
        int row=0,  col=arr[0].length-1;
        int run=0;
        //run defind how many time it called
        while(row<arr.length && col>=0)
        {
           run++;
          if(arr[row][col]==key)
          {
            System.out.println("found key at : "+"("+row+","+col+")");
            return true;
          }
          else if(key>arr[row][col])
          {
            row++;
          }
          else
          {
            col--;
          }
         
        }
        System.out.println(run);
        System.out.println("Key not found ! ");
        return false;
       }
    }

