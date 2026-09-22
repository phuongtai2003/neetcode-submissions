class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()
        for(num in nums) {
            freqMap[num] = (freqMap[num]?:0) + 1
        }
        val maxHeap = PriorityQueue<Pair<Int,Int>>(
            compareBy {
                -it.first
            }
        )
        for((key, freq) in freqMap) {
            maxHeap.offer(freq to key)
        }

        val resultArr = IntArray(k)
        for(i in 0 until k) {
            resultArr[i] = maxHeap.poll().second
        }

        return resultArr
    }
}
