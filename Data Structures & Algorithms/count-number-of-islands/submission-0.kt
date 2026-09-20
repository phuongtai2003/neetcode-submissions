class Solution {
    private val possibleDirections = arrayOf(
        - 1 to 0,
        1 to 0,
        0 to -1,
        0 to 1
    )
    fun numIslands(grid: Array<CharArray>): Int {
        val visited = mutableSetOf<Pair<Int, Int>>()
        var islands = 0

        val rowCount = grid.size
        val colCount = grid[0].size
        for(row in 0..<rowCount) {
            for(col in 0..<colCount) {
                if(grid[row][col] == '1' && visited.contains(row to col).not()) {
                    islands += 1
                    searchAndMarkDfs(visited, grid, row, col)
                }
            }
        }

        return islands
    }

    private fun searchAndMarkDfs(
        visited: MutableSet<Pair<Int,Int>>, 
        grid: Array<CharArray>,
        row: Int,
        col: Int
    ) {
        if(row < 0 || row >= grid.size || col < 0 || col >= grid[0].size || grid[row][col] == '0' || visited.contains(row to col)) {
            return
        }
        val gridVal = grid[row][col]
        visited.add(row to col)

        for(direction in possibleDirections) {
            searchAndMarkDfs(
                visited,
                grid,
                row + direction.first,
                col + direction.second
            )
        }
    }
}
