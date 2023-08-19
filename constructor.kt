//primary
class Person(val firstName: String, var age: Int) {

}
//what if no Var or Val 

//If the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword or it has to delegate to another constructor which does. Note that in this case different secondary constructors can call different constructors of the base type:

//You can also override a val property with a var property, but not vice versa.