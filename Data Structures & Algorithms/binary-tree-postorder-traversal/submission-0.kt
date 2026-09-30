/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        postOrder(root, result)

        return result
    }

    private fun postOrder(root: TreeNode?, result: MutableList<Int>) {
        if(root == null) return

        postOrder(root?.left, result)
        postOrder(root?.right, result)
        result.add(root.`val`)
    }
}
