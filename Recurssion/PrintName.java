package Recurssion;

public class PrintName {
    public static void main(String[] args) {
        int num=5;
        String str="Adesh";
        System.out.println(isPrint(num, str));
    }
  static String isPrint(int num,String str)
  {
     if(num==0)
     {
        return "";
     }
      return str+"\n"+isPrint(num-1, str);
  }

}
