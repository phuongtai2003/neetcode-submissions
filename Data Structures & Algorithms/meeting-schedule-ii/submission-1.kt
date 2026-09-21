/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun minMeetingRooms(intervals: List<Interval>): Int {
        val sortedIntervals = intervals.sortedBy { it.start }
        val minHeap = PriorityQueue<Int>()

        for(interval in sortedIntervals) {
            if(minHeap.isNotEmpty() && minHeap.peek() <= interval.start) {
                minHeap.poll()
            }
            minHeap.offer(interval.end)
        }

        return minHeap.size
    }
}
