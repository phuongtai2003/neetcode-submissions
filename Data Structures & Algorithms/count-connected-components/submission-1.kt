class Solution {
    fun countComponents(n: Int, edges: Array<IntArray>): Int {
        val visitedSet = mutableSetOf<Int>()
        val graph = Array<MutableList<Int>>(n) {
            mutableListOf<Int>()
        }

        for((u, v) in edges) {
            graph[u].add(v)
            graph[v].add(u)
        }

        var count = 0
        
        for(node in 0 until n) {
            if(node in visitedSet) continue
            count += 1
            dfs(node, graph, visitedSet)
        }

        return count
    }

    private fun dfs(
        node: Int,
        graph: Array<MutableList<Int>>,
        visited: MutableSet<Int>
    ) {
        if(node in visited) return
        visited.add(node)
        val neighbors = graph[node]
        for(nei in neighbors) {
            dfs(nei, graph,visited)
        }
    }
}
