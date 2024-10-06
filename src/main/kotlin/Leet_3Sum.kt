class Leet_3Sum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        nums.sort()
        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var j = i + 1
            var k = nums.size - 1
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                when {
                    sum == 0 -> {
                        answer.add(mutableListOf(nums[i], nums[j], nums[k]))
                        while (j < k && nums[j] == nums[j + 1]) j++
                        while (j < k && nums[k] == nums[j - 1]) k--
                        j++
                        k--
                    }

                    sum < 0 -> j++
                    else -> k--
                }
            }
        }
        return answer
    }
}