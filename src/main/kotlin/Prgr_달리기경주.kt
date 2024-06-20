class Prgr_달리기경주 {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val result: LinkedHashSet<String> = LinkedHashSet()
        for (player in players) {
            result.attach(player)
        }

        for (call in callings) {
            result.exchange(result.findByValue(call)!!)
        }

        return result.toList().toTypedArray()
    }

    class LinkedHashSet<T> {
        private var head: Node<T>? = null
        private var tail: Node<T>? = null
        private val nodeMap = HashMap<T, Node<T>>()

        inner class Node<T>(var value: T, var next: Node<T>? = null, var prev: Node<T>? = null)

        fun attach(value: T) {
            if (nodeMap.containsKey(value)) return
            val newNode = Node(value)
            if (head == null) {
                head = newNode
                tail = newNode
            } else {
                tail?.next = newNode
                newNode.prev = tail
                tail = newNode
            }
            nodeMap[value] = newNode
        }

        fun findByValue(value: T): Node<T>? {
            return nodeMap[value]
        }

        fun exchange(curr: Node<T>) {
            val prev = curr.prev ?: return

            if (curr == tail) {
                tail = prev
            }
            prev.next = curr.next
            curr.prev = prev.prev
            prev.prev = curr
            curr.next = prev
            if (curr.prev != null) {
                curr.prev?.next = curr
            } else {
                head = curr
            }
            prev.next?.prev = prev

        }

        fun toList(): List<T> {
            var curr = this.head
            val reduce = mutableListOf<T>()
            while (curr != this.tail) {
                reduce.add(curr!!.value)
                curr = curr.next!!
            }
            reduce.add(curr!!.value)
            return reduce
        }
    }


}