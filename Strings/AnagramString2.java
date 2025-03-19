
package Strings;
import java.util.Arrays;
public class AnagramString2 {
    public static void main(String[] args) {
        String str1="Heart";
        String str2="Earth";
 
        if(isAnagram(str1, str2))
        {
            System.out.println(str1+" and "+str2+" are Anagram of each others");
        }
        else{
            System.out.println(str1+" and "+str2+" are NOT Anagram of each others " );
        }

    }
    static boolean isAnagram(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        if(str1.length()==str2.length())
        {
           char [] str1CharArray=str1.toCharArray();
           char [] str2CharArray=str2.toCharArray();

           //this is used for sorting the array
           Arrays.sort(str1CharArray);
           Arrays.sort(str2CharArray);

           if(Arrays.equals(str1CharArray, str2CharArray))
           {
            return true;
           }

        }
        return false;
    }
}
