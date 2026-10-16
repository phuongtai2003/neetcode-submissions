class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var min = 1
        var max = piles.max()
        var res = 0

        while(min <= max) {
            val mid = min + (max - min) / 2
            var currRes = 0

            for(pile in piles) {
                currRes += ceil(pile/mid.toDouble()).toInt()
            }

            if(currRes > h) {
                min = mid + 1
            }
            else {
                max = mid - 1
                res = mid
            }
        }

        return res
    }
}
