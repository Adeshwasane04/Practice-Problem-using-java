package BitManipulation;

public class SetithBit {
    public static void main(String[] args) {
        int ithBit = 2;
        int num=10;
       System.out.println(setIthBit(ithBit, num));
    }

    static int setIthBit(int ithBit,int num)
    {
        int bitMask=1<<ithBit;
        return num|bitMask;
    }
}
