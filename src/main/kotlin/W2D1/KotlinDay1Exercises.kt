//Kotlin Exercises
//author: Neena Govindhan
//Date: May 2, 2022
//https://pl.kotl.in/EGPd7Bjad
fun main() {
    /*
     * 1. write a condition to check if variable a is even.  If a is even, the statements inside the if-block are executed.​

    Note:- Assign a value to variable a.
    In first case assign a == 10 and execute

    Second case assign a == 7 and execute.
    */
    println("Problem 1:")

    var a = 10
    if(a%2 == 0){
        println("$a is even")
    }

    a = 7
    if(a%2 == 0){
        println("$a is even")
    }

    /*
     * 2. Write a condition to check if variable a is even or odd.
    */
    println("\nProblem 2:")

    a = 10
    if(a%2 == 0){
        println("$a is even")
    }else{
        println("$a is odd")
    }

    a = 7
    if(a%2 == 0){
        println("$a is even")
    }else{
        println("$a is odd")
    }

    /*
     * 3. Write a condition to check if variable a is divisible by 2, 3 and 5
     */
    println("\nProblem 3:")

    a = 30

    if(a%2 == 0 && a%3 == 0 && a%5 ==0){
        println("$a is divisable by 2, 3, and 5")
    }else{
        println("$a is NOT divisable by 2, 3, and 5")
    }

    /*
     * 4. Write a condition to check if variable a is even and  divisible by 3 or 5
    */
    println("\nProblem 4:")

    a = 8

    if(a%2 == 0 && (a%3 == 0 || a%5 ==0)){
        println("$a is even and divisible by 3 or 5")
    }else{
        println("$a is either not even or not divisible by 3 or 5")
    }

    /*
     * 5. Find greatest of 3 numbers.
     * Ex. Var a = 30, Var b = 20, Var c = 50
     * Initialize the 3 variables and using if else condition find the greater number
    */
    println("\nProblem 5:")

    a = 30
    var b = 20
    var c = 50

    var max =   if(a > b && a > c){
                    a
                }else{
                    if(b>a && b>c){
                        b
                    }else{
                        c
                    }

                }

    println("$max is the greatest number")

    /*
     * 6. Initialize any value to a variable 'a'
     * Check variable for the following condition:
     * If a is less than 10 print a is smaller than 10
     * If a is less than 20 print a is smaller than 20
     * If a is less than 30 print a is smaller than 30
     * If a is less than 40 print a is smaller than 40
     * If a is less than 50 print a is smaller than 50
     * Else  print a is smaller than 100.
    */
    println("\nProblem 6:")

    a = 30

    if(a < 10){
        println("a is smaller than 10")
    }else if(a < 20){
        println("a is smaller than 20")
    }else if(a < 30){
        println("a is smaller than 30")
    }else if(a < 40){
        println("a is smaller than 40")
    }else if(a < 50){
        println("a is smaller than 50")
    }else{
        println("a is smaller than 100")
    }


}
