package Strings;

public class CheckPalindrom {
    public static void main(String[] args) {
        String [] str={"noon","madam","car","adesh","maaam"};
        for (String word : str) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is not a palindrome");
            }
        }
    }
    static boolean isPalindrome(String word)
    { 
        String check="";
            for(int i=word.length()-1 ;i>=0;i--)
            {
               
                char ch=word.charAt(i);
                check=check+ch;
                if(check.equals(word))
                {
                   return true;
                }
               
            }
     
        return false;
    }
}
