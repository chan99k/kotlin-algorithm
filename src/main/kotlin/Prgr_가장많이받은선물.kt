class Prgr_가장많이받은선물 {

    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val map: MutableMap<String, MutableMap<String, Int>> = mutableMapOf()
        val giftPI: MutableMap<String, Int> = mutableMapOf()
        setUp(friends, map, gifts, giftPI)
        val result: MutableMap<String, Int> = mutableMapOf()
        for (giver in friends) {
            for (receiver in friends) {
                if (map[giver]!![receiver] != null) {
                    if (map[giver]!![receiver]!! > map[receiver]!![giver]!!) {
                        result[giver] = result.getOrPut(giver) { 0 } + 1
                    } else if (map[giver]!![receiver]!! < map[receiver]!![giver]!!) {
                        result[receiver] = result.getOrPut(receiver) { 0 } + 1
                    } else {
                        calGiftPI(giftPI, giver, receiver, result)
                    }
                } else {
                    calGiftPI(giftPI, giver, receiver, result)
                }
            }
        }
        return if (result.isNotEmpty()) result.maxOf { it.value } / 2 else 0
    }

    private fun calGiftPI(
        giftPI: MutableMap<String, Int>,
        giver: String,
        receiver: String,
        result: MutableMap<String, Int>
    ) {
        if (giftPI[giver]!! > giftPI[receiver]!!) {
            result[giver] = result.getOrPut(giver) { 0 } + 1
        } else if (giftPI[giver]!! < giftPI[receiver]!!) {
            result[receiver] = result.getOrPut(receiver) { 0 } + 1
        }
    }

    private fun setUp(
        friends: Array<String>,
        map: MutableMap<String, MutableMap<String, Int>>,
        gifts: Array<String>,
        giftPI: MutableMap<String, Int>
    ) {
        for (friend in friends) {
            map[friend] = mutableMapOf()
            giftPI[friend] = 0
            for (f2 in friends) {
                map[friend]!![f2] = 0
            }
        }

        for (gift in gifts) {
            val pair = gift.split(" ")
            val giver = pair[0]
            val receiver = pair[1]

            val innerMap = map[giver]!!
            innerMap[receiver] = innerMap.getOrPut(receiver) { 0 } + 1
            giftPI[giver] = giftPI.getOrPut(giver) { 0 } + 1
            giftPI[receiver] = giftPI.getOrPut(receiver) { 0 } - 1
        }
    }

}


