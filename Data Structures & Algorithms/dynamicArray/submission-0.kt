class DynamicArray(capacity: Int) {
    private var array: IntArray = IntArray(capacity)
    private var size: Int = 0
    private var capacity: Int = capacity
    fun get(i: Int): Int {
        return array[i]
    }

    fun set(i: Int, n: Int) {
        array[i] = n
    }

    fun pushback(n: Int) {
        if(size >= capacity) {
            resize()
        }
        array[size++] = n
    }

    fun popback(): Int {
        val lastElement = array[size - 1]
        size--
        return lastElement
    }

    private fun resize() {
        capacity = capacity*2
        val newArray = IntArray(capacity)
        for(i in 0 until size) {
            newArray[i] = array[i]
        }
        array = newArray
    }

    fun getSize(): Int {
        return size
    }

    fun getCapacity(): Int {
        return capacity
    }
}
