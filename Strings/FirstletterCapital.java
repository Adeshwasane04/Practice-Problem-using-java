package Strings;

//this is the program for the capitailzation of the first letter of the sentence

public class FirstletterCapital {
  public static void main(String[] args) {
    String str="hi, i am Adesh How are you ? ";
    System.out.println(isCapitalize(str));
  }  
  static String isCapitalize(String str)
  {
    
    StringBuilder str2=new StringBuilder("");
    char ch=str.toUpperCase().charAt(0);
    str2.append(ch);
   
    for(int i=1;i<str.length();i++)
    {
        if(str.charAt(i)==' '&& i<str.length()-1)
        {
            str2.append(str.charAt(i));
            i++;
            str2.append(Character.toUpperCase(str.charAt(i)));    
        }
        else{
            str2.append(str.charAt(i));
        }
    }
    return str2.toString();
  }
}
