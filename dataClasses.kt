// data class User(val name: String, val age: Int)
// The compiler automatically derives the following members from all properties declared in the primary constructor:

// .equals()/.hashCode() pair

// .toString() of the form "User(name=John, age=42)"

// .componentN() functions corresponding to the properties in their order of declaration.

// .copy() function (see below).

// To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:

// The primary constructor needs to have at least one parameter.

// All primary constructor parameters need to be marked as val or var.

// Data classes cannot be abstract, open, sealed, or inner.

// Additionally, the generation of data class members follows these rules with regard to the members' inheritance:

// If there are explicit implementations of .equals(), .hashCode(), or .toString() in the data class body or final implementations in a superclass, then these functions are not generated, and the existing implementations are used.