class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var currMax = -1
        val n = arr.size - 1
        for(i in n downTo 0) {
            val currNum = arr[i]
            arr[i] = currMax
            if(currMax < currNum) {
                currMax = currNum
            }
        }

        return arr
    }
}
