package niuke_top200.剑指offer.lee59_63;

public class MaxProfitI {

    public static void main(String[] args) {

    }

    public int maxProfitOnce(int[] prices){

        if(prices.length < 2) return 0;
        int min = prices[0];
        int max = prices[0];
        int maxPrice = 0;
        for(int price : prices){
            if(price > max) max = price;
            if(price < min) {
                min = price;
                max = min;
            }
            maxPrice = Math.max(maxPrice, max - min);
        }
        return maxPrice;
    }
}
