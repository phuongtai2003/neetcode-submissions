class CountSquares() {
    private val pointCounts = HashMap<Pair<Int, Int>, Int>()
    private val points = mutableListOf<IntArray>()

    fun add(point: IntArray) {
        val pair = Pair(point[0], point[1])
        pointCounts[pair] = pointCounts.getOrDefault(pair, 0) + 1
        points.add(point)
    }

    fun count(point: IntArray): Int {
        var result = 0
        val (px, py) = point

        for ((x, y) in points) {
            if (kotlin.math.abs(py - y) != kotlin.math.abs(px - x) ||
                x == px || y == py) {
                continue
            }
            result += (pointCounts[Pair(x, py)] ?: 0) * (pointCounts[Pair(px, y)] ?: 0)
        }
        return result
    }
}