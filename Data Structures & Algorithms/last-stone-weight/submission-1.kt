class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        if(stones.isEmpty()) return 0
        val maxHeap = PriorityQueue<Int>(reverseOrder())

        for(stone in stones) {
            maxHeap.offer(stone)
        }

        while(maxHeap.size >= 2) {
            val heavy1 = maxHeap.poll()
            val heavy2 = maxHeap.poll()

            maxHeap.offer(Math.abs(heavy1-heavy2))
        }

        return maxHeap.poll()
    }
}
