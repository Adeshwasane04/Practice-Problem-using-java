package Arrays;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[]={1,2,0,3,3,0,2,0};
        int ans[]=isRemovedtoEnd(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] isRemovedtoEnd(int arr[])
    {
        int index=0;
        for(int i:arr)
        {
            if(i!=0)
            {
                 arr[index++]=i;
            }
        }
        while(index<arr.length)
        {
           arr[index++]=0;
         }
          return arr;
        }
}
