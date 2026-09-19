/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var currentMiddleIndex = 0
    val inorderIndexMap = mutableMapOf<Int, Int>()
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        for(index in inorder.indices) {
            inorderIndexMap.put(inorder[index], index)
        }

        return buildTree(preorder, 0, preorder.size-1)
    }

    private fun buildTree(preorder: IntArray, left: Int, right: Int) : TreeNode? {
        if(left > right) return null

        val middleNode = preorder[currentMiddleIndex++]
        val root = TreeNode(middleNode)
        val middleIndex = inorderIndexMap[middleNode]!!

        root.left = buildTree(preorder, left, middleIndex - 1)
        root.right = buildTree(preorder, middleIndex + 1, right)

        return root
    }
}
