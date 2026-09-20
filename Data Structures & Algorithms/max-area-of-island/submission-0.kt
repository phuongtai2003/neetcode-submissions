class Solution {
    private val availableDirections = arrayOf(
        -1 to 0,
        1 to 0,
        0 to -1,
        0 to 1
    )
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        if(grid.isEmpty()) return 0
        val visited = mutableSetOf<Pair<Int, Int>>()
        val rowLength = grid.size
        val colLength = grid[0].size
        var maxArea = 0

        for(i in 0..<rowLength) {
            for(j in 0..<colLength) {
                if(grid[i][j] == 1 && visited.contains(i to j).not()) {
                    val area = dfs(grid, visited, i,j)
                    maxArea = Math.max(maxArea, area)
                }
            }
        }

        return maxArea
    }

    private fun dfs(
        grid: Array<IntArray>,
        visited: MutableSet<Pair<Int, Int>>,
        row: Int,
        col: Int,
    ): Int {
        val sizeConstraint = row < 0 || col < 0 || row >= grid.size || col >= grid[0].size
        val isVisited = visited.contains(row to col)
        if(sizeConstraint || isVisited) {
            return 0
        }
        val isWater = grid[row][col] == 0
        if(isWater) return 0
        visited.add(row to col)
        val result = availableDirections.sumOf { direction ->
            dfs(
                grid,
                visited,
                row + direction.first,
                col + direction.second
            )
        }

        return 1 + result
    }

}
