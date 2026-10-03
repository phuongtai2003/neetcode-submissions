class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        backtracking(nums, mutableListOf<Int>(), mutableSetOf<Int>(), result)
        return result
    }

    private fun backtracking(
        nums: IntArray,
        curr: MutableList<Int>,
        visited: MutableSet<Int>,
        result: MutableList<List<Int>>,
    ) {
        if(curr.size > nums.size) {
            return
        }

        if(curr.size == nums.size) {
            result.add(curr.toList())
            return
        }

        for(i in 0 until nums.size) {
            if(i in visited) {
                continue
            }
            visited.add(i)
            curr.add(nums[i])

            backtracking(
                nums,
                curr,
                visited,
                result
            )
            curr.removeLast()
            visited.remove(i)
        }
    }
}
