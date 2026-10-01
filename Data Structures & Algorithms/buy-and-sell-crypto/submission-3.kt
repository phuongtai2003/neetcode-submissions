class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var l = 0
        var r = 1

        while(r < prices.size) {
            if(prices[r] > prices[l]) {
                val profit = prices[r] - prices[l]
                maxProfit = maxOf(profit, maxProfit)
            } else {
                l = r
            }
            r++
        }

        return maxProfit
    }
}
