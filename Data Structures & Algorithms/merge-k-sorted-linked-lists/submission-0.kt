/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()) return null

        val minHeap = PriorityQueue<ListNode>(compareBy {it.`val`})

        for(list in lists) {
            list?.let {minHeap.offer(it)}
        }

        val res = ListNode(0)
        var curr = res
        while(minHeap.isNotEmpty()) {
            val node = minHeap.poll()
            curr.next = node
            curr = curr.next!!

            node.next?.let {minHeap.offer(it)}
        }

        return res.next
    }
}
