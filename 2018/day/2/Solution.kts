import java.io.File

var twoCount = 0
var threeCount = 0

File("input.txt").forEachLine {
    val charSequenceGroup  = it.asSequence().groupBy({it})
    twoCount += if (charSequenceGroup.filter({it.value.size == 2}).size > 0) 1 else 0
    threeCount += if (charSequenceGroup.filter({it.value.size == 3}).size > 0) 1 else 0

}
println(twoCount*threeCount)
