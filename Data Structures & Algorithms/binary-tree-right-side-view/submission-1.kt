/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if(root == null) return emptyList()
        val resultList = mutableListOf<Int>()
        val queue = ArrayDeque<TreeNode>()

        queue.addLast(root)
        while(queue.isNotEmpty()){
            val levelSize = queue.size

            for(index in 0 until levelSize) {
                val item = queue.removeFirst()
                if(index == levelSize - 1) {
                    resultList.add(item.`val`)
                }
                item.left?.let {
                    queue.addLast(it)
                }
                item.right?.let {
                    queue.addLast(it)
                }
            }
        }
        return resultList.toList()
    }
}
