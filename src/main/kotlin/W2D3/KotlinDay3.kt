package W2D3

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.Date

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
    var a = 1
    var b = 2
    var c = 3
    var d = 4
    println(sum(a,b))
    println(sum(b,a))
    println(sum(c,d))
    println(mul(b,d))

    var studentDetailName = arrayOf("Sam", "Bryan", "Mike")
    var gradeArray = arrayOf('A', 'B', 'C')
    var ageArray = arrayOf(21,34,22)
    var dobArray = arrayOf("2001-05-04", "1988-01-03", "2000-06-15")
    for (i in 0..studentDetailName.size-1){
        insertStudentDetails(studentDetailName.get(i),i+1000,gradeArray.get(i), ageArray.get(i), LocalDate.parse(dobArray.get(i)))
        println()
    }
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

fun insertStudentDetails(name: String, id: Int, grade: Char, age: Int, dob: LocalDate): Boolean{
    println("Student Name: $name")
    println("Student ID: $id")
    println("Grade: $grade")
    println("Age: $age")
    println("DOB: $dob")

    return true
}