class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int n = prices.length;
        
        int[] leftProfits = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > leftProfits[i-1]) {
                leftProfits[i] = profit;
            } else {
                leftProfits[i] = leftProfits[i-1];
            }
        }
        
        int[] rightProfits = new int[n];
        int maxPrice = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            int profit = maxPrice - prices[i];
            if (profit > rightProfits[i+1]) {
                rightProfits[i] = profit;
            } else {
                rightProfits[i] = rightProfits[i+1];
            }
        }
        
    
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int totalProfit = leftProfits[i] + rightProfits[i];
            if (totalProfit > maxProfit) {
                maxProfit = totalProfit;
            }
        }
        
        return maxProfit;
    }
}
