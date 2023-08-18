// you may relate companion objects with static methods (even though how they work internally is totally different).

// The companion objects can access private members of the class. Hence, they can be used to implement the factory method patterns.
class EmployeeData(var empId: Int, var empName: String) {
 
    // fields which are common across class objects
    companion object {
    val companyName = "CompanyA"
    val companyLocation = "New York"
    }
    }
     
    fun main() {
    // companion object fields accessed with {className}.{companion object parameter}
    println("Companion Object Data - ${EmployeeData.companyLocation} & ${EmployeeData.companyName}")
    }