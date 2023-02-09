package com.ivy.kotlin_study

import java.util.*
import kotlin.math.max
import kotlin.math.min


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


//fun solution(my_string: String, num1: Int, num2: Int): String {
//    val myString = my_string.toCharArray()
//    val tmp = myString[num1]
//    myString[num1] = myString[num2]
//    myString[num2] = tmp
//    return myString.joinToString("")
//
//    // 또는
//    return my_string.toList().let {
//        Collections.swap(it, num1, num2)
//        it.joinToString("")
//    }
//}


//fun solution(numbers: IntArray): Int {
////    var max = -100000000
//    var max = Integer.MIN_VALUE
//    for ((i, num) in numbers.withIndex()){
//        for ((j, num2) in numbers.withIndex()){
//            if (i == j) continue
//            if (num*num2 > max) max = num*num2
//        }
//    }
//    return max
//
//    // 또는
//    val sorted = numbers.sorted()
//    return max(sorted[0] * sorted[1], sorted[sorted.lastIndex] * sorted[sorted.lastIndex - 1])
//}


//fun solution(age: Int): String {
////    var answer: String = ""
////    var alphabet = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
////    val ageString = age.toString().toCharArray()
////    for (i in ageString){
////        answer += alphabet[i.digitToInt()]
////    }
////    return answer
//
//    // 또는
//    return age.toString().toCharArray().joinToString ("") {
//        (it + 49).toString()
//    }
//}


//fun solution(n: Int): Int {
//    var i = n
//    while (true){
//        if (i*6 % n == 0) break
//        i++
//    }
//    return i
//}


//fun solution(n: Int): IntArray {
//    var answer = mutableListOf<Int>()
//    for (i in 1..n){
//        if (i in answer) continue
//        if (n % i == 0) answer.add(i)
//    }
//    return answer.toIntArray()
//
//    // 또는
//    return (1..n).filter { n % it == 0 }.toIntArray()
//}


//fun solution(order: Int): Int {
//    val orderStr = order.toString()
//    return orderStr.count { it == '3' || it == '6' || it == '9' }
//}


//fun solution(num: Int, k: Int): Int {
//    val numStr = num.toString().map { it.digitToInt() }
////    for ((idx, value) in numStr.withIndex()){
////        if (k == value) return idx+1
////    }
////    return -1
//
//    return if (k in numStr) numStr.indexOf(k)+1 else -1
//
//}

//fun solution(my_string: String): String {
//    return my_string.map { it.lowercaseChar() }.sorted().joinToString("")
//    // 또는
//    return my_string.lowercase().toCharArray().sorted().joinToString("")
//}


//fun solution(n: Int): Int {
//    var answer: Int = 0
//    for (i in 1..n){
//        if((1..i).count { i % it == 0} >= 3) answer++
//    }
//    return answer
//
//    // 또는
//    return (1..n).filter { i -> (1..i).filter { i % it == 0 }.size > 2 }.size
//}


//fun solution(letter: String): String {
//    val morse = mapOf(".-"  to "a", "-..."  to "b", "-.-." to "c", "-.." to "d", "." to "e", "..-." to "f", "--." to "g",
//        "...." to "h", ".." to "i", ".---" to "j", "-.-" to "k", ".-.." to "l", "--" to "m", "-." to "n", "---" to "o", ".--." to "p",
//        "--.-" to "q", ".-." to "r", "..." to "s", "-" to "t", "..-" to "u", "...-" to "v", ".--" to "w", "-..-" to "x", "-.--" to "y", "--.." to "z"
//    )
//    val words = letter.split(" ")
//    return words.map { morse[it] }.joinToString("")
//
//}


//fun solution(my_string: String): String {
//    return my_string.toCharArray().distinctBy { it }.joinToString("")
//}



//fun solution(before: String, after: String): Int {
//    return if (before.toCharArray().sorted() == after.toCharArray().sorted()) 1 else 0
//}


