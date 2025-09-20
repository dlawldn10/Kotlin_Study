package com.ivy.kotlin_study.twenty_five

import androidx.collection.arraySetOf


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

// 2753
//fun main() {
//    val year = readln().toInt()
//    println(if((year%4 == 0 && year%100 != 0) || year%400 == 0) 1 else 0)
//}

// 14681
//fun main() {
//    val x = readln().toInt()
//    val y = readln().toInt()
//    if (x>0 && y>0) println("1")
//    else if (x<0 && y>0) println("2")
//    else if (x<0 && y<0) println("3")
//    else println("4")
//}

// 2884
//fun main() {
//    var (h, m) = readln().split(" ").map { it.toInt() }
//    if (m - 45 < 0) {
//        if (h == 0) {
//            h = 23
//        } else {
//            h -= 1
//        }
//        m = m + 60 - 45
//    } else {
//        m -= 45
//    }
//    println("$h $m")
//}

// 2525
//fun main() {
//    var (h, m) = readln().split(" ").map { it.toInt() }
//    val time = readln().toInt()
//    m += time
//    h += m / 60
//    if (h > 23) h -= 24
//    m %= 60
//    println("$h $m")
//}

// 2480
//fun main() {
//    val ary = readln().split(" ").map { it.toInt() }.sorted()
//    val diceMap = mutableMapOf<Int, Int>()
//    for (dice in ary) {
//        diceMap[dice] = (diceMap[dice] ?: 0) + 1
//    }
//
//    if (diceMap.size == 1) {
//        println(10000 + diceMap.keys.first() * 1000)
//        return
//    }
//
//    val sameOne = diceMap.filter { it.value >= 2 }
//    if (diceMap.size == 2) {
//        println(1000 + sameOne.keys.first() * 100)
//        return
//    }
//
//    if (diceMap.size == 3) {
//        println(diceMap.keys.last() * 100)
//        return
//    }
//}
//fun main() {
//    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
//    val prize = when {
//        a == b && b == c -> 10000 + a * 1000
//        a == b || a == c -> 1000 + a * 100
//        b == c -> 1000 + b * 100
//        else -> maxOf(a, b, c) * 100
//    }
//    println(prize)
//}


// 2739
//fun main() {
//    val n = readln().toInt()
//    for (i in 1..9) {
//        println("$n * $i = ${n*i}")
//    }
//}

// 10950
//fun main() {
//    val n = readln().toInt()
//    repeat(n) {
//        val (a, b) = readln().split(" ").map { it.toInt() }
//        println(a+b)
//    }
//}

// 8393
//fun main() {
//    val n = readln().toInt()
//    var res = 0
//    for (i in 1..n) {
//        res += i
//    }
//    println(res)
//}
//fun main() {
//    val n = readLine()!!.toInt()
//    println(n * (n + 1) / 2)
//}

// 25304
//fun main() {
//    val x = readln().toInt()
//    val n = readln().toInt()
//    var res = 0
//    repeat(n) {
//        val (price, count) = readln().split(" ").map { it.toInt() }
//        res += price * count
//    }
//    if (res == x) println("Yes") else println("No")
//}

// 25314
//fun main() {
//    val n = readln().toInt()
//    val sb = StringBuilder()
//    repeat(n/4) {
//        sb.append("long ")
//    }
//    sb.append("int")
//    println(sb)
//}