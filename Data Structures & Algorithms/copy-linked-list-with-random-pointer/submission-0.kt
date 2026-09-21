/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        val oldToCopy = mutableMapOf<Node, Node>()

        var curr = head
        while(curr != null) {
            val copyNode = Node(curr.`val`)
            oldToCopy[curr] = copyNode
            curr = curr.next
        }

        curr = head
        while(curr!=null) {
            val copyNode = oldToCopy[curr]
            copyNode?.let {
                it.next = oldToCopy[curr.next]
                it.random = oldToCopy[curr.random]
            }
            curr = curr.next
        }

        return oldToCopy[head]
    }
}
