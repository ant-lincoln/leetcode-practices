/**
 * TWO SUM
 *
 * Problem Explanation:
 * You are given an array of integers and a target value. The goal is to find two distinct numbers within
 * this array such that when they are added together, they sum up to the target value. The solution should
 * return the indices of these two numbers.
 *
 * Important Requirements:
 * - You must return the indices of the two numbers that add up to the target.
 * - The input array is guaranteed to have exactly one solution.
 * - You cannot use the same number twice.
 **/

fun twoSum(arr: Array<Int>, target: Int): IntArray {

    val map = mutableMapOf<Int, Int>()

    //run array
    for (i in arr.indices) {
        val complement = target - arr[i] //calculate the necessary complement

        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[arr[i]] = i
    }
    return intArrayOf()
}

fun main() {
    val arr = arrayOf(7, 5, 12, 15, 3)
    val target = 10
    val result = twoSum(arr, target)

    if (result.isEmpty()) {
        println("not found")
    } else {
        println("indices of target $target: ${result.joinToString(", ")}")
    }
}

main()