//fun solution(n: Int): Int {
//    var i=0
//    var acc = 1
//    while (acc < n){
//        i++
//        acc = 1
//        for (number in 1..i) {
//            acc *= number
//            if (acc > n) return i
//        }
//    }
//    return i
//
//
//
//}

// 또는
//fun solution(n: Int) = (2..n).find { n < factorial(it) }?.dec() ?: n
//
//private tailrec fun factorial(n: Int, run: Int = 1): Int = if (n == 1) run else factorial(n - 1, run * n)


// 2차원 배열 선언하기
// Array(행의 크기, {IntArray(열의 크기, {초기화 값})}
//fun solution(num_list: IntArray, n: Int): Array<IntArray> {
//    var answer: Array<IntArray> = Array(num_list.size/n) { IntArray(n) { 0 } }
//    var num = 0
//    for (i in answer.indices){
//        for (j in answer[i].indices){
//            answer[i][j] = num_list[num]
//            num++
//        }
//    }
//
//    return answer
//
//}

// 또는
//fun solution(num_list: IntArray, n: Int)= num_list.toList().chunked(n)


//fun solution(array: IntArray, n: Int): Int {
//    var answer: Int = 0
//    array.sort()
//    var sub = Integer.MIN_VALUE
//    for (i in array){
//        if (abs(i-n) < sub) {
//            sub = abs(i-n)
//            answer = i
//        }
//    }
//    return answer
//
//}

// 또는
//fun solution(array: IntArray, n: Int) = array.sorted().minWithOrNull(compareBy { abs(it - n) })!!


//fun solution(i: Int, j: Int, k: Int): Int {
////    val tmpList = arrayListOf<Int>()
////    for (num in i..j){
////        tmpList.add(num)
////    }
////    var tmpStr = tmpList.joinToString("")
////
////    return tmpStr.count { it == k.digitToChar() }
//
//    // 더 간단하게
//    return (i..j).joinToString("").count { it == k.digitToChar() }
//}

//
//fun solution(emergency: IntArray): IntArray {
//    val answer = mutableListOf<Int>()
//    val tmp = emergency.sortedDescending()
//    println(tmp)
//    for (i in emergency){
//        answer.add(tmp.indexOf(i)+1)
//    }
//
//    return answer.toIntArray()
//
//    // 또는
//    return emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()
//}


//fun solution(s: String): String {
//    var tmp = mutableSetOf<Char>()
//    for (i in s){
//        if (s.count { it == i } == 1) tmp.add(i)
//    }
//    return tmp.sorted().joinToString("")
//}


//fun solution(my_string: String): Int {
//    // 정규 표현식 객체 사용하기
//    return my_string.split("[A-z]+".toRegex()).filter { it.isNotEmpty() }.sumOf { it.toInt() }
//
//    // 또는
//    return my_string.split("[A-z]+".toRegex())
//        .filter(String::isNotEmpty)
//        .sumOf(String::toInt)
//}


//fun solution(bin1: String, bin2: String): String {
//    // 진법 변환
//    // ex) 2진수를 10진수로 바꾸기
//    // Integer.parseInt(bin1, 2) -> 이렇게 쓰거나
//    // bin1.toInt(2) -> 이렇게 쓸 수 있다.
//    // String을 진법으로 표현하기
//    // 숫자.toString(2) -> 2진수로 표현하기
//    // 숫자.toString() -> 10진수로 표현하기
//    // 숫자.toString(16) -> 16진수로 표현하기
//    return Integer.toBinaryString(Integer.parseInt(bin1, 2)+Integer.parseInt(bin2, 2))
//
//    // 또는
//    return (bin1.toInt(2) + bin2.toInt(2)).toString(2)
//}



//fun solution(array: IntArray): Int {
//    return array.joinToString("").count{ it == '7'}
//}


