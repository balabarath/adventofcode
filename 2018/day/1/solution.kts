import java.io.File

println("Hello world")
var result: Int = 0

val visitedNumbers: java.util.HashSet<Int> = hashSetOf()
visitedNumbers.add(0)

var stateChanged: Boolean = false

while(!stateChanged){

	
		File("input.txt").forEachLine {

			var prefix: String = it.substring(0,1)
			var number: String = it.substring(1)

			if(prefix.equals("+")) {
				result += number.toInt()
			} else {
				result -= number.toInt()
			}

			if(visitedNumbers.contains(result)) {
				println(result)
				stateChanged=true;
				System.exit(0)
			} else {
				visitedNumbers.add(result)
			}
		}

	
}