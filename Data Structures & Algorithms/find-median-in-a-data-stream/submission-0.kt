class MedianFinder {
    private val itemList = mutableListOf<Int>()

    fun addNum(num: Int) {
        itemList.add(num)
        itemList.sort()
    }

    fun findMedian(): Double {
        if(itemList.isEmpty()) return 0.0
        if(itemList.size % 2 != 0) return itemList[itemList.size/2].toDouble()

        return (itemList[itemList.size/2].toDouble() + itemList[itemList.size/2 - 1].toDouble())/2.0
    }
}
