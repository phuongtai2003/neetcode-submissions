class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = mutableListOf<List<Int>>()
        backtracking(0, nums, mutableListOf<Int>(), res)
        return res
    }

    private fun backtracking(
        index: Int,
        nums: IntArray,
        curr: MutableList<Int>,
        res: MutableList<List<Int>>
    ) {
        res.add(curr.toList())

        for(i in index until nums.size) {
            if(i > index && nums[i] == nums[i-1]) continue
            
            curr.add(nums[i])
            backtracking(
                i + 1,
                nums,
                curr,
                res
            )
            curr.removeLast()
        } 
    }
}
