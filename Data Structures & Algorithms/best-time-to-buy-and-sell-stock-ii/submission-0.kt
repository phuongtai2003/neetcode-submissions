class Solution {
    fun maxProfit(prices: IntArray): Int {
        var r = 1
        var totalProfit = 0
        while(r < prices.size) {
            if(prices[r] > prices[r-1]) {
                totalProfit += prices[r] - prices[r-1]
            }
            r++
        }
        return totalProfit
    }
}