//import java.util.*
//fun solution(numbers: IntArray, k: Int): Int {
//
//    var answer: Int? = 0
//    val queue : Queue<Int> = LinkedList()
//    numbers.forEach { queue.add(it) }
//
//    // 큐 사용하기
//    var i = 0
//    while (true){
//        answer = queue.poll()
//        queue.add(answer)
//        queue.add(queue.poll())
//        i++
//        if (i == k) break
//    }
//
//    return answer ?: 0
//
//    // 공식으로 풀기
//    return (1..k).map { numbers }.flatMap { it.toList() }[2 * (k - 1)]
//
//
//}


//fun solution(n: Int): IntArray {
//    var answer = mutableListOf<Int>()
//    var tmp = n
//    for (i in 2..n){
//        while (tmp % i == 0){
//            tmp /= i
//            answer.add(i)
//        }
//    }
//    return answer.distinct().sorted().toIntArray()
//}


//// 둘만의 암호
//// 3:50
//// 4:29
//fun solution(s: String, skip: String, index: Int): String {
//    var newSkip = ('a'..'z').filter { it !in skip }
//    var tmp = s.toCharArray()
//    for (idx in tmp.indices){
//        tmp[idx] = newSkip[(newSkip.indexOf(tmp[idx])+index)%newSkip.size]
//    }
//    return tmp.joinToString("")
//}


//// 개인정보 수집 유효기간
//fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
//    val answer = mutableListOf<Int>()
//
//    val todayTotal = totalDay(today)
//    val map = hashMapOf<String, Int>()
//
//    for (i in terms.indices) {
//        val token = terms[i].split(" ")
//        map[token[0]] = token[1].toInt()
//    }
//
//    for (i in privacies.indices) {
//        val token = privacies[i].split(" ")
//
//        val date = token[0]
//        val type = token[1]
//
//        val dateTotal = totalDay(date)
//        val month = map[type] ?: 0
//        val changedDay = month * 28
//
//        if (todayTotal >= (dateTotal + changedDay)) {
//            answer.add(i+1)
//        }
//    }
//
//    return answer.toIntArray()
//}
//
//
//private fun totalDay(todayTotal: String): Int {
//
//    var sum = 0
//    val token = todayTotal.split(".")
//    val y = token[0]
//    val m = token[1]
//    val d = token[2]
//
//    sum += y.toInt() * 12 * 28
//    sum += (m.toInt() - 1) * 28
//    sum += d.toInt()
//
//    return sum
//}


//// 크기가 작은 부분 문자열
//// 7:14
//// 7:53
//fun solution(t: String, p: String): Int {
////    var answer = arrayListOf<Long>()
////    for (i in 0..t.length-p.length){
////        answer.add(t.slice(i until i+p.length).toLong())
////    }
////    return answer.count { it <= p.toLong() }
//
//    // 또는
//    var answer = 0
//
//    for (i in 0..t.length - p.length) {
//        val sub = t.substring(i, i + p.length)
//        if (p.toLong() >= sub.toLong()) {
//            answer++
//        }
//    }
//
//    return answer
//}


//// 가장 가까운 같은 글자
//// 7:55
//// 8:32
//fun solution(s: String): IntArray {
//    var tmp = mutableListOf<Char>()
//    var answer = Array(s.length) { -1 }
//    var idx = 0
//    var pt: Char
//    for (i in s.indices){
//        pt = s[i]
//        idx = i
//        if (s[i] in tmp) continue
//        tmp.add(s[i])
//        for (j in (i+1 until s.length)){
//            if (pt == s[j]){
//                answer[j] = (j-idx)
//                idx = j
//            }
//        }
//    }
//    return answer.toIntArray()
//    또는
//    return s.withIndex().map { (i, c) -> s.slice(0 until i).lastIndexOf(c).let { if (it >= 0) i - it else -1 } }
//}


