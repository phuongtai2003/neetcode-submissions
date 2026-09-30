/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()

        helper(root, result)
        return result
    }

    private fun helper(root: TreeNode?, result: MutableList<Int>) {
        if(root == null) return

        result.add(root.`val`)
        helper(root.left, result)
        helper(root.right, result)
    }
}
