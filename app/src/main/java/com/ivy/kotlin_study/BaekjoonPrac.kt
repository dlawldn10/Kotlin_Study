package com.ivy.kotlin_study

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


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
// --
//@RequiresApi(Build.VERSION_CODES.N)
//fun main(){
//    val sc = Scanner(System.`in`)
//    val min_pq = PriorityQueue<Int>()
//    val max_pq = PriorityQueue<Int>(kotlin.Comparator { t, t2 -> t2.compareTo(t) })
//    for (i in 1..sc.nextInt()){
//        val num = sc.nextInt()
//        when {
//            num == 0 ->{
//                var ret = 0
//                if (min_pq.isNotEmpty() || max_pq.isNotEmpty()){
//                    ret = when {
//                        max_pq.isEmpty() -> min_pq.poll()
//                        min_pq.isEmpty() -> max_pq.poll()
//                        else -> if(min_pq.peek() < -max_pq.peek()) min_pq.poll() else max_pq.poll()
//                    }
//                }
//                println(ret)
//            }
//            num < 0 -> max_pq.add(num)
//            num > 0 -> min_pq.add(num)
//        }
//
//    }
//}


// 1302 - 베스트셀러
// 5:20
// 5:36
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val list = mutableListOf<String>()
//    val answerlist = mutableListOf<String>()
//
//    repeat(N){
//        list.add(sc.next())
//    }
//
//    // sortedWith compareBy 사용
//    val map = list.groupingBy { it }.eachCount().toList().sortedWith(compareBy({-it.second}, {it.first}))
//    println(map[0].first)
//
//
//    // 그냥 maxOf 사용해서 for문 돌리기
////    val max = map.maxOf { it.value }
////    map.forEach {
////        if (it.value == max) answerlist.add(it.key)
////    }
////    answerlist.sort()
////    println(answerlist[0])
//
//}


// 7785 - 회사에 있는 사람
// 5:55
// 6:20
//fun main(){
//    // map으로 풀기
////    val sc = Scanner(System.`in`)
////    val hashMap = HashMap<String, Int>()
////    repeat(sc.nextInt()){
////        val inputList = sc.next()
////        if (sc.next().equals("enter")) hashMap[inputList] = 1
////        else hashMap[inputList] = 0
////    }
////
////    // sortedWith, thenByDescending
////    hashMap.toList()
////        .sortedWith(compareBy<Pair<String, Int>> { -it.second }.thenByDescending { it.first })
////        .forEach { if (it.second == 1) println(it.first) }
//
//    // set으로 풀기
//    val sc = Scanner(System.`in`)
//    val set = hashSetOf<String>()
//    repeat(sc.nextInt()){
//        val inputList = sc.next()
//        if (sc.next().equals("enter")) set.add(inputList)
//        else set.remove(inputList)
//    }
//
//    println(set.sortedDescending().joinToString("\n"))
//}


// 5397 - 키로거
// 7:24
// 7:45
//fun main(){
//    val sc = Scanner(System.`in`)
//    repeat(sc.nextInt()){
//        val stack1 = Stack<Char>()
//        val stack2 = Stack<Char>()
//        for (i in sc.next()){
//            when(i){
//                '<' -> if (stack1.isNotEmpty()) stack2.push(stack1.pop())
//                '>' -> if (stack2.isNotEmpty()) stack1.push(stack2.pop())
//                '-' -> if (stack1.isNotEmpty()) stack1.pop()
//                else -> stack1.push(i)
//            }
//        }
//
//        println("${stack1.joinToString("")}${stack2.reversed().joinToString("")}")
//    }
//}


// 1935 - 후위 표기식2
// 7:51
// 8:37
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val str = sc.next()
//    val values = hashMapOf<Char, Double>()
//    for (i in 0..N-1){
//        val k = sc.nextInt()
//        values[(65+i).toChar()] = k.toDouble()
//    }
//
//    val stack = Stack<Double>()
//    for (i in str){
//        if (i.isLetter()){
//            stack.push(values[i])
//        }
//        else{
//            val a = stack.pop()
//            val b = stack.pop()
//            when (i){
//                '+' -> stack.push(a+b)
//                '-' -> stack.push(b-a)
//                '*' -> stack.push(a*b)
//                '/' -> stack.push(b/a)
//            }
//        }
//    }
//    // String format 사용하여 소수점 표현하기
//    // 소수점 아래 2자리수까지 표현하기
//    println("%.2f".format(stack.pop()))
//}


// 2075 - N번째 큰 수
// 8:45
// 8:55
//@RequiresApi(Build.VERSION_CODES.N)
//fun main(){
//    val sc = Scanner(System.`in`)
//    val maxHeap = PriorityQueue<Int>(kotlin.Comparator { t, t2 -> t2.compareTo(t) })
//    val N = sc.nextLine().toInt()
//    repeat(N){
//        sc.nextLine().split(" ").forEach { maxHeap.add(it.toInt()) }
//    }
//    for (i in 1..N){
//        if (i == N) println(maxHeap.poll())
//        else maxHeap.poll()
//    }
//}


// 3040 - 백설 공주와 일곱 난쟁이
// 8:56
// 9:27
//fun main(){
//    val sc = Scanner(System.`in`)
//    val ary = Array(9){ 0 }
//    val check = Array(9){ 0 }
//    for (i in 0 until 9){
//        ary[i] = sc.nextInt()
//    }
//    var found = false
//
//    fun DFS(list: ArrayList<Int>){
//        if (list.size == 2 && found == false){
//            if (ary.sum() - list.sum() == 100) {
//                ary.filter { it !in list }.forEach { println(it) }
//                found = true
//                return
//            }
//        }else{
//            for (i in ary.indices){
//                if (check[i] == 0){
//                    check[i] = 1
//                    list.add(ary[i])
//                    DFS(list)
//                    // 리스트로 백트래킹 할때는 remove를 꼭 해준다.
//                    list.remove(ary[i])
//                    check[i] = 0
//                }
//
//            }
//        }
//    }
//
//    DFS(arrayListOf())
//
//}


// 10448 - 유레카 이론
//fun main(){
//    val sc = Scanner(System.`in`)
//    val numList = arrayListOf<Int>()
//    repeat(sc.nextInt()){ numList.add(sc.nextInt()) }
//    val triNumList = arrayListOf<Int>()
//
//    val max = numList.max()
//    var n = 1
//    while (true){
//        val tmp = n*(n+1)/2
//        if (tmp >= max) break
//        triNumList.add(tmp)
//        n++
//    }
//    var flag = 0
//
//    fun DFS(list: ArrayList<Int>, result: Int){
//        if(flag == 1) return
//
//        if (list.size == 3 && flag == 0){
//            if (list.sum() == result) {
//                flag = 1
//                return
//            }
//        }else{
//            for (i in triNumList.indices){
//                if(triNumList[i] < result){
//                    // 중복을 허용해서 탐색하고 싶은 경우 체크 배열을 만들지 않고 remove만 시킨다.
//                    list.add(triNumList[i])
//                    DFS(list, result)
//                    list.remove(triNumList[i])
//                }else return
//            }
//        }
//
//    }
//
//    for (num in numList){
//        flag = 0
//        DFS(arrayListOf(), num)
//        println(flag)
//    }
//
//}


//