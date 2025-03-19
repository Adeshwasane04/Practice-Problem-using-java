package Accenture;

import java.util.Scanner;

public class AdjecentRemoved {
    public static void main(String[] args) {
       
        //here in this program if there is two or more than two adjecent carecter repeted 
        //then removed that char from the string and make sure that they are adjecent
        //Input: abciijklma
        //Output:  abcjklma
        System.out.print("Enter the String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Output : "+isFind(str));

    }
    static String isFind(String str)
    {
        StringBuilder result=new StringBuilder();
       boolean isDuplicate =false;
       
       for(int i=1;i<str.length();i++)

       {
        char prevChar=str.charAt(i-1);

         char currChar=str.charAt(i);
         if(prevChar==currChar)
         {
            isDuplicate=true;
            continue;
         }
         else{
             if(!isDuplicate)
             {
                result.append(prevChar);
             }
             prevChar=currChar;
             isDuplicate=false;
         }
       
    }
    if(!isDuplicate){
    result.append(str.charAt(str.length()-1));
    }
    return result.toString();
}
}
