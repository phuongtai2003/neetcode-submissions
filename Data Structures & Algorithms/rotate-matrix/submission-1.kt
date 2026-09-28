class Solution {
    fun rotate(matrix: Array<IntArray>) {
        // Reverse the matrix vertically
        matrix.reverse()

        // Transpose the matrix
        for (i in matrix.indices) {
            for (j in i + 1 until matrix.size) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
    }
}