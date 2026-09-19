/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    private val sortedArrList = ArrayList<Int>()
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        inOrderTraversal(root)
        return sortedArrList[k - 1]
    }

    private fun inOrderTraversal(root: TreeNode?) {
        if(root == null) return

        inOrderTraversal(root.left)
        sortedArrList.add(root.`val`)
        inOrderTraversal(root.right)
    }
}
