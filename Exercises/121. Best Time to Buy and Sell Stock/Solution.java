class Solution {
    public int maxProfit(int[] prices) {

        int size = prices.length;
        int minPrice = 0;
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                minPrice = prices[i];
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = prices[i] - minPrice;
            }

            if (profit > maxProfit) {
                maxProfit = profit;
            }

        }

        return maxProfit;

    }
}
