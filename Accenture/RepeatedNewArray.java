package Accenture;

import java.util.ArrayList;

public class RepeatedNewArray {
    public static void main(String[] args) {
        int arr1[]={2,1,4,6,3};
        int arr2[]={1,7,8,3,2};
        ArrayList<Integer> outPut=newArray(arr1, arr2);
       
        System.out.println(outPut);
    }
    
    static ArrayList<Integer> newArray(int arr1[],int arr2[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i:arr1)
        {
            for(int j:arr2)
            {
                if(i==j)
                {
                    arrayList.add(i);
                    break;
                }
            }
        }
       return arrayList;
    }
}
