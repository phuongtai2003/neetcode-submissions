class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        candidates.sort()
        val result = mutableListOf<List<Int>>()
        backtracking(candidates, mutableListOf<Int>(), result, 0, target, 0)

        return result
    }

    private fun backtracking(
        nums: IntArray,
        curr: MutableList<Int>,
        result: MutableList<List<Int>>,
        currSum: Int,
        target: Int,
        index: Int,
    ) {
        if(currSum > target) return

        if(currSum == target) {
            result.add(curr.toList())
            return
        }

        for(i in index until nums.size) {
            if(i > index && nums[i] == nums[i-1]) {
                continue
            }

            curr.add(nums[i])

            backtracking(nums, curr, result, currSum + nums[i], target, i + 1)
            curr.removeLast()
        }
    }
}
