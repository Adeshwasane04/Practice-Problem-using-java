package Accenture;

import java.util.Scanner;

//input: str1=are, str2=denim  compare both string who is greater put them in n-1 position
//output: aeeimnrd

public class MergeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the first string : ");
        String str1=sc.next();
        System.out.print("Enter the second string : ");
        String str2=sc.next();
        sc.close();
        System.out.println(newString(str1, str2));
    }
 static String newString(String str1,String str2)
 {
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    int minLength = Math.min(str1.length(), str2.length());
   
    StringBuilder product=new StringBuilder();
    StringBuilder product2=new StringBuilder();
    
    for(int i=0;i<minLength;i++)
    {
        char ch1=str1.charAt(i);
        char ch2=str2.charAt(i);
        if(ch1<ch2)
        {
           product.append(ch1);
           product2.insert(0, ch2);
        }
        else{
            product.append(ch2);
            product2.insert(0, ch1);
        }
       
    }
    //append further left charecter if left
    if (str1.length() > minLength) {
        product.append(str1.substring(minLength));
    } else if (str2.length() > minLength) {
        product.append(str2.substring(minLength));
    }
    product.append(product2);
    return product.toString();
 }
}
