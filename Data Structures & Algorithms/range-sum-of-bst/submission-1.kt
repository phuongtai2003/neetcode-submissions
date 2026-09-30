class Solution {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        return helper(root, low, high)
    }

    private fun helper(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0

        return when {
            root.`val` < low -> {
                helper(root.right, low, high)
            }

            root.`val` > high -> {
                helper(root.left, low, high)
            }

            else -> {
                root.`val` +
                    helper(root.left, low, high) +
                    helper(root.right, low, high)
            }
        }
    }
}