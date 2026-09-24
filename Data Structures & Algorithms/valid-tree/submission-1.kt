class Solution {
    fun validTree(n: Int, edges: Array<IntArray>): Boolean {
        val graph = Array<MutableList<Int>>(n) {
            mutableListOf<Int>()
        }

        for((u, v) in edges) {
            graph[u].add(v)
            graph[v].add(u)
        }

        val visited = mutableSetOf<Int>()

        return dfs(0, -1, graph, visited) && visited.size == n
    }

    private fun dfs(
        node: Int,
        parent: Int,
        graph: Array<MutableList<Int>>,
        visited: MutableSet<Int>,
    ) : Boolean {
        if(node in visited) return false
        val neighbors = graph[node]
        visited.add(node)
        for(nei in neighbors) {
            if(nei == parent) continue
            if(!dfs(nei, node, graph, visited)) return false
        }
        return true
    }
}
