/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if(root1 == null && root2 == null) {
            return null
        }

        val value1 = root1?.`val` ?: 0
        val value2 = root2?.`val` ?: 0
        val root = TreeNode(value1+value2)

        root.left = mergeTrees(root1?.left, root2?.left)
        root.right = mergeTrees(root1?.right, root2?.right)
        return root
    }
}
