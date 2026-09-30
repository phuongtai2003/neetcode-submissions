/*
// Definition for a Node.
class Node(var `val`: Int) {
    var children: MutableList<Node> = mutableListOf()
}
*/

class Solution {
    fun postorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()

        helper(root, result)
        return result
    }

    private fun helper(root: Node?, result: MutableList<Int>) {
        if(root == null) return

        for(child in root.children) {
            helper(child, result)
        }
        result.add(root.`val`)
    }
}
