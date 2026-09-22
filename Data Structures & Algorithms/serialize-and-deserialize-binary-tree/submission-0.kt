/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec {
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        val result = mutableListOf<String>()

        fun dfs(root: TreeNode?) {
            if(root == null) {
                result.add("N")
                return
            }
            result.add(root!!.`val`.toString())
            dfs(root.left)
            dfs(root.right)
        }
        dfs(root)

        return result.joinToString(",")
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        val list = data.split(",")
        var index = 0

        fun dfs() : TreeNode? {
            if(list[index] == "N") {
                index++
                return null
            }

            val node = TreeNode(list[index].toInt())
            index++
            node.left =  dfs()
            node.right = dfs()
            return node
        }

        return dfs()
    }
}