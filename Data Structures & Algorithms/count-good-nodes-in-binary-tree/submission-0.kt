/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun goodNodes(root: TreeNode?): Int {
        if (root == null) return 0

        return findLargerNode(root, Integer.MIN_VALUE)
    }

    private fun findLargerNode(root: TreeNode?, currentMax: Int) : Int {
        if(root == null) return 0

        val isLarger = root.`val` >= currentMax
        val result = if (isLarger) 1 else 0
        val nextMaxValue = if(isLarger) root.`val` else currentMax
        return result + findLargerNode(root.left, nextMaxValue) + findLargerNode(root.right, nextMaxValue)
    }
}
