package Hashmap;

import java.util.HashMap;

//serach problem isomorphic String
public class IsomorphicString {
    public static void main(String[] args) {
        String str1="aabc";
        String str2="xxyx";
        System.out.println(isIsomorphic(str1, str2));
     
    }
 

static boolean isIsomorphic(String str1,String str2)
{ 
    if(str1.length()!=str2.length())
    {
        return false;
    }
   HashMap <Character, Character> map=new HashMap<>();
      
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);

            if(map.containsKey(ch1))
            {
                if(map.get(ch1)!=ch2)
                {
                    return false;
                }
                else if(map.containsValue(ch2))
                {
                    return false;
                }
                else{
                    map.put(ch1, ch2);
                }
                                                                        
            }
        }
         return true;

      }
   }
