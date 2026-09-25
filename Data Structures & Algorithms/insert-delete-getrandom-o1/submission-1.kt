class RandomizedSet() {
    private val map = HashMap<Int, Int>()
    private val list = ArrayList<Int>()

    fun insert(`val`: Int): Boolean {
        if(map.containsKey(`val`)) return false

        map[`val`] = list.size
        list.add(`val`)
        return true
    }

    fun remove(`val`: Int): Boolean {
        if(map[`val`] == null) return false 

        val indexToRemove = map[`val`]!!
        val lastElement = list.last()

        map[lastElement] = indexToRemove
        list[indexToRemove] = lastElement

        list.removeLast()
        map.remove(`val`)
        return true
    }

    fun getRandom(): Int {
        val randomIndex = kotlin.random.Random.nextInt(list.size)
        return list[randomIndex]
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * val obj = RandomizedSet()
 * val param_1 = obj.insert(`val`)
 * val param_2 = obj.remove(`val`)
 * val param_3 = obj.getRandom()
 */
