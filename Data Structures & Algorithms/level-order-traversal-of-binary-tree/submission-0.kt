/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if(root == null) return emptyList()
        val queue = ArrayDeque<TreeNode>()
        val resultList = mutableListOf<List<Int>>()

        queue.offer(root)
        while(queue.isNotEmpty()) {
            val levelItem = mutableListOf<Int>()
            val totalItems = queue.size
            
            for(i in 0 until totalItems) {
                val item = queue.poll()
                levelItem.add(item.`val`)
                item.left?.let {
                    queue.offer(it)
                }
                item.right?.let {
                    queue.offer(it)
                }
            }

            resultList.add(levelItem.toList())
        }

        return resultList.toList()
    }
}
