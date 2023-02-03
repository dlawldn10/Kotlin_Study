package com.ivy.kotlin_study

import kotlin.math.ceil
import kotlin.math.pow


//fun solution(numbers: IntArray): Double {
//    return numbers.average()
//}

//fun solution(angle: Int): Int {
//    return when (angle){
//        in 0..89 -> 1
//        90 -> 2
//        in 91..179 -> 3
//        180 -> 4
//        else -> 1
//    }
//}

//
//fun solution(n: Int): Int {
//    var answer: Int = 0
//
//    for (i in 2..n step 2){
//        answer += i
//    }
//
//    // 또는
//    answer = (0 .. n step 2).sum()
//    return answer
//}


//fun solution(n: Int, k: Int): Int {
////    return n * 12000 + (k - n/10) * 2000
//    return n * 12_000 + k * 2_000 - n / 10 * 2_000
//}


//fun solution(num_list: IntArray): IntArray {
//    var answer: IntArray = intArrayOf(0, 0)
//    for (num in num_list){
//        if (num % 2 == 0) answer[0]++
//        else answer[1]++
//    }
//
//    // 또는
//    answer = intArrayOf(num_list.filter { it % 2 == 0 }.size, num_list.filter { it % 2 == 1 }.size)
//
//    return answer
//}


//fun solution(my_string: String): String {
//    return my_string.reversed()
//}


//fun solution(n: Int): Double {
//    return Math.ceil(n/7.0)
//}
//
//// 또는

//import kotlin.math.ceil
//fun solution(n: Int) = ceil(n / 7.0)


//fun solution(dot: IntArray): Int {
//    return when {
//        dot[0] > 0 && dot[1] > 0 -> 1
//        dot[0] < 0 && dot[1] > 0 -> 2
//        dot[0] < 0 && dot[1] < 0 -> 3
//        dot[0] > 0 && dot[1] < 0 -> 4
//        else -> 1
//    }
//}


//fun solution(num_list: IntArray): IntArray {
//    return num_list.reversedArray()
//}

//fun solution(strlist: Array<String>): IntArray {
////    var answer: IntArray = IntArray(strlist.size){ 0 }
////    for ((idx, str) in strlist.withIndex()){
////        answer[idx] = str.length
////    }
////    return answer
//
//    // 또는
//    return strlist.map { it.length }.toIntArray()
//}


//fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
//    return numbers.sliceArray(num1..num2)
//
//    // 또는
//    return numbers.copyOfRange(num1, num2 + 1)
//}


//fun solution(money: Int): IntArray {
////    var answer: IntArray = intArrayOf(0, 0)
////    answer[0] = money / 5500
////    answer[1] = money - answer[0] * 5500
////    return answer
//
//    // 또는
//    return intArrayOf(money / 5500, money % 5500)
//}


//fun solution(my_string: String, letter: String): String {
//    return my_string.split(letter).joinToString("")
//
//    // 또는
//    return my_string.replace(letter, "")
//
//    // 또는
//    return my_string.filterNot { it == letter[0]}
//}


//fun solution(slice: Int, n: Int): Int {
//    return ceil(n / slice.toDouble()).toInt()
//
//    // 또는
//    return n / slice + if (n % slice > 0) 1 else 0
//}

//fun solution(numbers: IntArray): Int {
//    numbers.sort()
//    return numbers[numbers.size-1] * numbers[numbers.size-2]
//}


//fun solution(array: IntArray, n: Int): Int {
//    return array.filter { it == n }.size
//
//    // 또는
//    return array.count { it == n}
//}


//fun solution(sides: IntArray): Int {
//    sides.sort()
//    return if (sides[0]+sides[1] > sides[2]) 1 else 2
//
//    // 또는
//    return sides.sorted().let { (x, y, z) -> if (x + y > z) 1 else 2 }
//}


//fun solution(n: Int): IntArray {
//    return (1 .. n step 2).toList().toIntArray()
//
//    // 또는
//    return (0..n).filter { it % 2 == 1 }.toIntArray()
//}


//fun solution(n: Int): Int {
//    var answer: Int = 0
//    for (i in 1..n){
//        if (n % i == 0) answer++
//    }
//    return answer
//
//    // 또는
//    return (1..n).count { n % it == 0 }
//}

//fun solution(array: IntArray, height: Int): Int {
//
//    return array.count(){
//        it > height
//    }
//}


//fun solution(numbers: IntArray): IntArray {
////    for ((idx, num) in numbers.withIndex()){
////        numbers[idx] = num*2
////    }
////    return numbers
//
//    // 또는
//    return numbers.map { it * 2 }.toIntArray()
//}


