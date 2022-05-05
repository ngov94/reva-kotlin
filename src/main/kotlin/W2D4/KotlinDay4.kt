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

    //Inheritance
    var p = Person2()
    println(p.getName("John is the parent"))
    var t = Teacher()
    //3 --> child has access/inherited the getName function from parent
    println(t.getName("Dolly the teacher is a child of John "))
    println(t.teachKids())

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
//1 open class
open class Person2{
    fun getName(name: String):String {
        return name
    }

}
//2 : ---> To inherit
class Teacher():Person2(){

    fun teachKids(){
        println("I am teaching kids")
    }
}

class Merchant():Person2(){
    fun sellGoods(){
        println("I am selling goods")
    }
}