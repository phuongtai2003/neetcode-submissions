class Solution {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val graph = Array<MutableList<Int>>(edges.size + 1) {
            mutableListOf<Int>()
        }

        for((u, v) in edges) {
            graph[u].add(v)
            graph[v].add(u)
            val visited = mutableSetOf<Int>()
            if(dfs(u, -1, graph, visited)) return intArrayOf(u, v)
        }
        return intArrayOf()
    }

    private fun dfs(
        node: Int,
        parent: Int,
        graph: Array<MutableList<Int>>,
        visited: MutableSet<Int>
    ) : Boolean {
        if(node in visited) return true

        visited.add(node)
        val neighbors = graph[node] 
        for(nei in neighbors) {
            if(nei == parent) continue
            if(dfs(nei, node, graph, visited)) return true
        }

        return false
    }
}
