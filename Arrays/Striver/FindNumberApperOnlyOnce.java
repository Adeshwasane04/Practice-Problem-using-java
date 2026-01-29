package Arrays.Striver;

//  Find the number that appears once, and the other numbers twice

public class FindNumberApperOnlyOnce {
   public static void main(String[] args) {
    int arr[]={2,1,2};
     int ans=isApperOnlyOnce(arr);
     System.out.println(ans);

   }
  public static int isApperOnlyOnce(int arr[]) 
  {
     /* 
     This is brute force approach
      for(int i=0;i<arr.length;i++)
      {
          int ans=arr[i];
        int count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(ans==arr[j])
            {
                count++;
            }
            
        }   
        if(count==1)
        {
           return ans;
        }
      }
      return  -1;
      */

      /*Better approach to solve this problem is hashing */

      
    int maxElem = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] > maxElem) {
        maxElem = arr[i];
    }
}

int Hash[] = new int[maxElem + 1];

for (int i = 0; i < arr.length; i++) {
    Hash[arr[i]]++;
}

for (int i = 0; i < arr.length; i++) {
    if (Hash[arr[i]] == 1) {
        return arr[i];
    }
}

return -1;

  }
}
;