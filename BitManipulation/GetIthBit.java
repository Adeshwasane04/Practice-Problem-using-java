package BitManipulation;

public class GetIthBit {
    public static void main(String[] args) {
        int num=10;//the digit get converted into binnary digits internally
        int ith=3; //represent the position for shifting
        System.out.println("bit at ith position is : "+getIthBit(num, ith));
    }
    static int getIthBit(int num,int ith)   
    {
        int bitMask=1<<ith;
        if((num & bitMask)==0)
        {
            return 0;
        }
        return 1;
    }
}
