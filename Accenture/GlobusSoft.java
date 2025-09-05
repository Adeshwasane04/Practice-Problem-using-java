package Accenture;

import java.util.ArrayList;

public class GlobusSoft {
    public static void main(String[] args) {
        int num=4;

    }
    static int isAnswer(int num)
    {
        int ans=0;
        ArrayList <Integer> isStorage=new ArrayList<>();
        for(int i=1;i<=num;i++)
        {
           isStorage.add(i);
        }
        
        isStorage.clear();
       for(int i=0;i<isStorage.size()-1;i++)
       {
          isStorage.add[i]=isStorage[i+1]+isStorage[i];
       }
    }
}
