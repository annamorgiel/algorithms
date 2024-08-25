// starting data
var exampleArray = arrayListOf(0,0,2,4,8,7,3,0,9,-2,40) // will be sorted to (-2,0,0,0,2,3,4,7,8,9,40)

var sortedArray = arrayListOf(0,0,2,4,8,7,3,0,9,-2,40).sort() // will be sorted to (-2,0,0,0,2,3,4,7,8,9,40)


// OPTIMIZEME: function that should find index of the value in sorted array
fun findValueIndexInSortedArray(array: ArrayList<Int>, valueToFind: Int): Int
{
    var index = array.size/2
    var boundaryUpper = array.size
    var boundaryLower = 0
    
    var valueAtIndex = 0
    while(boundaryLower <= boundaryUpper){
        index = boundaryLower +(boundaryUpper - boundaryLower)/2
        valueAtIndex = array[index]
        when{
           valueAtIndex > valueToFind -> { boundaryUpper = index - 1 }
           valueAtIndex < valueToFind -> { boundaryLower = index + 1 }
           else -> return index
        }    
    }
    return -1
}


// calls to the function above
fun main() {
    println("Sorted array ${sortedArray}")
    println("Example array ${exampleArray}")
    sort(exampleArray)
    println("Sorted array ${exampleArray}")
    var index = findValueIndexInSortedArray(exampleArray, 9)
    println("Index of value 9 in the array $index")
    index = findValueIndexInSortedArray(exampleArray, 2)
    println("Index of value 2 in the array $index")
}
