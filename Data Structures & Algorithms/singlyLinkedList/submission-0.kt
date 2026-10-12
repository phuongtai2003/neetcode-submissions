class ListNode(
    var value: Int,
    var next: ListNode? = null,
)

class LinkedList {
    private var head: ListNode? = null
    private var tail: ListNode? = null
    private var size: Int = 0
    fun get(index: Int): Int {
        if (index < 0 || index >= size) return -1

        var temp = head
        repeat(index) {
            temp = temp?.next
        }

        return temp?.value ?: -1
    }

    fun insertHead(value: Int) {
        if(head == null) {
            head = ListNode(value, null)
            tail = head
            size++
            return
        }
        head = ListNode(value, head)
        size++
    }

    fun insertTail(value: Int) {
        if(tail == null) {
            insertHead(value)
            return
        }
        val lastNode = ListNode(value, null)
        tail?.next = lastNode
        tail = tail?.next
        size++
    }

    
    fun remove(index: Int): Boolean {
        if (index < 0 || index >= size) return false

        if (index == 0) {
            head = head?.next
            size--

            if (head == null) {
                tail = null
            }

            return true
        }

        var prev = head
        var count = 0

        while (count < index - 1) {
            prev = prev?.next
            count++
        }

        val target = prev?.next
        prev?.next = target?.next

        if (target == tail) {
            tail = prev
        }

        size--
        return true
    }


    fun getValues(): List<Int> {
        val listRes = mutableListOf<Int>()
        var temp = head

        while (temp != null) {
            listRes.add(temp.value)
            temp = temp.next
        }

        return listRes
    }
}
