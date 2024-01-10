package com.ivy.kotlin_study

fun main(args: Array<String>) {
//    val s1 = readLine()!!
//    println(s1)


//    val (a, b) = readLine()!!.split(' ').map(String::toInt)
//    println("a = $a\nb = $b")


//    val s1 = "hi"
//    val a = 4
//    println(s1.repeat(a))


//    val s1 = "sTrGinf"
//    println(s1.map { it -> if (it.isLowerCase()) it.uppercaseChar() else it.lowercaseChar() }.joinToString(""))
//    // or
//    s1.map { if (it.isLowerCase()) it.uppercaseChar() else it.lowercaseChar() }
//        .joinToString("")
//        .also { println(it) }


//    println("!@#\$%^&*(\\'\"<>?:;")


//    val (a, b) = intArrayOf(5, 6)
//    println("$a + $b = ${a+b}")


//    val s1 = "bring"
//    val s2 = "honey"
//    println("$s1$s2")


//    val s1 = "andkfln"
//    s1.map { println(it) }


//    val a = readLine()!!.toInt()
//    println(if (a % 2 == 0) "$a is even" else "$a is odd")


    println(solution("Program29b8UYP", "merS123", 7, ))

}

fun solution(my_string: String, overwrite_string: String, s: Int): String {
    var answer: String = ""
    my_string.forEachIndexed { index, c ->
        if (index <= s-1 || index-s > overwrite_string.length-1)
            answer += c
        else
            answer += overwrite_string[index-s]
    }
    return answer
}