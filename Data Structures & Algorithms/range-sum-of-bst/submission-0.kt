/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        val result = mutableListOf<Int>()
        helper(root, low, high, result)

        return result.sum()
    }

    private fun helper(root: TreeNode?, low: Int, high: Int, result: MutableList<Int>) {
        if(root == null) return

        if(root.`val` in low..high) {
            result.add(root.`val`)
        }
        helper(root.left, low, high, result)
        helper(root.right, low, high, result)
    }
}
