import utils.MappedLinkedList

class Prgr_달리기경주 {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val result: MappedLinkedList<String> = MappedLinkedList()
        for (player in players) {
            result.attach(player)
        }

        for (call in callings) {
            result.exchange(result.findByValue(call)!!)
        }

        return result.toList().toTypedArray()
    }
}