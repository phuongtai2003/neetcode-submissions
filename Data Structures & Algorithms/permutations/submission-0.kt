class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val visited = mutableSetOf<Int>()
        backtracking(nums, mutableListOf(), visited, result)
        return result
    }

    private fun backtracking(
        nums: IntArray,
        curr: MutableList<Int>,
        visited: MutableSet<Int>,
        result: MutableList<List<Int>>
    ) {
        if(curr.size == nums.size) {
            result.add(curr.toList())
            return
        }

        for (num in nums) {
            if(visited.contains(num)) continue
            curr.add(num)
            visited.add(num)
            backtracking(nums, curr, visited, result)
            curr.removeLast()
            visited.remove(num)
        }
    }
}
