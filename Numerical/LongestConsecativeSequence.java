package Numerical;

import java.util.Arrays;

public class LongestConsecativeSequence {
    public static void main(String[] args) {
        int arr[]={100, 200, 1, 3, 2, 4};
        System.out.println("Largest : "+findLongestSeq(arr));
    }
    static int findLongestSeq(int arr[])
    {
        Arrays.sort(arr);
      int longest=1;
      int currentStreak=1;
      for(int i=1;i<arr.length;i++)
      {
      
         if(arr[i]==arr[i-1]+1)
         {
             currentStreak++;
         }
        else if(arr[i]!=arr[i-1])
        {
            longest=Math.max(longest, currentStreak);
            currentStreak=1;
        }
      }
      longest=Math.max(currentStreak, longest);
      return  longest;
    }
}
