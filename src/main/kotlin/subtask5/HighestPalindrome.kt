package subtask5

import java.lang.Integer.max

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var counterOfNeeded = 0
        var counterOfLeft = k
        val array: IntArray = digitString.map { it.toString().toInt() }.toIntArray()
        val lastIndex = array.size - 1

        for (i in 0 until array.size / 2) {
            if (array[i] != array[lastIndex - i]) {
                counterOfNeeded += 1
                counterOfLeft -= 1
                if (counterOfNeeded > k) {
                    return "-1"
                }
                val max = max(array[i], array[lastIndex - i])
                array[i] = max
                array[lastIndex - i] = max
            }
        }

        for (i in 0 until array.size / 2) {
            while (counterOfLeft > 0) {
                array[i] = 9
                array[lastIndex - i] = 9
                counterOfLeft -= 1
            }
        }
        return array.joinToString("")
    }
}
