package W2D3

import java.time.LocalDate

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
    val a = 1
    val b = 2
    val c = 3
    val d = 4
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

    //new student
    insertStudentDetails("Adam",1003,'C', 25, LocalDate.parse("1996-05-03"))

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