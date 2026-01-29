package Arrays.Striver;
import java.util.ArrayList;


public class UnionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,7};

        /*This is Brute force appoarch */
        // HashSet <Integer> Union=new HashSet<>();

        // for(int i=0;i<arr1.length;i++)
        // {
        //     Union.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++)
        // {
        //     Union.add(arr2[i]);
        // }
        
        //     System.out.println(Union);

        /*Using two pointer Apporoach */
        ArrayList <Integer> newArr2=new ArrayList<>();
         int n1=arr1.length;
         int n2=arr2.length;

         int i=0;
         int j=0;
         while(i<n1 && j<n2)
         {
            if(arr1[i]<=arr2[j])
            {
                if(newArr2.size() == 0|| (newArr2.get(newArr2.size()-1)!=arr1[i]))
                {
                    newArr2.add(arr1[i]);
                }
                i++;

            }
            else{
              
              
                   if(newArr2.size() == 0 ||(newArr2.get(newArr2.size()-1))!=arr2[j])
                {
                    newArr2.add(arr2[j]);
                }
                j++;

              }
            }
            while(j<n2)
            {
                
                   if(newArr2.size() == 0 || (newArr2.get(newArr2.size()-1))!=arr2[j])
                {
                    newArr2.add(arr2[j]);
                }
                j++;
            }
            while(i<n1)
            {
                   if(newArr2.size() == 0|| (newArr2.get(newArr2.size()-1))!=arr1[i])
                {
                    newArr2.add(arr1[i]);
                }
                i++;
            }
            System.out.println(newArr2);   
            }
         }
        
        
    


