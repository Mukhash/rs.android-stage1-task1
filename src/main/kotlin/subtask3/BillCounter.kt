package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val bePayed = (bill.sum() - bill[k])/2
        val refund = b - bePayed
        if (refund == 0) {
            return "Bon Appetit"
        } else {
            return refund.toString()
        }
    }
}
