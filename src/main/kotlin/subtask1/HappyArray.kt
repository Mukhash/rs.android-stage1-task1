package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var array: MutableList<Int> = sadArray.toMutableList()
        var i = 1
        while (i < array.size-1) {
            var sum = array[i-1] + array[i+1]
            if (array[i] > sum) {
                 array.removeAt(i)
                if (i != 1) {
                    i -= 1
                }
            } else {
                i += 1
            }
        }
        return array.toIntArray()
    }
}



