package BitManipulation;

public class CheckEvenOrOdd {
   // this is the program is used to check the number is even or odd using thier 
   //binary conversion 
   // internally

   public static void main(String[] args) {
      int num=14;
      if(checkEvenOrOdd(num)==true)
      {
        System.out.println("even Number ");
      }
      else{
        System.out.println("Odd number ");
      }
   }
   static boolean checkEvenOrOdd(int num)
   {
        int bitMask=1;
      if((num & bitMask)== 0)
      {
        return true;
      }
      return false;

   }
}
