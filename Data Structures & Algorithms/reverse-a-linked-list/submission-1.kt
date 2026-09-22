/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var curr: ListNode? = head
        var prev: ListNode? = null
        var next: ListNode? = head

        while(next != null) {
            next = curr?.next
            curr?.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}
