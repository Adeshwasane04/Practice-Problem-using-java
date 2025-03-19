package Strings;

public class LongestString {
    public static void main(String[] args) {
        String str[]={"adesh","wasane","Hello World","Hi"};
        System.out.println("Largest World in the array is : "+isLargestString(str));
    }
    static String isLargestString(String str[])
    {
        String larWord="";
        int maxLength=0;
        
            for(String word: str)
        {
          if(word.length()>maxLength)
          {
                 larWord=word;
                 maxLength=word.length();
          }

        }
        return larWord;
    }
}
