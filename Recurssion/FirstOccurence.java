package Recurssion;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,6,4,3,7,9,0,2};
        int key=2;
        System.out.println(findPosition(arr, key,0)+"");
    }
    //WAF to find the first occurence of the element in an array 

    static int findPosition(int arr[],int key,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        
        if(arr[i]==key)
        {
           return i;
        }
        
        return findPosition(arr, key, i+1);
    }
   

}
