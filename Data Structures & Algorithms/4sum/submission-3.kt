class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        if(target <= Integer.MIN_VALUE || target >= Integer.MAX_VALUE) return emptyList()
        if(nums.isEmpty()) return emptyList()
        nums.sort()
        val result = mutableListOf<List<Int>>()
        for(i in 0 until nums.size - 3) {
            if(i > 0 && nums[i] == nums[i-1]) continue

            for(j in i + 1 until nums.size - 2) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue

                var l = j + 1
                var r = nums.size - 1

                while(l < r) {
                    val sum = nums[i].toLong() + nums[j] + nums[l] + nums[r]
                    if(sum == target.toLong()) {
                        result.add(listOf(nums[i], nums[j], nums[l], nums[r]))
                        l++
                        while(l < r && nums[l] == nums[l-1]) {
                            l++
                        }
                        r--
                        while(l < r && nums[r+1] == nums[r]) {
                            r--
                        }
                    }
                    else if(sum > target) {
                        r--
                        while(l < r && nums[r+1] == nums[r]) {
                            r--
                        }
                    }
                    else {
                        l++
                        while(l < r && nums[l] == nums[l-1]) {
                            l++
                        }
                    }
                }
            }
        }

        return result
    }
}
