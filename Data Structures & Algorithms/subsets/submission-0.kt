class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        
        backtracking(0, nums, mutableListOf<Int>(), result)
        return result
    }

    private fun backtracking(
        index: Int,
        nums: IntArray,
        curr: MutableList<Int>,
        result: MutableList<List<Int>>
    ) {
        result.add(curr.toList())

        for(i in index until nums.size) {
            curr.add(nums[i])
            backtracking(
                i + 1,
                nums,
                curr,
                result
            )
            curr.removeLast()
        }
    }
}
