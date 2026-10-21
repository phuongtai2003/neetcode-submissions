class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freq = mutableMapOf<Int, Int>()
        val minHeap = PriorityQueue<Pair<Int, Int>>(compareBy {
            it.second
        })

        for(num in nums) {
            freq[num] = (freq[num] ?: 0) + 1
        }

        for((num, fr) in freq) {
            minHeap.add(num to fr)
            if(minHeap.size > k) {
                minHeap.poll()
            }
        }
        val res = IntArray(k)

        var index = 0
        while(minHeap.isNotEmpty() && index < k) {
            res[index] = minHeap.poll().first
            index++
        }

        return res
    }
}
