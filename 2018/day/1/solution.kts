import java.io.File

println("Hello world")
var result: Int = 0

vat set = HashSet<Int>(500)
set.add(0)

File("input.txt").forEachLine {
	println("=" + it)

	var prefix: String = it.substring(0,1)
	var number: String = it.substring(1)

	if(prefix.equals("+")) {
		result += number.toInt()
	} else {
		result -= number.toInt()
	}
	
}


println("Number:::" + result)