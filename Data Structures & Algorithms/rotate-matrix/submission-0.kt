class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size
        val rotated = Array(n) { IntArray(n) }

        for (i in 0 until n) {
            for (j in 0 until n) {
                rotated[j][n - 1 - i] = matrix[i][j]
            }
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                matrix[i][j] = rotated[i][j]
            }
        }
    }
}