//// 문자열 나누기
//// 8:42
//// 9:28
//fun solution(s: String): Int {
//    var answer: Int = 0
//    var sameCnt = 0
//    var otherCnt = 0
//    var pt: Char
//    var i = 0
//    while (true){
//        if (i == s.length-1) {
//            answer += 1
//            return answer
//        }
//        pt = s[i]
//        for (j in i until s.length){
//            if (pt == s[j]){
//                sameCnt++
//            }else{
//                otherCnt++
//            }
//
//            if (sameCnt == otherCnt) {
//                answer++
//                i = j+1
//                sameCnt = 0
//                otherCnt = 0
//                break
//            }
//
//            if (sameCnt != otherCnt && j == s.length-1){
//                return answer
//            }
//
//        }
//
//    }
//
//    return answer
//}


//// 귤 고르기
//// 9:31
//// 10:00
//fun solution(k: Int, tangerine: IntArray): Int {
//
////    var distinctTan = tangerine.distinct()
////    var tanCntList = arrayListOf<Int>()
////    for (tan in distinctTan){
////        tanCntList.add(tangerine.count { it == tan })
////    }
////
////    var tanCnt = 0
////    tanCntList.sortDescending()
////    for ((idx, value) in tanCntList.withIndex()){
////        tanCnt += value
////        if (tanCnt >= k){
////            return idx+1
////        }
////    }
////
////    return 0
//
//    // 또는
//    var answer = 0
//    var limit = 0
//    tangerine.groupBy { it }.toList().sortedByDescending { it.second.size }.forEach {
//        if (limit >= k){
//            return answer
//        }
//        limit += it.second.size
//        answer++
//    }
//
//    return answer
//}
//
//// 이건 안썼음.
//// 조합 Combination 구하는 코드
////fun combination(result: MutableList<MutableList<Int>>, target : Int, temp : MutableList<Int>, cur : Int, start : Int, end : Int) {
////    // 만드려는 조합 리스트의 길이와 같으면 해당 값 추가 후 종료
////    if (cur == target) {
////        result.add(temp)
////        return
////    }
////    else {
////        // 재귀를 통해 시작 인덱스부터 종료 인덱스까지 순차적으로 실행시킴.
////        for (i in start until end) {
////            var temp = temp
////            temp.add(i)
////            combination(result, target, temp, cur+1, i+1, end)
////        }
////    }
////}
//



//// 네트워크
//class Solution {
//    fun solution(n: Int, computers: Array<IntArray>): Int {
//        var answer = 0
//        val visited = mutableListOf<Int>()
//        for (v in 0 until n) {
//            if (!visited.contains(v)) {
//                dfs(v, computers, visited)
//                answer++
//            }
//        }
//        return answer
//    }
//
//    fun dfs(v : Int, computers : Array<IntArray>, visited : MutableList<Int>) {
//        visited.add(v)
//        computers[v].forEachIndexed { next, connected ->
//            if (connected == 1 && !visited.contains(next))
//                dfs(next, computers, visited)
//        }
//    }
//}


//// 뒤에있는 큰 수 찾기
//// 9:08
//// --
//// 스택 쌓으면서 확인하는 문제
//fun solution(numbers: IntArray): IntArray {
//
//    val answer: IntArray = IntArray(numbers.size) { -1 }
//
//    val stack = Stack<Int>()
//
//    for (i in numbers.indices) {
//        if (stack.isEmpty() || numbers[i] <numbers[i-1]) stack.push(i)
//        else {
//            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
//                answer[stack.pop()] = numbers[i]
//            }
//            stack.push(i)
//        }
//    }
//
//    return answer
//}


