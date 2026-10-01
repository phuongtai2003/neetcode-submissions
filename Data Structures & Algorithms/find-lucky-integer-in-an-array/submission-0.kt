class Solution {
    fun findLucky(arr: IntArray): Int {
        val hashMap = TreeMap<Int, Int>(compareByDescending { it })

        for(num in arr) {
            hashMap[num] = (hashMap[num] ?: 0) + 1
        }

        for((key, value) in hashMap) {
            if(key == value) return key
        }

        return -1
    }
}
