/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) return false

        return backtracking(root, 0, targetSum)
    }

    private fun backtracking(
        root: TreeNode?,
        curr: Int,
        target: Int,
    ) : Boolean {
        if(root == null) return false
        val nextSum = curr + root.`val`
        if (root.left == null && root.right == null) {
            return nextSum == target
        }

        val leftBranch = backtracking(
            root?.left,
            nextSum,
            target
        )
        if(leftBranch) return true

        val rightBranch = backtracking(
            root?.right,
            nextSum,
            target
        )
        if(rightBranch) return true

        return false
    }
}
