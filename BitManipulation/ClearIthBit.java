package BitManipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        int num=10;
        int ith=1;
        System.out.println(isClearPostion(num, ith));
    }
    static int isClearPostion(int num,int ith)
    {
        int bitMask=~(1<<ith);
        return num  & bitMask;
    }
}
