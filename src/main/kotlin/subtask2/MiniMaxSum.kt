package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        lateinit var minMax: IntArray
        val sum = input.sum()
        var max = 0
        var min = sum
        for (int in input) {
            val sumOfFour = sum - int
            if (sumOfFour > max) {
                max = sumOfFour
            }
            if (sumOfFour < min) {
                min = sumOfFour
            }
        }
        minMax = intArrayOf(min, max)
        return minMax
    }
}
