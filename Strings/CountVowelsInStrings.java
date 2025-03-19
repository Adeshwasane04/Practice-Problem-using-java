package Strings;

public class CountVowelsInStrings {
    public static void main(String[] args) {
            String str="adesh wasane hello";
            System.out.println("Number of vowels in the string is : "+countVowels(str));
    }
    static int countVowels(String str)
    { 
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'||ch=='u')
            {
               count++;
            }
        }
        return count;
    }
}
