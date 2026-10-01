class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val seen = mutableSetOf<Int>()
        var dupNumber = 0
        var missingNumber = 0
        val n = grid.size

        for(i in 0 until n) {
            for (j in 0 until n) {
                if(grid[i][j] in seen) {
                    dupNumber = grid[i][j]
                }
                seen.add(grid[i][j])
            }
        }

        for(i in 1..(n*n)) {
            if(!(i in seen)) {
                missingNumber = i
            }
        }

        return intArrayOf(dupNumber, missingNumber)
    }
}