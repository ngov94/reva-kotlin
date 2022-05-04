import java.util.*

//Kotlin Day 2 Exercises
//author: Neena Govindhan
//Date: May 3, 2022

fun main(){

    //2: Find Factorial of a number using loop
    println("Exercise 2")

    val read = Scanner(System.`in`)
    print("Enter number for factorial: ")
    val n = read.nextInt()

    var fac:Long = 1//because factorial can be really large
    for(i in 1..n){
        fac *= i.toLong()

    }
    println("Factorial of $n is $fac")

    //3: Generate Multiplication Table using for loop
    println("\nExercise 3")
    print("Which multiplication table do you want: ")
    val m = read.nextInt()
    for(i in 1 .. 10){
        println("$i x $m = ${i*m}")
    }

    //4: Display Fibonacci series up to 100 using for loop
    println("\nExercise 4")

    var fib1 = 0
    var fib2 = 1
    var temp = 0

    print("Fibonacci Sequence is 0,1,")

    for(i in 1 .. 10){
        temp = fib1+fib2
        print("$temp,")
        fib1 = fib2
        fib2 = temp
    }

    //5: Print the following number using for loop
    println("\n\nExercise 5")
    var number = arrayOf(1,2,3,6,4,2,0)

    for(num in number){
        print("$num ")
    }
    /*
        another way
        for(i in 1..3)
            print("$i ")

        for(i in 6 downTo 0 step 2)
            print("$i ")
     */

    //6: Find largest element in an array
    println("\n\nExercise 6")

    val doubleArray = doubleArrayOf(23.4,-34.5,50.0,33.5,55.5,43.7,5.7,-66.5)

    var max = Double.MIN_VALUE

    print("For array ")
    for(i in doubleArray){
        if(max < i){
            max = i
        }
        print("$i,")

    }
    println("\nThe largest element in array is $max")

    //7: Program to Calculate Average using Arrays
    println("\nExercise 7")

    var doArray = doubleArrayOf(45.3,67.5,-45.6,20.34,33.0,45.6)
    var sumf = 0.0
    print("For array ")
    for(i in doArray){
        sumf += i
        print("$i,")
    }
    println("\nThe average is %.2f".format(sumf/doArray.size))

    //8: Print ASCII value and their equivalent character.
    println("\nExercise 8")

    for(i in 0 .. 255){
        println("$i - ${i.toChar()}")
    }


}