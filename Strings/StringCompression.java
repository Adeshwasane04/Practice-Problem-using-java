package Strings;

//this is the program used for compress the string by replacing the repeateding 
//character with their repeatation count 

//time Complexity of this problem is O(n)
public class StringCompression {
    public static void main(String[] args) {
        String str="abbccccc";
        System.out.println(isCompress(str));
    }
    static String isCompress(String str)
    {
        StringBuilder newStr=new StringBuilder("");
        Integer count=1;
        for(int i=0;i<str.length();i++)
        {
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count>1)     
            {
                newStr.append(count.toString());
                count=1;
            }
           
        }
        return newStr.toString();
    }
}
