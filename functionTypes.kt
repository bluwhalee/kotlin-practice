// //Built-in
// var sum = arrayOf(1,2,3,4,5,6,7,8,9,10).sum()

// //Primitive types are passes by value, while objects are passed by reference

// //Any val parameter will be a class' member; an attribute. Without val, that parameter will be just a constructor parameter.
//main function
fun main()
{
	val add = Add(5, 6)
    var b  = add.a
	println("The Sum of numbers 5 and 6 is: ${add.c} ${b}")
}
//primary constructor
class Add1 (var a: Int,b:Int)
{
	var c = a+b;
    init{
        a = 10
        println(this.a)
    }
}

class Add
{
    constructor(a: Int, b: Int)
    {
        var c = a + b
        println("Sum of 5, 6 = ${c}")
    }
    constructor(a: Int, b: Int, c: Int)
    {
        var d = a + b + c
        println("Sum of 5, 6, 7 = ${d}")
    }
    constructor(a: Int, b: Int, c: Int, d: Int)
    {
        var e = a + b + c + d
        println("Sum of 5, 6, 7, 8 = ${e}")
    }
}

// Kotlin program of factorial using tail-recursion
// fun Fact(num: Int, x:Int):Long{
 
//     return if(num==1)   // terminate condition
//         x.toLong()
//     else
//         Fact(num-1,x*num)   //tail recursion
// }
// fun main() {
//     var n = 1
//     var result = Fact(5,n)
//     println("Factorial of 5 is: $result")
// }

//Lambda

// // with type annotation in lambda expression
// val sum1 = { a: Int, b: Int -> a + b }
 
// // without type annotation in lambda expression
// val sum2:(Int,Int)-> Int  = { a , b -> a + b}
// val lambda3: (Int)-> Unit = {print(Int)}

// lambda as class extension
// val lambda4 : String.(Int) -> String = { this + it }
 
// fun main(args: Array<String>) {
//     val result = "Geeks".lambda4(50)
//     print(result)
// }

// numbers.filter {  it > 0 }
// numbers.filter {  it -> it > 0 }

// Example 1: Function body as an expression  

//aNONYMUS FUNC

// fun(a: Int, b: Int) : Int = a * b
// Example 2: Function body as a block 

// fun(a: Int, b: Int): Int {
//     val mul = a * b
//     return mul
// }
 
// Difference between lambda expressions and anonymous functions-
// The only difference is the behavior of non-local returns. A return statement without a label always returns from the function declared with the fun keyword. This means that a return inside a lambda expression will return from the enclosing function, whereas a return inside an anonymous function will return from the anonymous function itself.

//Anonymous func

// inline func
//In order to reduce the memory overhead of such higher-order functions or lambda expressions, we can use the inline keyword which ultimately requests the compiler to not allocate memory and simply copy the inlined code of that function at the calling place.



// inline fun higherfunc( str : String, mycall :(String)-> Unit){
// 	// inovkes the print() by passing the string str
// 	mycall(str)
// }
// // main function
// fun main(args: Array<String>) {
    // 	print("GeeksforGeeks: ")
// 	higherfunc("A Computer Science portal for Geeks",::print)
// }
//With the help of the inline keyword, the println lambda expression is copied in the main function in the form of System.out.println and no further calls required.

//we can use return inside lambda func when its inline
// fun main(args: Array<String>){
// 	println("Main function starts")
// 	inlinedFunc({ println("Lambda expression 1")
// 	return },	 // inlined function allow return
// 				// statement in lambda expression
// 				// so, does not give compile time error

// 	{ println("Lambda expression 2")} )

// 	println("Main function ends")
// }
// 	// inlined function
// inline fun inlinedFunc( lmbd1: () -> Unit, lmbd2: () -> Unit ) {
    // 	lmbd1()
    // 	lmbd2()
    // }
    
//Higher order functions

// // lambda expression
// var lambda = {println("GeeksforGeeks: A Computer Science portal for Geeks") }
// // higher-order function
// fun higherfunc( lmbd: () -> Unit ) {	 // accepting lambda as parameter
// lmbd()							 //invokes lambda expression
// }
// fun main(args: Array<String>) {
// //invoke higher-order function
// higherfunc(lambda)				 // passing lambda as parameter
// }


// fun higherfunc( str : String, mycall :(String)-> Unit) {

// 	// inovkes the print() by passing the string str
// 	mycall(str)
// }

// // main function
// fun main(args: Array<String>) {
// 	print("GeeksforGeeks: ")
// 	higherfunc("A Computer Science portal for Geeks",::print)
// }

// // lambda expression
// var lambda = {a: Int , b: Int -> a + b }
// // higher order function
// fun higherfunc( lmbd: (Int, Int) -> Int) {	 // accepting lambda as parameter
		
// 	var result = lmbd(2,4) // invokes the lambda expression by passing parameters				
// 	println("The sum of two numbers is: $result")
// }

// fun main(args: Array<String>) {
// 	higherfunc(lambda)		 //passing lambda as parameter
// }

// fun printMe(s:String): Unit{
//     println(s)
// }
//    // higher-order function definition
// fun higherfunc( str : String, myfunc: (String) -> Unit){
//    // invoke regular function using local name
//     myfunc(str)
// }

//Returning a function
     // function declaration
// fun mul(a: Int, b: Int): Int{
// return a*b
// }
// //higher-order function declaration
// fun higherfunc() : ((Int,Int)-> Int){
// return ::mul
// }