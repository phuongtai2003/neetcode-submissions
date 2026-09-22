/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private var res = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
        getMaxVal(root)
        return res
    }

    private fun getMaxVal(root: TreeNode?) : Int {
        if (root == null) return 0

        val leftGain = getMaxVal(root.left).coerceAtLeast(0)
        val rightGain = getMaxVal(root.right).coerceAtLeast(0)

        val currentPathSum = root.`val` + leftGain + rightGain
        res = maxOf(res, currentPathSum)

        return root.`val` + maxOf(leftGain, rightGain)
    }
}