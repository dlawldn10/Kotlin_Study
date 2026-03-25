package com.ivy.kotlin_study.twenty_six

import androidx.core.text.isDigitsOnly
import java.util.Stack
import kotlin.contracts.contract


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

// 구현: 풀이를 떠올리는 것은 쉽지만 소스코드로 옮기기 어려운 문제
// ex: 코드가 길어지는 문제 / 실수 연산, 소수점 자리 출력 문제
// / 문자열 처리 문제 / 적절한 라이브러리 사용해야 하는 문제 (순열, 조합 문제 등)
// 2차원 배열 (행렬, 방향벡터 사용)

// 이코테: 상하좌우
//  10:30 ~ 10:51
//fun main() {
//    val N = readln().toInt()
//    val list = readln().split(" ")
//    var x = 1
//    var y = 1
//    for (d in list) {
//        when (d) {
//            "R" -> {
//                if (y+1 > N) {
//
//                } else {
//                    y += 1
//                }
//            }
//            "U" -> {
//                if (x-1 < 1) {
//
//                } else {
//                    x -= 1
//                }
//            }
//            "D" -> {
//                if (x+1 > N) {
//
//                } else {
//                    x += 1
//                }
//            }
//            "L" -> {
//                if (y-1 < 1) {
//
//                } else {
//                    y -= 1
//                }
//            }
//
//        }
//        println("$x $y")
//    }
//    println("${x} ${y}")
//}

// 정답 -> 방향 벡터 활용
//fun main() {
//    val dx = arrayOf( 0, 0, -1, 1)
//    val dy = arrayOf( -1, 1, 0, 0 )
//    var nx = 0
//    var ny = 0
//    var x = 1
//    var y = 1
//    val moveType = arrayOf( "L", "R", "U", "D")
//
//    val N = readln().toInt()
//    val plans = readln().split(" ")
//    for (plan in plans) {
//        moveType.forEachIndexed { index, s ->
//            if (s == plan) {
//                nx = x + dx[index]
//                ny = y + dy[index]
//            }
//        }
//        if (nx < 1 || ny < 1 || nx > N || ny > N) continue
//        x = nx
//        y = ny
//    }
//    println("$x $y")
//}

// 이코테: 시각
// 11:02 ~ 11:21
//fun main() {
//    val N = readln().toInt()
//    var count = 0
//    var hour = N
//    var min = 59
//    var sec = 59
//    while (hour + min + sec != 0) {
////        println("$hour $min $sec")
//
//        val timeStr = "$hour $min $sec"
//        if (timeStr.contains("3")) count += 1
//
//        if (sec == 0) {
//            if (min == 0) {
//                if (hour == 0) {
//                    return
//                } else {
//                    hour -= 1
//                }
//                min = 59
//            } else {
//                min -= 1
//            }
//            sec = 59
//        } else {
//            sec -= 1
//        }
//    }
//    println(count)
//}

// 정답 -> 3중첩 for문
//fun main() {
//    val h = readln().toInt()
//    var count = 0
//
//    for (i in 0..h) {
//        for (j in 0 until 60) {
//            for (k in 0 until 60) {
//                if ((i.toString() + j.toString() + k.toString()).contains('3')) {
//                    count++
//                }
//            }
//        }
//    }
//
//    println(count)
//}

// 이코테: 왕실의 나이트
// 11:26~11:42
//fun main() {
//    val dx = arrayOf(2, 2, -2, -2, 1, -1, 1, -1)
//    val dy = arrayOf(1, -1, 1, -1, 2, 2, -2, -2)
//    val point = readln()
//
//    val x = point[1].digitToInt() -1
//    val y = when(point[0]) {
//            'a' -> 1
//            'b' -> 2
//            'c' -> 3
//            'd' -> 4
//            'e' -> 5
//            'f' -> 6
//            'g' -> 7
//            'h' -> 8
//        else -> {0}
//    } - 1
//
//    var count = 0
//    var nx = 0
//    var ny = 0
//    for (i in dx.indices) {
//        nx = x + dx[i]
//        ny = y + dy[i]
//        if (nx < 0 || ny < 0 || nx > 7 || ny > 7) continue
//        count += 1
//
////        println("$nx $ny")
//    }
//    println(count)
//}

// 정답
// -> input[0] - 'a' + 1 이용해서 char 숫자로 변환하기
// -> 튜플 리스트 사용해서 한번에 하기
//fun main() {
//    val input = readln()
//
//    val row = input[1].digitToInt()
//    val column = input[0] - 'a' + 1
//
//    val steps = listOf(
//        -2 to -1, -1 to -2, 1 to -2, 2 to -1,
//        2 to 1, 1 to 2, -1 to 2, -2 to 1
//    )
//
//    var result = 0
//
//    for ((dx, dy) in steps) {
//        val nextRow = row + dx
//        val nextColumn = column + dy
//
//        if (nextRow in 1..8 && nextColumn in 1..8) {
//            result++
//        }
//    }
//
//    println(result)
//}

// 이코테: 문자열 재정렬
// K1KA5CB7
// AJKDLSI412K4JSJ9D
// 11:45~11:59
//fun main() {
//    var sum = 0
//    val numStr = readln()
//        .map { it }
//        .sorted()
//        .map {
////            println(it)
//            if (it.isDigit()) {
//                sum += it.digitToInt()
//                ""
//            }
//            else
//                it
//        }
//
//    println((numStr.joinToString("")+sum))
//}

// 이코테: 음료수 얼려먹기
// 반복문 풀이
//import java.util.ArrayDeque
//fun main() {
//    val (n, m) = readln().split(" ").map { it.toInt() }
//    val graph = Array(n) { readln().map { it - '0' }.toIntArray() }
//
//    var result = 0
//
//    val dx = intArrayOf(-1, 1, 0, 0)
//    val dy = intArrayOf(0, 0, -1, 1)
//
//    for (x in 0 until n) {
//        for (y in 0 until m) {
//            if (graph[x][y] == 0) {
//                result++
//
//                val stack = ArrayDeque<Pair<Int, Int>>()
//                stack.addLast(x to y)
//                graph[x][y] = 1
//
//                while (stack.isNotEmpty()) {
//                    val (cx, cy) = stack.removeLast()
//
//                    for (i in 0 until 4) {
//                        val nx = cx + dx[i]
//                        val ny = cy + dy[i]
//
//                        if (nx in 0 until n && ny in 0 until m && graph[nx][ny] == 0) {
//                            graph[nx][ny] = 1
//                            stack.addLast(nx to ny)
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    println(result)
//}

// 재귀함수 풀이
//fun main() {
//    val input = readln().split(" ").map { it.toInt() }
//
//    lateinit var graph: Array<IntArray>
//    var n = 0
//    var m = 0
//
//    val dx = intArrayOf(-1, 1, 0, 0)
//    val dy = intArrayOf(0, 0, -1, 1)
//
//    fun dfs(x: Int, y: Int) {
//        graph[x][y] = 1
//
//        for (i in 0 until 4) {
//            val nx = x + dx[i]
//            val ny = y + dy[i]
//
//            if (nx in 0 until n && ny in 0 until m && graph[nx][ny] == 0) {
//                dfs(nx, ny)
//            }
//        }
//    }
//
//    n = input[0]
//    m = input[1]
//
//    graph = Array(n) { readln().map { it - '0' }.toIntArray() }
//
//    var result = 0
//
//    for (x in 0 until n) {
//        for (y in 0 until m) {
//            if (graph[x][y] == 0) {
//                dfs(x, y)
//                result++
//            }
//        }
//    }
//
//    println(result)
//}