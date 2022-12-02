import java.io.File

var twoCount = 0
var threeCount = 0
var words = File("input.txt").readLines()
var result = ""

File("input.txt").forEachLine {
    val charSequenceGroup  = it.asSequence().groupBy({it})
    twoCount += if (charSequenceGroup.filter({it.value.size == 2}).size > 0) 1 else 0
    threeCount += if (charSequenceGroup.filter({it.value.size == 3}).size > 0) 1 else 0

}

for(i in words.indices) {
    for(j in words.indices) {
        var diff = 0
        for(k in words.get(i).indices) {
            if(words.get(i).get(k) != words.get(j).get(k))
                diff++
            else
                result += words.get(i).get(k)
        }

        if(diff == 1) {
            print(result)
            System.exit(0)
        }
        result = ""
    }
}

