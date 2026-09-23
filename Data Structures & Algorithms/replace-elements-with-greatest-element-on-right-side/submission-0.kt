class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        for(i in 0 until arr.size) {
            if(i == arr.size - 1) {
                arr[i] = -1
                continue
            }
            var maxInRange = 0
            for(j in i+1 until arr.size) {
                if(maxInRange < arr[j]) {
                    maxInRange = arr[j]
                }
            }
            arr[i] = maxInRange
        }

        return arr
    }
}
