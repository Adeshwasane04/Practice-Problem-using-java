package Accenture;
import java.util.ArrayList;

public class EqualSubarray {
   public static void main(String[] args) {
     int arr[]={1,0,1,1,1,0,0};
     System.out.println(isCheck(arr));
   } 
   static int isCheck(int arr[])
   {
    int count1s=0;
    int count0s=0;
   
    ArrayList <Integer> isStore =new ArrayList<>();
    int ans=0;
    
     for(int i=0;i<arr.length;i++)
     { 
        
          
        for(int j=0;j<arr.length;j++)
        {
            
            if(arr[j]==1)
            {
              count1s++;
            }
            else{
                count0s++;
            }
            if(count1s==count0s)
            {
              isStore.add(count0s+count1s);
            }

        }
        count0s=0;
        count1s=0;
            
     }
   
     for(int i=0;i<isStore.size();i++)
     {
        if(isStore.get(i)>ans)
        {
            ans=isStore.get(i);
        }
     }
    
     return ans;
   }
}