//fun solution(my_string: String, n: Int): String {
////    var answer: String = ""
////    for (c in my_string){
////        for (i in 0..n){
////            answer += c
////        }
////    }
////    return answer
//
//    // 또는
//    return my_string.map { it.toString().repeat(n) }.joinToString("")
//}


//fun solution(price: Int): Int {
//    return when {
//        price >= 500000 -> price*0.80
//        price >= 300000 -> price*0.90
//        price >= 100000 -> price*0.95
//        else -> price
//    }.toInt()
//
//}

//fun solution(message: String): Int {
//    return 2*message.length
//}


//fun solution(array: IntArray): Int {
//    array.sort()
//    return array[array.size/2]
//}


//fun solution(s1: Array<String>, s2: Array<String>): Int {
////    var answer: Int = 0
////    for (i in s1){
////        if (i in s2) answer++
////    }
////    return answer
//
//    // 또는
//    return s1.count { s2.contains(it) }
//
//    // 또는
//    return s1.map(s2::contains).count { it }
//}


//fun solution(n: Int): Int {
////    var answer: Int = 0
////    var number = n.toString()
////
////    for (num in number){
////        answer += Character.getNumericValue(num)
////    }
////    return answer
//
//    // 또는
//    return n.toString().toList().sumOf { it.digitToInt() }
//}


//fun solution(str1: String, str2: String): Int {
//    return if (str1.contains(str2)) 1 else 2
//}


//fun solution(n: Int): Int {
//    return if ((1..n).any {  it*it == n }) 1 else 2
//}


//fun solution(my_string: String): Int {
//    return my_string.filter { it.isDigit() }.sumOf { it.digitToInt() }
//
//    // 또는
//    return my_string.filter(Char::isDigit).sumOf(Char::digitToInt)
//}


//fun solution(hp: Int): Int {
//    var Jcount = hp/5
//    var Bcount = hp%5/3
//    var Icount = hp%5%3
//    return Jcount+Bcount+Icount
//}


//fun solution(my_string: String): String {
//    val moeum = "aeiou"
//    return my_string.filter { it !in moeum }
//
//    // 또는
//    return my_string.replace("a|e|i|o|u".toRegex(), "")
//}


//import kotlin.math.*
//fun solution(n: Int, t: Int): Int {
//    var answer = t
//    for (i in 1..t){
//        answer *= 2
//    }
//    return answer
//}

//fun solution(my_string: String): String {
//    return my_string.map { if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar() }.joinToString("")
//
//    // 또는
//    return my_string.toList()
//        .map { if (it.isLowerCase()) it.toUpperCase() else it.toLowerCase() }
//        .joinToString("")
//}



//fun solution(cipher: String, code: Int): String {
//    var answer: String = ""
//    for (i in code..cipher.length step code){
//        answer += cipher[i-1]
//    }
//    return answer
//
//    // 또는
//    return cipher.filterIndexed{ i, _ -> (i+1) % code == 0}
//
//
//}


//fun main(args: Array<String>) {
//    val (n) = readLine()!!.split(' ').map(String::toInt)
//    for (i in 1..n){
//        println("*".repeat(i))
//    }
//}


//fun solution(rsp: String): String {
//    return rsp.map { when (it.digitToInt()) {
//        2 -> 0
//        0 -> 5
//        5 -> 2
//        else -> 0
//    } }.joinToString("")
//}


//fun solution(n: Int, numlist: IntArray): IntArray {
//    // 필터 조건을 충족하는 아이들을 제거해준다
//    return numlist.filter { it % n == 0 }.toIntArray()
//}


//fun solution(my_string: String): IntArray {
//    return my_string.filter { it.isDigit() }.map { it.digitToInt() }.sorted().toIntArray()
//}


//fun solution(box: IntArray, n: Int): Int {
//    box[0] /= n
//    box[1] /= n
//    box[2] /= n
//    return box[0]*box[1]*box[2]
//}


//fun solution(numbers: IntArray, direction: String): IntArray {
//    var answer: MutableList<Int> = numbers.toMutableList()
//    if (direction == "left"){
//        answer.add(answer[0])
//        answer.removeAt(0)
//    }else {
//        answer.add(0, answer[answer.size-1])
//        answer.removeAt(answer.size-1)
//    }
//    return answer.toIntArray()
//}


//fun solution(array: IntArray): IntArray {
//    var answer: IntArray = intArrayOf(0, 0)
//    var max = 0
//    var idx = 0
//    for ((i, num) in array.withIndex()){
//        if (max <= num) {
//            max = num
//            idx = i
//        }
//    }
//    answer[0]=max
//    answer[1]=idx
//    return answer
//
//    // 또는
//    return intArrayOf(array.maxOf { it }, array.indexOf(array.maxOf { it }))
//}


































