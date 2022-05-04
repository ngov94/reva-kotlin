package W2D3

import java.time.LocalDate
import kotlin.math.abs

fun main(){
    //Functions

    //signature of a funstion

//    fun funtionName(argName: argType,...):returnType{
//        //code for any logic
//        return 1
//    }
    //Example
//    fun simpleFun(num: Int):String{
//
//        return num.toString()
//    }
    //sum function
    println("\t---function sum and mul----")
    val a = 1
    val b = 2
    val c = 3
    val d = 4
    println(sum(a,b))
    println(sum(b,a))
    println(sum(c,d))
    println(mul(b,d))


    println("\t---function insertStudent---")
    var studentDetailName = arrayOf("Sam", "Bryan", "Mike")
    var gradeArray = arrayOf('A', 'B', 'C')
    var ageArray = arrayOf(21,34,22)
    var dobArray = arrayOf("2001-05-04", "1988-01-03", "2000-06-15")
    for (i in 0..studentDetailName.lastIndex){
        insertStudentDetails(studentDetailName.get(i),i+1000, LocalDate.parse(dobArray.get(i)), gradeArray.get(i), ageArray.get(i))
    }

    //new student
    insertStudentDetails(name="Adam",id=1003,dob=LocalDate.parse("1996-05-03"),age=25, address = "Home")

    //1. Default Arguments
    //is an argument that can assign a value to an argument, if there is no argument passed
    //keep the default towards the end otherwise it will create problems
    //2. Named Arguments
    // can use named arguments that match the function signature, so you don't have to follow an order
        //can not mix named and unnamed arguments

    println("----Lambda Function----")
    //1. Lambda Expression
    //functions that can be passed as arguments
    //writing a function as a expression
    //lambda signature
        //val name: date_type = {arg_list -> //code block}
        //-> arrow function
    //lambda cannot be overriden (so no point in changing to var)
    //lamba returns the last statement...can also use return
    //why use it? inline coding and brevity of coding
        //in the context of the class/object
        //lambda doesn't care about `this`
    val myop = {println("My simple lambda function")}
    myop()
    //to replace the sum fun
    val sum1 = {a:Int, b:Int ->
        val num = 7
        (a+b)*num
    }
    val sum2 = {a:Int, b:Int, c:Int -> println(a+b+c) }

    val sum3: (Int,Int) -> String = {a, b ->
        val num = 7
        "Sum is "+((a+b)*num)

    }
    println(sum1(2,4))
    sum2(2,4,23)
    println(sum3(3,5))



    println("\n\n----Anonymous Function----")
    //2. Anonymous functions
    //a function that doesn't have a function name, just the body
    //syntax
        //fun(argName: argType,...): returnType {}
            //OR
        //fun(argName: argType,...): returnType =
    //to call the function treat them like expressions

    println(anon1(3,6))

    //DIFFERENCE b/w lambda and anonymous
        //anon is returning value inside the function and pretty much similar to function
            //return belongs to the function
        //lambda is return belongs to the calling function that is calling lambda

    println("\n\n----Inline Function----")
    //Inline Functions
        //inline fun higherSum(a: Int, b:Int){}
        //see below
        //if you call function in main it will not allocaate separate memory
        //in compile code you wont have the whole function, it would be substituted with the value
        //saving memory
        //works better with parameters of functional type
    higherSum(2,7)
    //2+7 <---what is seen in the compile code
    lambInline({ println("Hi I'm 1")
        },{println("Hi I'm 2")
        })
//    println()
//    lambInline({ println("Hi I'm 1")
//    return},{println("Hi I'm 2")      //return exits out of main
//    })
//    println()
//    lambInline({ println("Hi I'm 1")
//    },{println("Hi I'm 2")
//    return})
    lambInline2({ println("Hi I'm 1")
    23},{println("Hi I'm 2")
    543})

    println("\n\n----Higher Order Function----")
    //Higher Order Functions
        //a function that takes another function as arg and returns another function
    hofun(lmb)

    //Step 3
    var sub = hofSub()
    //Step 4
    println(sub(45,23))


}
//anonymous functions
val anon1 = fun(a: Int, b: Int): Int = a*b      //equivalient to mul
val anon2 = fun(a: Int, b: Int): Int {
    val mul = a*b
    return mul
}
//lambda
val lamb1 = {a: Int, b: Int -> a*b}

//inline functions
inline fun higherSum(a: Int, b:Int): Int{ //here it says it is insignificant
    return a+ b
}

inline fun lambInline(lam1: () -> Unit, lam2: () -> Unit) {     //Unit is like void
    println(lam1())
    println(lam2())
    println("blahblah")
    //here don't need a return
}

inline fun lambInline2(lam1: () -> Int, lam2: () -> Int) {     //Unit == void
    println(lam1())
    println(lam2())
    println("blahblah")
}

//higher order function

var lmb = { a:Int, b:Int -> a*b }
fun hofun(lmb: (Int, Int) -> Int){
    var r = lmb(2,5)
    println("my result: $r")
}

//Step 1
fun subtraction( a:Int, b:Int): Int{
    var s = a-b
    return s
}

//Step 2
fun hofSub(): ((Int, Int) -> Int){
    return ::subtraction        //:: call ordinary function and map with lambda
}


    //  2 categories
    //1. Standard Library functions - print, toString, readln, sqrt, toInt, rem
    //2. User Defined Function - e.g. sum (below)


fun sum (a: Int, b: Int): Int{ //signature of the function
    return a+b                  //a and b only is in the scope of the for loop
}

//mul
fun mul(a: Int, b: Int): Int{
    return a*b
}



fun insertStudentDetails(name: String, id: Int, dob: LocalDate, grade: Char = 'D', age: Int = 20, address: String = "My School"): Boolean{
    println("Student Name: $name")
    println("Student ID: $id")
    println("Grade: $grade")
    println("Age: $age")
    println("DOB: $dob")
    println("Address: $address")
    println()

    return true
}