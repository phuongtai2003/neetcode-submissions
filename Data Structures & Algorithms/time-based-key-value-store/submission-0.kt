class TimeMap() {
    private val storage = mutableMapOf<String, MutableList<Pair<Int,String>>>()
    fun set(key: String, value: String, timestamp: Int) {
        storage.getOrPut(key) {mutableListOf()}.add(
            timestamp to value
        )
    }

    fun get(key: String, timestamp: Int): String {
        val valuesOfKey = storage[key] ?: return ""

        var left = 0
        var right = valuesOfKey.size - 1
        var result = ""
        while(left <= right) {
            val midIndex = left + (right - left) / 2
            val midValue = valuesOfKey[midIndex]
            if(midValue.first == timestamp) {
                return midValue.second
            } else if(midValue.first < timestamp){
                result = midValue.second
                left = midIndex + 1
            } else {
                right = midIndex - 1
            }
        }

        return result
    }
}
