import java.util.*

//author: Neena Govindhan
//Date: May 3rd, 2022
fun main(){
// For loops
    //Collection (Array and List)

    //Can iterate through..
        //Range (..)
        //Array - collection of elements of the same data type, stored in contigous blocks of memory
        //String
        //Collection
    /*
         for(item in collection){

        }
     *//*
    */
//        //iterating through a range
//        for(i in 1..10){
//            println("$i")
//        }
//
//
//
//        //iterating through range with step
//        for(i in 1..10 step 2){
//            println("$i")
//        }
//
//
//        //iterating through range with step in decreasing order
//        for(i in 20 downTo 10 step 2){
//            println("$i")
//        }
//
//    //-----ARRAY--------------------
//    //iterating through every element in array
//    var numbers = arrayOf(1,2,3,4,5,6, 23,53,33)
//    var nameArray = arrayOf("Don", "John", "Bob", "Betty")
//    //3 ways to loop through array
//    //1. By Element (Value)
//    for(name in nameArray){
//        println("Hello $name")
//    }
//
//    //2. By Index
//    for(name in nameArray.indices){
//        println("${nameArray[name]} at $name")
//    }
//
//    for(name in nameArray.indices){
//        println("Hello ${nameArray[name]}")
//    }
//    //3. Using Value and Index
//    for((index,value) in nameArray.withIndex()){
//        println("my index is $index and the corresponding value is $value")
//    }
//
//    for(num in numbers){
//        if(num%3 == 0){
//            println("Divisable by 3 - YAY!!")
//        }else{
//            println("Not Divisable by 3 - Oh Man!")
//        }
//    }
//
//    //----STRING----------------------
//
//    var name = "awesome"
//    for(alpha in name.reversed()){
//        print(alpha+"**")//swiggly lines indicate that the code can be written better
//    }
//
//    //----LIST------------------------
//
//    //Collection - list
//    var collection = listOf(1,2,"3","5", 4.3, "blahblah")
//    //mixed data types in list
//    for(item in collection){
//        println(item)
//    }
//
//    var myArray = arrayOf(1,3,7,4,2,60,23)
//    var b = 11
//    //var inArray = false /// temp boolean
//    for((index,value) in myArray.withIndex()){
//        //println("my index is $index and the corresponding value is $value")
//        if(value == b) {
//            println("$b is in myArray at index $index")
//            //inArray = true
//            break //exit out of the inner most for loop
//        }else if(index == myArray.lastIndex){
//            println("$b is not in myArray")
//        }
//    }
    /*if(!inArray){
        println("$b is not in myArray")
    }*/

//    //Null safety - have to declare the String as nullable
//    var myStr:String? = "myString"
//    println(myStr)
//    myStr = "different"
//    myStr = null
//    println(myStr)
//
//    //-------How to test--------
//    //println and see the variable is expected to have right values
//    //check for a perfect scenario
//    //do something and check to see if it works
//    //Automated Test creating all the scenario - automate during runtime
//    //Test Driven Development (TDD)
//    //Boundary Condition Analysis
//    //Method of induction - solve for null, 1, k ==> for any given n it will work
//    /*var a = 55678934432422
//
//    while(a > 1){
//        //code
//
//        //exit condition
//        //a--
//    }*/
//
//   print("Enter Text:")
//    var input = readLine()
//    println("This is your input text: $input")

//    //like in Java
//    val num = Scanner(System.`in`)//note in is a keyword in Kotlin, so use back quote around in
//    print("Enter Integer:")
//    var myNum = num.nextInt()
//    println("This is your input: $myNum")
//    //entering a string will cause a runtime error (InputMismatchException)
//    //entering a null will not work
//
//    print("Enter Float:")
//    var myFloat = num.nextFloat()
//    print("Enter Boolean:")
//    var myBool = num.nextBoolean()
//    println("This is your input: $myBool")
//    println("This is your input: $myFloat")
//    println("This is your input: $myNum")

//    //input: 5
//    //output: 1+2+3+4+5 = 15 AP - (n*(n+1))/2
//    var num = Scanner(System.`in`)
//    print("Enter a number: ")
//    var input = num.nextInt()
//    var sum = 0

//    for(i in 1 .. input){
//        sum+=i
//    }
//    println("Sum from 1 to $input: $sum")
//
//
//    // input:array
//    var myIntArray = Array<Int>(5){ readln().toInt() }
//    var sum = 0
//    print("Sum of ")
//    for(i in myIntArray){
//        sum += i
//        print("$i ")
//    }
//    print("is $sum\n")

//    //take the size of the Array from the System.in
//    val read = Scanner(System.`in`)
//    val n = read.nextInt()
//    var myScanInp = Array(n){i -> read.nextInt()}
//    var sum = 0
//    print("Sum of ")
//    for(i in myScanInp){
//        sum += i
//        print("$i ")
//    }
//    print("is $sum\n")

    //-----Topics learned today----------
    //For ()
    //Input
    //Null Safety
    //How to test

    var numm = 1
    while (numm <= 10) {
        println(numm++)
    }
    //while * (0 or more)....do while + (1 or more)

}