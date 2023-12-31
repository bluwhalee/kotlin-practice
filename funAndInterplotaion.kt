//string interpolation feature is using the StringBuilder class under the hood.
class Person(val firstName: String, val lastName: String, val age: Int) {
    override fun toString(): String {
        return "$firstName $lastName is $age years old"
    }
}