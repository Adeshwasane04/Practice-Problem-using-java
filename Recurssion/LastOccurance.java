package Recurssion;

public class LastOccurance {
    public static void main(String[] args) {
        int arr[]={1,2,46,7,5,9,5,0};
        int key=5;
        System.out.println(findLastOccurance(arr, key, 0));
    }
    //WAP to find index position of the last occurance of the given key 
    static int findLastOccurance(int arr[],int key,int i)
    {       
       if(i==arr.length)
       {
        return -1;
       }
       int isFound= findLastOccurance(arr, key, i+1);
       if(isFound==-1 && arr[i]==key)
       {
        return i;
       }
       
       return isFound;
    }
     

}
