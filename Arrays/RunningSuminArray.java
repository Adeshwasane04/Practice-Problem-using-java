package Arrays;
public class RunningSuminArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int Arr[]=isSum(arr);
        for (int i : Arr) {
            System.out.print(i+" ");
        }
    }
public static int[] isSum(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
         if(i>0)
         {
            arr[i]=arr[i-1]+arr[i];
         }
    }
    return arr;
}
}
