package `2022`

import java.io.File

fun main(args: Array<String>) {
    var counter = 0
    val maxSum = File(AOCConstants.filePath("day1.txt"))
        //readline by line
        .readLines()
        //assign one index++ per group till we get a blank line and group them into batches
        .groupBy { if (it.isBlank()) counter++ else counter }
        //convert map to list
        .values
        // find sum for each batch
        .map { it -> it.map { it.toIntOrNull() ?: 0 }.sumOf { it } }
        // return max of each batch
        .maxOf { it }
    println(maxSum)
}
