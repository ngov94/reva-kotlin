package W2D4

fun main(){

//    //class and object
//    //Step 2 - creating object
//    val obj1 = Calc(1)
//
//    //Step 3 - accessing all the variables and functions using "dot" notation
//    //object(dot) --> obj.
////    println(obj1.sum(4,5))
////    println(obj1.myA)
////    obj1.myA = 23
////    println(obj1.myA)
//
//    val obj2 = Calc(5,6)
////    println(obj2.myA)
//
//    //separate memory is given to different objects(instances)



//    //Constructors
//    var s1 = Student(1)
//    var s2 = Student(1, 2)
//    var s3 = Student(1, 2, 3)
//    var s4 = Student("I am a String")
//
//    //Getter and Setters
//    val p = Person()
//    println(p.name)
//    p.name = "CHANGE"
//    println(p.name)
//
//    println(p.myAnothername)
//    p.myAnothername = "CHANGE2"
//    println(p.myAnothername)

//    //Inheritance
//    var p = Person2()
//    p.getName("John")
//    var t = Teacher()
//    //3 --> child has access/inherited the getName function from parent
//    t.getName("Dolly")//override getName from parent class
//    println(t.teachKids())

//    //primary and secondary constructors and inheritence
//    var ceo = CEO("Don", 234223, 120000.00)

    //Visability Modifier
    var a = A()
    println(a.getA()) //private
    var b = B()
    b.display()

    var b1 = BProtected()
    println(b1.getMyProtectedValue()) //this is a public function so it can access a

    var a1 = AProtect()
//    println(a1.a)  ---> since it is protected it is only visible inside the same class

}
//OOP
//Signature of Class
//keyword-class ClassName(title-case){
    //class body
        // property / member variable
        // member function
//}

//Step 1 - creating class with variables and functions
//1.Primary Constructor
//can have default arguments
//the arguments are immutable
//this is not a member variable
class Calc (a:Int, b:Int=3){
    //step 4
    var myVal1:Int = a //have to create a variable
    //can use the init block, but don't need to
    var myVal2:Int

    //step 5 - this block of code will run when the object is initalized
        //not just to initialize the properties
    init{
//        myVal1 = a
        myVal2 = b
        println(a)
        println(b)
    }


//    //property
//    var myA:Int
//    var myB:Int
//    //init
//    init{
//        myA = a
//        myB = b
//    }
    //member function
    fun sum(a:Int, b:Int): Int{
        return a+b
    }
    fun mul(a:Int, b:Int): Int{
        return a*b
    }
    fun rem(a:Int, b:Int): Int{
        return a%b
    }

}

//Constructor
    //How you initialize the class properites for an object
    //1. Primary Constructor
        //part of the class name
        //pass variables(parameters) in the class signature
        // only one



    //2. Secondary Constructor
        //can have multiple constructors -- constructor overriding
        //but if the type or number of args must be different
            //even changing the name of the passing variable won't work if the type and number of args are the same
        //if you want to overload a primary constructor, can use secondary constructors
            //i.e. can mix primary and secondary
class Student{

    constructor(a:Int){
        println("I'm called for 1 arg $a")
    }
    constructor(a:Int, b:Int){
        println("I'm called for 2 args $a $b")
    }constructor(a:Int, b:Int, c:Int){
        println("I'm called for 3 args $a $b $c")
    }constructor(a:String){
        println("I'm called for 1 arg $a")
    }


}

//Getters and Setters
//you only need to make the getter and setter below,
//it impleciently knows which one you are

//class Person{
//    var name:String = "John"
//}

class Person{
    var name:String = "default"
        //getter
        get() = field
        //setter
        set(value){
            field = value + " You did a set for name"
        }
    var myAnothername:String = "default2"
        //getter
        get() = field
        //setter
        set(value){
            field = value + " You did a set for myAnothername"
        }

}

//Inheritance
    //OOP is supposed to mimic the real world, objects have relations
    //write less code - reusability of code
    //specialization of subclass overring functions
    //Every class in Kotlin is final....so need to use keyword 'open' so that it can be inherited
    //fun in the parent class can be brought in automatically to the child class
    //child can change what it got from its parents (using override)
    //need to make functions open as well if overrriding it in child class
//1 open class
open class Person2{
    open fun getName(name: String) {
        //100 lines of code
        println("Parent "+name)
    }

}
//2 : ---> To inherit
class Teacher():Person2(){
    override fun getName(name:String){ //we have override function from parent
        //wants the 100 lines + want to add some functionality on top of that
        super.getName(name)
        //any code here
        println("child "+name)
    }

    fun teachKids(){
        println("I am teaching kids")
    }
}

class Merchant():Person2(){
    fun sellGoods(){
        println("I am selling goods")
    }
}

open class Employee{
    constructor(name: String, id: Int){
        println("hi my name is : $name")
        println("hi my ID is : $id")
    }
}

//signature of inherited class can be different
//primary constructor - the init in the child implicitly calls the parent then child gets called
//secondary constructor - need to call super() in child class constructor
class CEO:Employee{
    constructor(name: String, id: Int,salary: Double) : super(name, id) {
        println("My salary is: $salary")
    }
}



//Encapsulation
    //Class encloses properties of a class


//Abstraction
    //Complexities of the coden are hidden

//Visibility Modifier
//1. public (default)               -visible everywhere
//2. private                        -visible inside the same class
//3. protected                      -visible inside the same class ana its subclasses
//4. internal (kotlin specific)     -visible inside the same module/package


//when we look at packages we will understand internal better
internal class A12{

}

class B12{
    internal val i = 10
    internal fun myfun(){

    }
}

open class AProtect{
    protected val a = 10 //protected variable
}

class BProtected:AProtect(){ //child class
    fun getMyProtectedValue():Int{
        return a
    }
}

open class A{ //the private class - the scope of the class is limited this Kotlin file
    private var a = 10//private variable - the scope is limited to inside the class
    fun getA():Int{//encapsulation
        return a
    }
}

//class BPrivate: A() {
//    fun getAPrivate(){
//        return a
//    }
//}

class B{//by default it is public
    var a1:Int = 10
    fun display(){
        println("Display my text")
    }
}

////Recursion - Stack, Back tracking
//fun funA(){
//    funA() //function calling itself
//    //Exit condition --> to make sure you don't end up in an infinite loop
//}