package Arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicataeTwo {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1,2,3,3,3,3};
        int ans=removeDuplicates(arr);
          for(int i=0;i<ans;i++)
          {
             System.out.print(arr[i]+" ");
          }
    }

static int removeDuplicates(int[] arr) {
       TreeSet<Integer> arrElem=new TreeSet<>();//TreeSet automatically sorts elements in ascending order.
       for(int  i:arr){                         //HashSet only return no. of element int the hashset
                                                 // LinkedHashSet maintains insertion order (not useful here since input is sorted).

        arrElem.add(i);
    }
    int k=0;
     for(int i:arrElem)
     {
        arr[k]=i;
        k++;
     }
      return k;
    }
}
