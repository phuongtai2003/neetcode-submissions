/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
        val sorted = intervals.sortedBy { it.start }
        for(index in 1 until sorted.size) {
            if(sorted[index-1].end > sorted[index].start) {
                return false
            }
        }

        return true
    }
}
