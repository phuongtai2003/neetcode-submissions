class Solution {
    private val possibleDirection = setOf<Pair<Int, Int>>(
        1 to 0,
        -1 to 0,
        0 to 1,
        0 to -1
    )
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val boardRow = board.size
        val boardCol = board[0].size

        for (row in 0 until boardRow) {
            for(col in 0 until boardCol) {
                if(dfs(
                    board,
                    row,
                    col,
                    0,
                    word
                )) return true
            }
        }
        return false
    }

    fun dfs(
        board: Array<CharArray>,
        row: Int,
        col: Int,
        stringIndex: Int,
        word: String
    ): Boolean {
        val boardRow = board.size
        val boardCol = board[0].size
        if(stringIndex >= word.length || row < 0 || col <0 || row >= boardRow || col >= boardCol) {
            return false
        }

        val boardChar = board[row][col]
        when(boardChar == word[stringIndex]) {
            false -> return false
            true -> {
                if(stringIndex == word.length - 1) return true
                board[row][col] = '#'
                val result = possibleDirection.any { dir -> 
                    dfs(board, row + dir.first, col + dir.second, stringIndex + 1, word) 
                }

                board[row][col] = boardChar
                return result
            }
        }
    }
}
