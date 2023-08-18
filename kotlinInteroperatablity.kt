// Java class
// public class myjava {
// 	private int value;
// 	public int getValue() { return value; }
// 	public void setValue(int value) { this.value = value; }
// }
// // Kotlin file
// fun main(){
//     val obj = myjava()
//     obj.value = 5 // This will call the setter function
//     println(obj.value) // This will call the getter function
// }

//The only exception to this rule is the void return type. Those functions in Java that have a void return type, return a Unit type in Kotlin. So this value can be stored in Kotlin as a Unit exists as a type.
// Kotlin file
import myjava.*
fun main(args: Array<String>) {
	val obj = myjava()
	val ans = obj.add(4, 5)
	println("The sum of two numbers is "+ans)
}
// For example, if a Java class XYZ happens to have a method named any, then the method can be called in Kotlin as:  

// obj.`any`() 