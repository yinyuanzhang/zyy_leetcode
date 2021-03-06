package niuke_top200.剑指offer.lee59_63;

public class MaxProfitII {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices){
        if(prices.length < 2) return 0;

        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]){
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
