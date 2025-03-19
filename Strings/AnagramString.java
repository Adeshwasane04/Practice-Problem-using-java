package Strings;

//this is the program is to check the give string is anagram or not
//if the letter in the string one is equal to letter in the string two then the given 
// string is anagram
public class AnagramString {


//this is thr brute force approach

    public static void main(String[] args) {
        String str1="Earth";
        String str2="Heart";
        if (isAnagram(str1, str2)) {
            System.out.println("Given String "+str1 +" & "+str2 + " is Anagram");
        }
        else{
            System.out.println("is Not Anagram");
        }
       
    }
    static boolean isAnagram(String str1, String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
        
        char ch1[]=new char[str1.length()];
        char ch2[]=new char[str2.length()];

    for(int i=0;i<str1.length();i++)
    {
        ch1[i]=str1.charAt(i);
    }
    for(int l=0;l<str1.length();l++)
    {
        ch2[l]=str2.charAt(l);
    }
     int flag=0;
    for(int j=0;j<str1.length();j++)
    {
      for(int k=0;k<str2.length();k++)
      {
        if(ch1[j]==ch2[k])
        {
            flag++;
        }
     
      }
    }
      if(flag==str1.length() && flag==str2.length())
      {
          return true;
      }
    }

     return false;
    
}
}