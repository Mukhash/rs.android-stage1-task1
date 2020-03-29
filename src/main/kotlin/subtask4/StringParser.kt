package subtask4

import java.lang.Integer.min
import java.util.*

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val array: MutableList<String> = mutableListOf()
        val tempArray = inputString.toList().map { it.toString() }
        val mapOfOpen: SortedMap<Int, String> = sortedMapOf()
        val mapOfClose: MutableMap<Int, String> = mutableMapOf()
        val mapOfSigns: Map<String, String> = mapOf("<" to ">", "[" to "]", "(" to ")")
        var open = 0
        var close = 0

        for (i in tempArray.indices) {
            if (tempArray[i] == "<" || tempArray[i] == "(" || tempArray[i] == "[") {
                mapOfOpen[i] = tempArray[i]
            } else if (tempArray[i] == ">" || tempArray[i] == ")" || tempArray[i] == "]") {
                mapOfClose[i] = tempArray[i]
            }
        }

        for ((k, v) in mapOfOpen) {
            open = k
            mapOfClose.filterValues { it == mapOfSigns[v] }.keys.forEach {
                if (it > open) {
                    close = it
                    if (inputString.substring(open+1, close)
                            .indexOf(mapOfSigns[v].toString()) < inputString.substring(open+1, close)
                            .indexOf(v) && mapOfSigns[v].toString() in inputString.substring(
                            open+1, close
                        )
                    ) {
                    } else {
                        array.add(inputString.substring(open + 1, close))
                    }
                }
            }
        }
        return array.toTypedArray()
    }
}
