// starting data
var exampleArray = arrayListOf(0,0,2,4,8,7,3,0,9,-2,40) // will be sorted to (-2,0,0,0,2,3,4,7,8,9,40)

var sortedArray = arrayListOf(0,0,2,4,8,7,3,0,9,-2,40).sort() // will be sorted to (-2,0,0,0,2,3,4,7,8,9,40)

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

// BONUS: write function that should sort the array instead of array.sort()
fun sort(array: ArrayList<Int>) {
    var isArraySorted = false
    while(!isArraySorted){
    isArraySorted = true
    for(i in 0 until array.size-1) {
        if(array[i] > array[i+1]){
            isArraySorted = false
            var temp = array[i]
            array[i] = array[i+1]
            array[i+1] = temp
        }
    }
    }
    println("Final sort ${array}")
}
