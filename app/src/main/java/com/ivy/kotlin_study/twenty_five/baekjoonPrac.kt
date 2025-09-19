package com.ivy.kotlin_study.twenty_five


// 2557
//fun main() {
//    println("Hello World!")
//}

// 1000
//fun main() {
//    val (a, b) = readln().split(" ").map { it.toInt() }
//    println(a+b)
//}

// 1001
//fun main() {
//    val (a, b) = readln().split(" ").map { it.toInt() }
//    println(a-b)
//}

// 10998
//fun main() {
//    val (a, b) = readln().split(" ").map { it.toInt() }
//    println(a*b)
//}

// 1008
//fun main() {
//    val (a, b) = readln().split(" ").map { it.toDouble() }
//    println(a/b)
//}

// 10869
//fun main() {
//    val (a, b) = readln().split(" ").map { it.toInt() }
//    println(a+b)
//    println(a-b)
//    println(a*b)
//    println(a/b)
//    println(a%b)
//}

// 10926
//fun main() {
//    val nickname = readln()
//    val tmp = "??!"
//    val sb = StringBuilder().apply {
//        append(nickname)
//        append(tmp)
//    }
//    println(sb)
//}

// 18108
//fun main() {
//    val change = 2541 - 1998
//    val year = readln().toInt()
//    println(year-change)
//}

// 10430
//fun main() {
//    val (A, B, C) = readln().split(" ").map { it.toInt() }
//    val first = (A+B)%C
//    val second = ((A%C) + (B%C))%C
//    val third = (A*B)%C
//    val fourth = ((A%C) * (B%C))%C
//    println(first)
//    println(second)
//    println(third)
//    println(fourth)
//}

// 2588
//fun main() {
//    val A = readln()
//    val B = readln()
//    for (b in B.toCharArray().map { it.digitToInt() }.reversed()) {
//        val tmp = A.toInt() * b
//        println(tmp)
//    }
//    println(A.toInt()*B.toInt())
//}
//fun main() {
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//
//    println(a * (b % 10))        // 일의 자리
//    println(a * (b / 10 % 10))   // 십의 자리
//    println(a * (b / 100))       // 백의 자리
//    println(a * b)               // 전체 곱셈
//}

// 11382
//fun main() {
//    val (a, b, c) = readln().split(" ").map { it.toLong() }
//    println(a+b+c)
//}

// 10171
//fun main() {
//    println("""
//\    /\
// )  ( ')
//(  /  )
// \(__)|
//    """.trimIndent())
//}

// 10172
//fun main() {
//    println("|\\_/|")
//    println("|q p|   /}")
//    println("( 0 )\"\"\"\\")
//    println("|\"^\"`    |")
//    println("||_/=\\\\__|")
//}
//fun main() {
//    println("""
//        |\_/|
//        |q p|   /}
//        ( 0 )""${'"'}\
//        |"^"`    |
//        ||_/=\\__|
//    """.trimIndent())
//}

// 1330
//fun main() {
//    val (a, b) = readln().split(" ").map { it.toInt() }
//    if (a>b) println(">")
//    else if (a<b) println("<")
//    else println("==")
//}

// 9498
//fun main() {
//    val point = readln().toInt()
//    when (point) {
//        in 90..100 -> println("A")
//        in 80..89 -> println("B")
//        in 70..79 -> println("C")
//        in 60..69 -> println("D")
//        else -> println("F")
//    }
//}