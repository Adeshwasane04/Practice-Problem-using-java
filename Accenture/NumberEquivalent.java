package Accenture;

public class NumberEquivalent {
    public static void main(String[] args) {
        String str="DCCBAA";
       System.out.println(isEquivalent(str));
    }
    static int isEquivalent(String str)
    {
        int sum=0; 
       str=str.toUpperCase();
        for(char ch: str.toCharArray())
        {
           switch (ch) {
            case 'A':
                 sum+=1;
                break;
            case 'B':
                sum+=10;
               break;
            case 'C':
               sum+=100;
              break;
            case 'D':
              sum+=1000;
             break;
            case 'E':
             sum+=10000;
            break;
            case 'F':
            sum+=100000;
           break;
           case 'G':
           sum+=1000000;
          break;

            default:
            sum+=0;
                break;
           }
        }
        return sum;
    }
}
