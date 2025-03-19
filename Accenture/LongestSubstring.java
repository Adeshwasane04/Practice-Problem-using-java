package Accenture;

import java.util.Scanner;

public class LongestSubstring {

//the code is to check the logest substring

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string to check substring : ");
        String str=sc.next();
        sc.close();
        System.out.println("Longest substring in the string is :"+isLongest(str));
    }
    static int isLongest(String str)

    {
        StringBuilder product=new StringBuilder();
        String maxProduct="";
        str=str.toLowerCase();
         int finalCount=1;
         int count=1;
         product.append(str.charAt(0));
        for(int i=0;i<str.length()-1;i++)
        {
            
            char ch=str.charAt(i);
            char ch2=str.charAt(i+1);
            if((int)ch==((int)ch2-1))
            {
                count++;
               product.append(ch2);
            }
           
            else if((int)ch!=((int)ch2-1))
            {
                finalCount= Math.max(finalCount, count);
                count=1;
                if(product.length()>maxProduct.length())
                {
                    maxProduct=product.toString();
                }
                product.setLength(0);
                product.append(ch2);
            }
        }
        finalCount= Math.max(finalCount, count);
      
        System.out.println("Longest substring is : "+maxProduct);
        return finalCount;
    }
}
