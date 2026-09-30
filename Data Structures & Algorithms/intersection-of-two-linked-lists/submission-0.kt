/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var currA = headA
        while(currA != null) {
            var currB = headB
            while(currB != null) {
                if(currB == currA) return currB
                currB = currB.next
            }
            currA = currA.next
        }
        return null
    }
}
