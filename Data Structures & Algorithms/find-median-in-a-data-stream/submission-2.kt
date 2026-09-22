class MedianFinder {
    private val lowerHalf = PriorityQueue<Int>(
        compareBy { - it}
    )
    private val higherHalf = PriorityQueue<Int>()

    fun addNum(num: Int) {
        if(lowerHalf.isNotEmpty() && num > lowerHalf.peek()) {
            higherHalf.offer(num)
        } else {
            lowerHalf.offer(num)
        }

        if(lowerHalf.size > higherHalf.size + 1){
            higherHalf.offer(lowerHalf.poll())
        }
        if (higherHalf.size > lowerHalf.size + 1) {
            lowerHalf.offer(higherHalf.poll())
        }
    }

    fun findMedian(): Double {
        return when {
            lowerHalf.size > higherHalf.size -> lowerHalf.peek().toDouble()
            higherHalf.size > lowerHalf.size -> higherHalf.peek().toDouble()
            else -> (lowerHalf.peek() + higherHalf.peek()) / 2.0
        }
    }
}
