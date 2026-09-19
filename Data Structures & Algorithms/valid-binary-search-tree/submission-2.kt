/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

data class QueueItem(
    val node: TreeNode,
    val leftBound: Long,
    val rightBound: Long
)

class Solution {
    
    fun isValidBST(root: TreeNode?): Boolean {
        if(root == null) return true

        val queue = ArrayDeque<QueueItem>().apply{
            add(QueueItem(root, Long.MIN_VALUE, Long.MAX_VALUE))
        }

        while(queue.isNotEmpty()) {
            val queueItem = queue.removeFirst()
            val node = queueItem.node
            val rightBound = queueItem.rightBound
            val leftBound = queueItem.leftBound

            if(node.`val` >= rightBound || node.`val` <= leftBound) return false

            node.left?.let {
                queue.addLast(QueueItem(it, leftBound, node.`val`.toLong()))
            }
            node.right?.let {
                queue.addLast(QueueItem(it, node.`val`.toLong(), rightBound))
            }
        }

        return true
    }
}
