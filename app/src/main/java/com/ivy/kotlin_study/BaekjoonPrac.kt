package com.ivy.kotlin_study

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs


// 13458 - 시험감독
// 8:20
// --
// 자료형 문제
//fun main(){
//    val N = readln().toInt()
//    val list = readln().split(" ").map { it.toInt() }
//    val (B, C) = readln().split(" ").map { it.toInt() }
//
//    var answer: Long = 0
//    list.forEach {
//        val newIt = it - B
//        if (newIt > 0){
//            answer += newIt / C
//            answer += if(newIt % C > 0) 1 else 0
//        }
//    }
//
//    println(answer + N)
//}


// 14501 - 퇴사
// 09:01
// 09:23
// 내 풀이 - DFS
//data class Counsel(val T: Int, val P: Int)
//fun main(){
//    val count = readln().toInt()
//    val list = Array<Counsel?>(count){ null }
//    for (i in 1..count){
//        val input = readln().split(" ").map { it.toInt() }
//        list[i-1] = (Counsel(input[0], input[1]))
//    }
//    val result = arrayListOf<Int>()
//
//    fun DFS(idx: Int, sum: Int){
//
//        if (idx >= list.size) {
//            result.add(sum)
//            return
//        }
//
//        // 이런 날은 일 안함
//        if (list[idx]?.T!! > list.size - idx) DFS(idx+1, sum)
//        else{
//            // 이날 일을 하거나
//            DFS(idx+ list[idx]?.T!!, sum+list[idx]?.P!!)
//            // 이날 일을 하지 않거나
//            DFS(idx+1, sum)
//        }
//
//    }
//
//    DFS(0, 0)
//
//    println(result.max())
//
//}

// 다른 풀이 - DP
//import java.util.*
//import kotlin.math.max
//
//data class Counsel(val T: Int, val P: Int)
//fun main() {
//    val sc = Scanner(System.`in`)
//    val n: Int = sc.nextInt()
//    val list = Array<Counsel?>(n){ null }
//    val dp = IntArray(n+1)
//
//    for (i in 0 until n) {
//        list[i] = Counsel(sc.nextInt(), sc.nextInt())
//    }
//
//    for (i in 0 until n) {
//        if (i >= 1) dp[i] = max(dp[i], dp[i-1])
//
//        if (list[i] != null && i + list[i]!!.T <= n) {
//            dp[i + list[i]!!.T] = max(dp[i + list[i]!!.T], list[i]!!.P + dp[i])
//        }
//
////        println(dp.contentToString())
//    }
//
//    println(max(dp[n - 1], dp[n]))
//}



// 11866 - 요세푸스 문제 0
// 8:50
// 9:08
// 큐 이용 방법
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val K = sc.nextInt()
//    val queue : Queue<Int> = LinkedList()
//    for (i in 1..N) queue.add(i)
//
////    var count = 0
////    print("<")
////    while (!queue.isEmpty()){
////        count++
////        if (count == K){
////            count = 0
////            print(queue.poll())
////            if (queue.isEmpty()) print(">")
////            else print(", ")
////        }else{
////            queue.add(queue.poll())
////        }
////    }
//
//
//    // 위 while문을 좀더 최적화
//    print("<")
//    while (queue.isNotEmpty()){
//        for (i in 1..K-1) queue.add(queue.poll())
//
//        print(queue.poll())
//        if (queue.isEmpty()) print(">")
//        else print(", ")
//    }
//
//}


// mutable list 이용 방법
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val K = sc.nextInt()
//    val array = arrayListOf<Int>()
//    val result = arrayListOf<Int>()
//    for (i in 1..N) array.add(i)
//
//    var pt = 0
//    for (i in 1..N){
//        pt += K-1
//        pt %= array.size
//        result.add(array[pt])
//        array.removeAt(pt)
//    }
//
//    println("<${result.joinToString(", ")}>")
//}


// 9012 - 괄호
// 9:52
// 10:06
//fun main(){
//    val sc = Scanner(System.`in`)
//    val T = sc.nextInt()
//
//    for (i in 1..T){
//        findBraces(sc)
//    }
//}
//
//fun findBraces(sc: Scanner){
//    val stack = Stack<Char>()
//    val str = sc.next()
//    for (c in str){
//        if (c == '('){
//            stack.push('(')
//        }else{
//            if (stack.isEmpty()){
//                println("NO")
//                return
//            }
//            stack.pop()
//        }
//    }
//    if (stack.isNotEmpty()) println("NO")
//    else println("YES")
//}


// 2164 - 카드2
// 10:08
// 10:11
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val queue = LinkedList<Int>()
//    for (i in 1..N) queue.add(i)
//
//    while (queue.size > 1){
//        queue.pop()
//        queue.add(queue.pop())
//    }
//    println(queue.pop())
//}


// 11286 - 절댓값 힙
// 10:13
fun main(){
    val sc = Scanner(System.`in`)
    val pq = PriorityQueue<Array<Int>>()
    for (i in 1..sc.nextInt()){
        val num = sc.nextInt()
        if (num == 0){
            if (pq.isEmpty()) println(0)
            else println(pq.poll()[1])
        }else{
            pq.add(arrayOf(abs(num), num))
        }
    }
}