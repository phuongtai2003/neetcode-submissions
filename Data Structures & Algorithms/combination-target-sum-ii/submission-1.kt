class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        candidates.sort()
        val result = mutableListOf<List<Int>>()
        dfs(candidates, 0, mutableListOf(), result, 0, target)
        return result
    }

    private fun dfs(
        nums: IntArray,
        index: Int,
        current: MutableList<Int>,
        resultList: MutableList<List<Int>>,
        currRes: Int,
        target: Int,
    ) {
        if(currRes == target) {
            resultList.add(current.toList())
            return
        }

        for(i in index until nums.size) {
            if(i > index && nums[i] == nums[i-1]) continue

            if(currRes + nums[i] > target) break

            current.add(nums[i])

            dfs(
                nums,
                i+1,
                current,
                resultList,
                currRes + nums[i],
                target,
            )

            current.removeLast()
        }
    }
}
