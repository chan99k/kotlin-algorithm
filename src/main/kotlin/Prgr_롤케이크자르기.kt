class Prgr_롤케이크자르기 {

    fun solution(topping: IntArray): Int {
        val leftSet: MutableSet<Int> = mutableSetOf()
        val rightSet: MutableSet<Int> = mutableSetOf()

        val leftCount = IntArray(topping.size)
        val rightCount = IntArray(topping.size)

        for (i in topping.indices) {
            leftSet.add(topping[i])
            leftCount[i] = leftSet.size
        }

        for (i in topping.indices.reversed()) {
            rightSet.add(topping[i])
            rightCount[i] = rightSet.size
        }

        var answer = 0
        for (i in 0 until topping.size - 1) {
            if (leftCount[i] == rightCount[i + 1]) {
                answer++
            }
        }
        return answer
    }


}