class Company() {
	lateinit var name: String
	lateinit var objective: String
	lateinit var founder: String
}

fun main() {
	// using scope function
	val gfg = Company().apply {
		// don't need to use object
		// name to refer members
		name = "GeeksforGeeks"
		objective = "A computer science portal for Geeks"
		founder = "Sandeep Jain"
	}
	println(gfg.name)
}
    