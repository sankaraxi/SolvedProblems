package mediumProblems;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class StocksBuyAndSell {
    public static void main(String[] args) {
//        int[] arr = {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};
        System.out.println(stockProfit(arr));
    }

    static int stockProfit(int[] arr) {
        int mimimum = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mimimum;
            profit = Math.max(profit,cost);
            mimimum=Math.min(mimimum,arr[i]);
        }
        return profit;
    }


}
