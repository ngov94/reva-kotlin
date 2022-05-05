package W2D3

import java.text.Format
import java.time.LocalDate
import java.util.*
import kotlin.math.*

fun main(){
    //Exercise 1
    //Program to Sort a List of items using for loop
    println("\t-----Exercise 1 ------")
    var itemArray = arrayOf(2,1,7,9,23,12,5)
    var itemArray2 = arrayOf(2,1,7,9,23,12,5)

    var temp = 0
    var temp2 = 0

    for (num in itemArray){
        print("$num ")
    }
    println()


    //insertion sort
    for(i in 0..itemArray.lastIndex){
        for (j in i.. itemArray.lastIndex){
            if(itemArray.get(i) > itemArray.get(j)){
                temp = itemArray.get(j)
                itemArray.set(j, itemArray.get(i))
                itemArray.set(i, temp)
            }
        }
    }
    for (num in itemArray){
        print("$num ")
    }
    println()

//    //selection sorting
//    for(i in 0..itemArray2.lastIndex) {
//        for (j in i..itemArray2.lastIndex) {
//
//        }
//    }


    //Exercise 2
    //Convert decimal numbers to binary numbers using the functions and for loop
    println("\t-----Exercise 2 ------")
    val read = Scanner(System.`in`)
    print("Enter decimal number: ")
    val dec = read.nextInt()

    println("$dec in binary is "+ decimalToBinary(dec))

    //Exercise 3
    //Multiply two Matrix using multi-dimensional array
    println("\t-----Exercise 3 ------")
    val matrix1 = arrayOf(
                    arrayOf(1,2,3),
                    arrayOf(4,5,6)
                )
    val matrix2 = arrayOf(
                    arrayOf(7,8),
                    arrayOf(9,10),
                    arrayOf(11,12)
                )
    val m = matrix1.size
    val n = matrix2.size
    val p = matrix2[0].size

    val result = Array(m){IntArray(p)}

    for (i in 0..m-1){
        for(j in 0..p-1){
            result[i][j] = 0
            for(k in 0..n-1){
                result[i][j] += matrix1[i][k]*matrix2[k][j]
            }
            print("${result[i][j]} ")
        }
        println()
    }
    //Exercise 4
    //Find the distance b/w two points
    //4.1 - What if the points are locations coordinates on a map
    println("\t-----Exercise 4 ------")
    val pp1 = Pair(2.0,3.0)
    val pp2 = Pair(4.0,5.0)

    val dist = sqrt((pp2.first-pp1.first).pow(2) +(pp2.second-pp1.second).pow(2)  )

    println("The straight line distance between p1(${pp1.first},${pp1.second}) and p2(${pp2.first},${pp2.second}) is %.2f.".format(dist))

    println("\t-----Exercise 4.1 ------")
    //using Harversine formulae
    val r = 6371 //Earths radius
    val lat1 = 40.7128
    val long1 = -74.0060
    val lat2 = 35.6894
    val long2 = 139.6917

    val dLat = abs( lat1-lat2)
    val dLong = abs( long1-long2)

    val a = sin(dLat/2).pow(2) + cos(lat1)* cos(lat2)*(sin(dLong/2)).pow(2)
    val c = 2 * atan2(sqrt(a), sqrt(1-a))
    val d = r * c

    println("The straight line distance between p1($lat1,$long1) and p2($lat2,$long2) is %.2f.".format(d))


    //Exercise 5
    //Given a word you need to a spell check and suggest a word (you have a dictionary to lookup)
//    var dictionary = arrayOf("apple", "berry", "cat", "kite")
//
//    print("Enter word for spell check: ")
//    val word = read.nextLine()
//    var maxmatches = 0
//    var matches = 0
//    var matched = ""
//
    //Each word can be converted to a number then compare the numbers
//
//    for (w in dictionary){
//       if(w.length)
//        for(c in w){
//            w.compareTo()
//        }
//    }
//

    //Exercise 6
    //Find if 2 rectangles overlap each other
    //Rect1 - (rec1x1, rec1y1) (rec1x2,rec1y2)
    //*-------
    //|      |
    //|      |
    //-------*
    //Rect2 - (rec2x1,rec2y1) (rec2x2,rec2y2)
    //Given the corners
    val p1 = Pair(5,10)
    val p2 = Pair(9,7)
    val p3 = Pair(7,7)
    val p4 = Pair(11,4)

//    val r1 = Pair(p1,p2)
//    val r2 = Pair(p3,p4)
    //check for no overlap
    //check on top
    if (p2.second>p3.second){//r1 on top of r2 no overlap
        println("no overlap")
    }
    else if(p4.second>p1.second){//r2 on top of r2 no overlap
        println("no overlap")
    }//check to side
    else if(p2.first< p3.first){//r1 left to r2 no overlap
        println("no overlap")
    }
    else if (p4.first<p1.first){//r2 left to r1 no overlap
        println("no overlap")
    }else {
        println("There is overlap")
    }




//    //Exercise 7
//    //2 line overlap each other (a line can be represented using 2 points)
//    //L1 - (l1x1,l1y1) (l1x2,l1y2)
//    //L2 - (l2x1,l2y1) (l2x2,l2y2)
//
//    //assume that pair is to the left
//    val l1l = Pair(5,10)
//    val l1r = Pair(9,7)
//    val l2l = Pair(7,7)
//    val l2r = Pair(11,4)
//
//    //check for no overlap



    //Exercise 8
    // Check if 2 date ranges overlap StartDate1, EndDate1, StartDate2, EndDate2

    val startDate1 = LocalDate.parse("2022-01-12")
    val endDate1 = LocalDate.parse("2022-01-12")
    val startDate2 = LocalDate.parse("2022-01-12")
    val endDate2 = LocalDate.parse("2022-01-12")


    read.close()
}

//Exercise 2
fun decimalToBinary (decimal: Int): String{
    var dec = decimal
    var binary = ""
    while(dec != 0){
        binary += dec%2
        dec /= 2
    }

    return binary.reversed()
}

