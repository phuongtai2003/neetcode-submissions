/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var l1 = headA
        var l2 = headB
        while (l1 !== l2) {
            l1 = if (l1 != null) l1.next else headB
            l2 = if (l2 != null) l2.next else headA
        }
        return l1
    }
}