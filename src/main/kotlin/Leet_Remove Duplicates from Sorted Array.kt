class `Leet_Remove Duplicates from Sorted Array` {
    fun removeDuplicates(nums: IntArray): Int {
        var pivot = nums[0]
        var pivotIdx = 0
        var answer = 1
        for (i in 1..<nums.size) {
            if (pivot != nums[i]) {
                nums[++pivotIdx] = nums[i]
                pivot = nums[pivotIdx]
                answer++
            }
        }
        return answer
    }
}