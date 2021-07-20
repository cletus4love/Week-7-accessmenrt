fun main() {

    println(reverseArray(arrayListOf(22, 76, 30,2,3,5, 31, 19)))

}
fun reverseArray(myNumbers: ArrayList<Int>): ArrayList<Int>{

    var result = arrayListOf<Int>()
    for(i in myNumbers.indices) {
        val nums = myNumbers[myNumbers.size -1 -i]
        result.add(nums)
    }
    return result 
}