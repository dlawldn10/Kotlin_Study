package com.ivy.kotlin_study.twenty_five


// 이코테 : 곱하기 혹은 더하기
// 내 풀이 9:43~10:01
//fun main() {
//    val s = readln()
//    val numList = s.map { it.digitToInt() }
//    var result: Int? = null
//    for (num in numList) {
//        println(num)
//        if (result == null) {
//            result = num
//        } else {
//            if (num == 0 || result == 0) {
//                result += num
//            } else {
//                result *= num
//            }
//        }
//    }
//    println(result)
//}

// 정답 -> 두 수 중에서 하나라도 0또는 1인 경우 더하기를 수행, 두수가 모두 2 이상인 경우에는 곱하면 정답
//fun main() {
//    val result = readln()
//        .map { it.digitToInt() }
//        .onEach { println(it) }
//        .fold(0) { acc, num ->
//            if (acc <= 1 || num <= 1) acc + num
//            else acc * num
//        }
//
//    println(result)
//}

// 이코테 : 모험가 길드
// 내풀이 10:11~10:20
//fun main() {
//    val list = readln().split(" ").map { it.toInt() }.sorted()
//    var result = 0
//    var count = 0
//    var max = 0
//    println(list)
//    for (i in list) {
//        if (max < i) {
//            max = i
//        }
//        count += 1
//
//        if (count == max) {
//            result += 1
//            count = 0
//            max = 0
//        }
//    }
//    println(result)
//}

// 정답 -> max 없어도됨
//fun main() {
//    val list = readln().split(" ").map { it.toInt() }.sorted()
//    var result = 0
//    var count = 0
//    println(list)
//    for (i in list) {
//        count += 1
//
//        if (count >= i) {
//            result += 1
//            count = 0
//        }
//    }
//    println(result)
//}

