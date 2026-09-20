class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val minHeap = PriorityQueue<Pair<Double,IntArray>>(
            compareBy{ it.first }
        )
        for(point in points) {
            val distanceRes = distance(0, point[0], 0, point[1])
            minHeap.add(distanceRes to point)
        }

        var j = k - 1
        val resultArr = Array<IntArray>(k) {
            intArrayOf(0,0)
        }
        while(j >= 0) {
            val minItem = minHeap.poll()
            resultArr[j--] = minItem.second
        }
        return resultArr
    }

    private fun distance(x1: Int, x2: Int, y1: Int, y2: Int): Double {
        val dx = (x1 - x2).toDouble()
        val dy = (y1 - y2).toDouble()
        return sqrt(dx * dx + dy * dy)
    }
}
