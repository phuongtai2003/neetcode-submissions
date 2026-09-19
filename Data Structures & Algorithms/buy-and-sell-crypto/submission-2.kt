class Solution {
    fun maxProfit(prices: IntArray): Int {
        if(prices.isEmpty()) return 0

        var left = 0
        var right = 1
        var maxProfit = 0
        while(right < prices.size) {
            if(prices[right] > prices[left]) {
                val profit = prices[right] - prices[left]
                maxProfit = Math.max(maxProfit, profit)
            } else {
                left = right
            }
            right++
        }

        return maxProfit
    }
}
