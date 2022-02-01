package leetcode;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapestPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= cheapestPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - cheapestPrice);
            }
            cheapestPrice = Math.min(cheapestPrice, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int result = new BuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(result);

    }
}
