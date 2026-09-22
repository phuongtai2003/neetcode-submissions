class Solution {
    private val resultList = mutableListOf<List<Int>>()

    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        dfs(0, nums, mutableListOf<Int>(), 0, target)
        return resultList
    }

    fun dfs(
        index: Int,
        nums: IntArray,
        current: MutableList<Int>,
        total: Int,
        target: Int
    ) {
        if(total == target) {
            resultList.add(ArrayList(current))
            return
        }

        if(index >= nums.size || total > target) {
            return
        }

        val candidate = nums[index]
        current.add(candidate)
        dfs(index, nums, current, total + candidate, target)

        current.removeLast()
        dfs(index+1, nums, current, total, target)
    }
}
