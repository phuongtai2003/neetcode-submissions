/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null) return true

        val leftHeight = heightOf(root.left)
        val rightHeight = heightOf(root.right)
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false
        }

        return isBalanced(root.left) && isBalanced(root.right)
    }

    private fun heightOf(root: TreeNode?) : Int {
        if(root == null) {
            return 0
        }

        return 1 + maxOf(heightOf(root.left), heightOf(root.right))
    }
}
