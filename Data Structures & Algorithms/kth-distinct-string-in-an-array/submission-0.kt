class Solution {
    fun kthDistinct(arr: Array<String>, k: Int): String {
        val hashMap = LinkedHashMap<String, Int>()

        for(s in arr) {
            hashMap[s] = (hashMap[s] ?: 0) + 1
        }

        var counter = k
        for((key, value) in hashMap) {
            if(value == 1) {
                counter--
                if(counter == 0) return key
            }
        }

        return ""
    }
}