//// 무인도 여행
//// dfs
//// 11:41
//// 12:17
//class Solution {
//    lateinit var mapArray : Array<CharArray>
//    var sum = 0
//    val dx = arrayOf(0, 1, 0, -1)
//    val dy = arrayOf(-1, 0, 1, 0)
//    var Y = 0
//    var X = 0
//
//    fun solution(maps: Array<String>): IntArray {
//        var answer= mutableListOf<Int>()
//        Y = maps.size
//        X = maps[0].length
//        mapArray = Array(Y) { CharArray(X) { ' ' } }
//
//        for (row in maps.indices){
//            for (col in maps[row].indices){
//                mapArray[row][col] = maps[row][col]
//            }
//        }
//
//        for (row in mapArray.indices){
//            for (col in mapArray[row].indices){
//                if (mapArray[row][col].isDigit()) {
//                    // 아직 안가본 양수
//                    sum += mapArray[row][col].digitToInt()
//                    dfs(row, col)
//                    answer.add(sum)
//                    sum = 0
//
//                }
//            }
//        }
//
//        if (answer.size == 0) answer.add(-1)
//
//        return answer.sorted().toIntArray()
//    }
//
//    fun dfs(row: Int, col:Int){
//        mapArray[row][col] = 'X'
//
//        for (k in 0..3){
//            val ny = row + dy[k]
//            val nx = col + dx[k]
//            if (is_valid_coord(ny, nx) && mapArray[ny][nx].isDigit() && mapArray[ny][nx].digitToInt() > 0){
//                sum += mapArray[ny][nx].digitToInt()
//                dfs(ny, nx)
//            }
//        }
//    }
//
//    fun is_valid_coord(y: Int, x: Int): Boolean{
//        return (y in 0 until Y && x in 0 until X)
//    }
//
//
//}


//// 숫자 변환하기
//// 3:08
//// 5:27
//// bfs
//class Solution {
//    fun solution(x: Int, y: Int, n: Int): Int {
//        var answer = -1
//        val queue: Queue<Array<Int>> = LinkedList()
//        val visited = BooleanArray(1000001)
//        queue.add(arrayOf(x, 0))
//        visited[x] = true
//
//        while (queue.size > 0){
//            val (x_, cnt) = queue.remove()
//
//            if (x_ == y) {
//                answer = cnt
//                break
//            }
//
//            for (i in 0..2){
//                val tmp = when (i){
//                    0 -> x_ * 3
//                    1 -> x_ * 2
//                    else -> x_ + n
//                }
//
//                if (tmp <= y && !visited[tmp]) {
//                    visited[tmp] = true
//                    queue.add(arrayOf(tmp, cnt+1))
//                }
//            }
//
//
//        }
//        return answer
//    }
//
//
//}


// 호텔 대실
// 8:38
class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        // 틀린 코드
//        var timeArray = Array(book_time.size) { Array(2) { 0 } }
//        for (row in book_time.indices){
//            for (col in 0..1){
//                var token = book_time[row][col].split(":")
//                var minute = token[0].toInt()*60 + token[1].toInt()
//                timeArray[row][col] = minute
//            }
//        }
//        timeArray.sortBy { it[0] }
//        for (i in timeArray.indices){
//            for (j in 0 until i){
//                if (i != j && timeArray[i][0] >= timeArray[j][1]+10) {
//                    timeArray[j][1] = Int.MAX_VALUE
//                }
//            }
//        }
//        return book_time.size-timeArray.count { it[1] == Int.MAX_VALUE }


//        var timeArray = Array(book_time.size) { Array(2) { 0 } }
//        for (row in book_time.indices){
//            for (col in 0..1){
//                var token = book_time[row][col].split(":")
//                var minute = token[0].toInt()*60 + token[1].toInt() + 10
//                timeArray[row][col] = minute
//            }
//        }
//        timeArray.sortBy { it[0] }
//        for ((start, end) in timeArray){
//            println("${start} ${end}")
//            timeArray.map { it[1] <= start }
//        }
//        return timeArray.

        var answer=0
        var timeArray: MutableList<Array<Int>> = mutableListOf()
        for ((start, end) in book_time){
            var token = start.split(":")
            var minute = token[0].toInt()*60 + token[1].toInt()
            timeArray.add(arrayOf(minute, 1))

            token = end.split(":")
            minute = token[0].toInt()*60 + token[1].toInt() + 10
            timeArray.add(arrayOf(minute, 0))
        }


        var tmp = 0
        for ((time, chk) in timeArray.sortedBy { it[0] }){
            println("$time $chk")
            tmp += when (chk) {
                0 -> -1
                else -> 1
            }
            answer = max(answer, tmp)
        }
        return answer


    }
}




