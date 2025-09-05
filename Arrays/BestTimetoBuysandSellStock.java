package Arrays;
public class BestTimetoBuysandSellStock {
    public static void main(String[] args) {
         int price[]={3,2,6,5,0,3};
         int ans=isProfitPrice(price);   
         System.out.println("profit is : "+ans);

    }

    static int isProfitPrice(int price[])
    {
       int buyVal=0;
       int indexSell=0;
       int maxProfit=0;
       int check=0;
        int sellVal=Integer.MIN_VALUE;
        for(int k=0;k<price.length;k++)
        {
            if(sellVal<price[k])
            {
                sellVal=price[k];
                indexSell=k;
            }
        }
       for(int i=0;i<indexSell;i++)
       {
           buyVal=price[i];
           check=sellVal-buyVal;
           if(maxProfit<check)
           {
            maxProfit=check;
           }
       }
       return maxProfit;
    }
 
   
}
