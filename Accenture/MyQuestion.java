package Accenture;
public class MyQuestion {
    public static void main(String[] args) {
        String str ="abc.b.cc.abccd";
         System.out.println( isCheck(str));
    }
    static int isCheck(String str)
    {
        int max=0;
       String isSplit[]=str.split("\\.");
       for(String s: isSplit)
       {
           if(s.length()>max)
           {
            max=s.length();
           }
       }
       return max;
    }
}
