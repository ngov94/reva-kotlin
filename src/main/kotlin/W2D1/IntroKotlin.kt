// This is a single line comment

/*This is a multi line comment
 * Kotin Hello World Program
 * This program will print Hello World as output to the STDOUT
*/
//data types: Character(Strings), numbers(Byte, Short, Int, Long, Float, Double)
//          and boolean
//
//
//Byte (8-bits) 2^8-1 (0 - 255)
//short 16 bits
//in 32 bits (4 bytes) 2^32-1
//long 64 bits

//Float, Double

//Boolean - takes only 1 bit (true/false)

//Char (2 bytes) - used to be 1 byte, but now there are a lot of symbols and language
//                 added then needs 2 bytes
/*
    Variable
        There are 2 types: mutable and immutable
        There are 2 ways to write variables: val(immutable) and var(mutable)

*/
/*
    Operators
        6 types:
            Arithmetic (+,-,*,/,%(speciality of modula - circular operator))
            Relation(<,>,>=,>=, ==, !=) ---outcome is going to be boolean
            Assignment (=,+=,-=,etc.)
            Unary(++, --) --there is pre(before) and post(after)
            Logical (&&-short circuit operator, ||, !)
            Bitwise (left shift, right shift, convert into bit)
            (Tertiary(?:))
 */
/*
Truth Table for || (or)
    X Y Z (o/p)
    0 0 0
    0 1 1
    1 0 1
    1 1 1
 */
fun main() {
    //var name = "Neena"
    var myMaxInt = Int.MAX_VALUE

    var myMinInt = Int.MIN_VALUE
    var myMaxShort = Short.MAX_VALUE
    var myMinShort = Short.MIN_VALUE
    var myMaxByte = Byte.MAX_VALUE
    var myMinByte = Byte.MIN_VALUE
    var myMaxLong = Long.MAX_VALUE
    var myMinLong = Long.MIN_VALUE

    var myMaxFloat = Float.MAX_VALUE
    var myMinFloat = Float.MIN_VALUE
    var myMaxDouble = Double.MAX_VALUE
    var myMinDouble = Double.MIN_VALUE

    var alpha = 'C'

    var myBoolean = true


    //can also write like this but Kotlin recognizes the other way as well
    //var mynewInt: Int = 20
    println("Max Byte: $myMinByte")
    println("Min Byte: $myMaxByte\n")

    println("Max Short: $myMinShort")
    println("Min Short: $myMaxShort\n")

    println("Max Int: $myMinInt")
    println("Min Int: $myMaxInt\n")

    println("Max Long: $myMinLong")
    println("Min Long: $myMaxLong\n")

    println("Max Float: $myMinFloat")
    println("Min Float: $myMaxFloat\n")

    println("Max Double: $myMinDouble")
    println("Min Double: $myMaxDouble\n")

    println("Char: $alpha")
    println("Char: ${alpha is Char}")
    //println("Char: ${alpha is String}") --- this is an Incompatible type
    println("Boolean: ${myBoolean is Boolean}\n")

    println("\t---ARITHMETIC OPERATORS---")
    var a  = 20
    var b = 30
    println(a+b)
    println("This is a+b: " + (a+b))

    a = 2
    b = 20
    println("This is a%b: " + (a%b))
    println("This is b%a: " + (b%a))
    println("\t---RELATIONAL OPERATORS---")
    println("This is a>b: " + (a>b))
    println("This is a<b: " + (a<b))
    println("\t---ASSIGNMENT OPERATORS---")
    a += b
    println("This is a+=b: " + (a))
    println("\t---UNARY OPERATORS---")
    println("a="+a+"\ta++="+(a++)+"\t++a="+(++a))

    var x = 1
    //++x

    println("\t---IF STATEMENTS---")

    //if statement
    if(x == 1){
        println("x is equal to 1")
    }

    //if else statement
    if(x == 1){
        println("x is equal to 1")
    }else{
        println("x is not equal to 1")
    }

    //if else if statement
    if(x > 0 && x!=1) {
        println("x is greater than one")
    }else if(x == 0){
        println("x is equal to zero")
    }else{
        println("x is less than zero or equal to 1")
    }

    //if set as a variable (if as a expression)
    var result =    if(x > 0 && x!=1) {
        "$x is greater than one"
    }else if(x == 0){
        "$x is equal to zero"
    }else{
        "$x is less than zero or equal to 1"
    }
    println(result)

    x = 2

    //nested if
    if(x > 0){
        //code1
        if (x != 1){
            //code2
            println("x is greater than 1")
            if (x > 10){
                //code3
                println("x is greater than 10")

            }else{
                //code4
                println("x is less than 10")
            }
        }
    }

    x = 11

    //refactoring of nested if --same as above, only if code1 doesn't exist
    if (x > 0 && x != 1){
        //code2
        println("x is greater than 1")
        if (x > 10){
            //code3
            println("x is greater than 10")
        }else{
            //code4
            println("x is less than 10")
        }
    }
}

