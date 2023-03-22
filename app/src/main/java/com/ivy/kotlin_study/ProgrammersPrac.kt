package com.ivy.kotlin_study


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


//// 호텔 대실
//// 8:38
//// --
//class Solution {
//    @RequiresApi(Build.VERSION_CODES.N)
//    fun solution(book_time: Array<Array<String>>): Int {
//        // 틀린 코드
////        var timeArray = Array(book_time.size) { Array(2) { 0 } }
////        for (row in book_time.indices){
////            for (col in 0..1){
////                var token = book_time[row][col].split(":")
////                var minute = token[0].toInt()*60 + token[1].toInt()
////                timeArray[row][col] = minute
////            }
////        }
////        timeArray.sortBy { it[0] }
////        for (i in timeArray.indices){
////            for (j in 0 until i){
////                if (i != j && timeArray[i][0] >= timeArray[j][1]+10) {
////                    timeArray[j][1] = Int.MAX_VALUE
////                }
////            }
////        }
////        return book_time.size-timeArray.count { it[1] == Int.MAX_VALUE }
//
//
////        var timeArray = Array(book_time.size) { Array(2) { 0 } }
////        for (row in book_time.indices){
////            for (col in 0..1){
////                var token = book_time[row][col].split(":")
////                var minute = token[0].toInt()*60 + token[1].toInt() + 10
////                timeArray[row][col] = minute
////            }
////        }
////        timeArray.sortBy { it[0] }
////        for ((start, end) in timeArray){
////            println("${start} ${end}")
////            timeArray.map { it[1] <= start }
////        }
////        return timeArray.
//
//        // 정답 코드
//        val time = mutableListOf<Pair<Int, Int>>()
//
//        book_time.forEach {
//            time.add(Pair(parseTime(it[0]), parseTime(it[1]) + 10))
//        }
//        val sortedTime = time.sortedBy { it.first }
//
//        val use = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
//        var answer = 0
//
//        for(i in book_time.indices) {
//            while(use.isNotEmpty() && use.peek().second <= sortedTime[i].first) use.poll()
//
//            use.add(sortedTime[i])
//            answer = maxOf(answer, use.size)
//        }
//
//        return answer
//
//
//    }
//
//    fun parseTime(time: String): Int {
//        val hm = time.split(":").map { it.toInt() }
//        return hm[0] * 60 + hm[1]
//    }
//}


// 폰켓몬
// 2:16
//class Solution {
//    fun solution(nums: IntArray): Int {
//        val hashSet = nums.toHashSet()
//        val half = nums.size/2
//        return if (hashSet.size > half) half else hashSet.size
//    }
//}


// 완주하지 못한 선수
// 2:32
// 3:12
//@RequiresApi(Build.VERSION_CODES.N)
//fun main(){
//    var participant = arrayOf("mislav", "stanko", "mislav", "ana")
//    var completion = arrayOf("stanko", "ana", "mislav")
//    println(solution(participant, completion))
//}
//
//@RequiresApi(Build.VERSION_CODES.N)
//fun solution(participant: Array<String>, completion: Array<String>): String {
//    var answer = ""
//    val hashMap = hashMapOf<String, Int>()
//
//    for (name in participant){
//        hashMap[name] = hashMap.getOrDefault(name, 0) + 1
//    }
//
//    for (name in completion){
//        hashMap[name] = hashMap.getOrDefault(name, 0) -1
//    }
//
//    for ((name, count) in hashMap){
//        if (count != 0) {
//            answer = name
//            break
//        }
//    }
//
//    return answer
//}


// 위장
// 3:13
// fold로 곱하여 누적합 구하기
//class Solution {
//    fun solution(clothes: Array<Array<String>>): Int {
//        var answer = clothes.groupBy { it[1] }.values.fold(1) {acc, i -> acc * (i.size + 1)} - 1
//        return answer
//    }
//}



// 베스트 앨범
// 4:01
// 5:23
//class Solution {
//    @RequiresApi(Build.VERSION_CODES.N)
//    fun solution(genres: Array<String>, plays: IntArray): IntArray {
//        var answer = mutableListOf<Int>()
//        var musicList = mutableListOf<Music>()
//        for ((idx, value ) in genres.withIndex()){
//           musicList.add(Music(idx, value, plays[idx]))
//        }
//
//        var map = musicList.groupBy { it.genre }.toList().sortedByDescending { it.second.sumOf { it.play } }.toMap()
//
//        for ((genre, list) in map){
//            var tmp = list.sortedByDescending { it.play }
//            answer.add(tmp?.get(0)!!.idx)
//            if (tmp.size > 1) answer.add(tmp[1].idx)
//        }
//
//        return answer.toIntArray()
//    }
//}
//
//data class Music(
//    val idx: Int,
//    val genre: String,
//    val play: Int
//)



// k 번째 수
// 5:33
// 5:38
//class Solution {
//    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
//        var answer = mutableListOf<Int>()
//        for (cmd in commands){
//            answer.add(array.slice(cmd[0]..cmd[1]).sorted()[cmd[2]-1])
//        }
//        return answer.toIntArray()
//    }
//}


// 가장 큰 수
// 5:38
// --
// 두개를 붙여서 서로 비교하는 방법을 써야했음.
//class Solution {
//    fun solution(numbers: IntArray): String {
//        var answer = ""
//        numbers.sortedWith(Comparator { o1, o2 -> "$o2$o1".compareTo("$o1$o2") }).forEach { answer += it }
//        return if(answer.startsWith("0")) "0" else answer
//    }
//}



// H-Index
// 7:44
// 8:40
//class Solution {
//    fun solution(citations: IntArray): Int {
//
//        citations.sort()
//        var answer = citations.size
//        for (i in 1..citations.size){
//            if (citations.count { it >= i } >= i){
//                answer = i
//            }
//        }
//
//        return answer
//    }
//}


// 최소 직사각형
// 12:22
// --
//class Solution{
//    fun solution(sizes: Array<IntArray>): Int {
//
//        // 한쪽에 큰거 넣기
//        sizes.map { if (it[0] < it[1]) {
//            var tmp = it[0]
//            it[0] = it[1]
//            it[1] = tmp
//        } }
//
//        return sizes.map { it[0] }.maxOf { it } * sizes.map { it[1] }.maxOf { it }
//    }
//}



// 입국심사
// 1:20
// 이분탐색
//class Solution{
//    fun solution(n: Int, times: IntArray): Long {
//        var r: Long = (1_000_000_000 * n.toLong())
//        var l: Long = 0
//
//        while (l <= r){
//            val mid = (r + l) / 2
//
//            var count: Long = 0
//            for (time in times) {
//                count += mid / time
//            }
//
//            if ( count >= n){
//                r = mid
//            }else if (count < n){
//                l = mid + 1
//            }
//
//        }
//
//        return l
//    }
//
//}


// 위장 - 다시
// 8:16
// 8:22
//class Solution {
//    fun solution(clothes: Array<Array<String>>): Int {
//        var answer = clothes.groupBy { it[1] }.map { it.key to it.value.count()+1 }.fold(1) { acc, pair -> acc * pair.second } - 1
//        return answer
//        // 위에서 map 쓰지 않고 푼 풀이가 0.5ms 정도 더 빠르다.
//    }
//}


// 베스트 앨범 - 다시
// 8:25
// 9:45
//class Solution {
//    fun solution(genres: Array<String>, plays: IntArray): IntArray {
//        var answer = mutableListOf<Int>()
//        var tmp = genres.mapIndexed { index, genre -> genre to Pair(index, plays[index]) }
//            .groupBy ({it.first}, {it.second})
//            .toList()
//            .sortedByDescending { it.second.fold(0) { acc, i -> acc + i.second } }
//            .map { it.second.sortedByDescending { it.second } }
//            .forEach {
//                answer.add(it[0].first)
//                if (it.size > 1) answer.add(it[1].first)
//            }
//
//        println(tmp.toString())
//        return answer.toIntArray()
//
//        // 또는
//        // .indicies 를 groupBy 하면, 'groupBy기준 = [인덱스들]' 형태의 map을 얻을 수 있다.
//        // .take(n) 을 통해 앞에서부터 n개의 요소만 가져올 수 있다.
//        // .flatten()을 통해 2차원 배열을 1차원 배열로 만들 수 있다.
//        return genres.indices.groupBy { genres[it] }
//            .toList()
//            .sortedByDescending { it.second.sumOf { plays[it] } }
//            .map { it.second.sortedByDescending { plays[it] }.take(2) }
//            .flatten()
//            .toIntArray()
//
//
//    }
//}


// 모의고사
// 9:53
// 10:24
//class Solution {
//    fun solution(answers: IntArray): IntArray {
//        var answer = mutableListOf<Int>()
//        var countList = intArrayOf(0, 0, 0)
//
//        // 첫번째 사람
//        var firstArray = intArrayOf(1, 2, 3, 4, 5)
//        countList[0] = getCorrect(firstArray, answers)
//
//        // 두번째 사람
//        var secondArray = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
//        countList[1] = getCorrect(secondArray, answers)
//
//        // 세번째 사람
//        var thirdArray = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
//        countList[2] = getCorrect(thirdArray, answers)
//
//        val max = countList.maxOf { it }
//        return countList.mapIndexed { index, i -> if (i == max) index+1 else 0 }.filter { it != 0 }.toIntArray()
//    }
//
//    fun getCorrect(array: IntArray, answers: IntArray): Int {
//        var count = 0
//        var a = 0
//        var i = 0
//
//        while (a < answers.size){
//            if (array[i] == answers[a]) count++
//            i = if (i == array.lastIndex) 0 else i+1
//            a++
//        }
//
//        return count
//    }
//}


// 소수 찾기
// 10:31
// --
// 틀린 코드
//class Solution {
//    fun solution(numbers: String): Int {
//        var answer = 0
//        var result = mutableListOf<Int>()
//        var intNumbers = numbers.map { it.digitToInt() }
//
//        for (set in permutation(intNumbers)){
//            result.add(set.joinToString("").toInt())
//        }
//
//        println(result.distinct())
//
//        return result.distinct().count { isPrime(it) }
//    }
//
//    // el: 원본 데이터로서 변하지 않음  -> elements를 줄여서 el
//    // fin: 원소를 담는 리스트로서 기본값은 listOf()로 빈 리스트  ->  finish를 줄여서 fin
//    // sub: fin이 담는 리스트라면 sub는 빼는 리스트 기본값은 el  -> subtraction 줄여 sub
//    // sub의 있는 원소를 빼서 fin의 넣는 과정을 반복하여 sub가 비었을 때 fin을 반환합니다.
//    // 순열 구하는 코드.. (1, 2, 3) -> 1, 2, 3
//    fun permutation(el: List<Int>, fin: List<Int> = listOf(), sub: List<Int> = el ): List<List<Int>> {
//        return if(sub.isEmpty()) listOf(fin)
//        else sub.flatMap { permutation(el, fin + it, sub - it) }
//    }
//
//    // 소수인지 구하는 코드
//    fun isPrime(num:Int):Boolean{
//        if(num <= 1) return false
//        return (2..sqrt(num.toDouble()).toInt()).none{ num % it == 0 }
//    }
//
//}

//// 정답코드
//class Solution {
//
//    lateinit var set: MutableSet<Int>
//
//    fun solution(numbers: String): Int {
//        set = mutableSetOf()
//        getCombination(numbers, "")
//        return set.filter { isPrime(it) }.count()
//    }
//
//    // 조합구하기
//    fun getCombination(numbers: String, result: String) {
//        if (result.isNotEmpty()) set.add(result.toInt())
//        if (numbers.isEmpty()) return
//        numbers.forEachIndexed { index, c ->
//            getCombination(numbers.removeRange(index..index), c.plus(result))
//        }
//    }
//
//    fun isPrime(number: Int): Boolean {
//        if (number == 1 || number == 0) {
//            return false
//        }
//        for (i in (2..(number / 2))) {
//            if (number % i == 0) {
//                return false
//            }
//        }
//        return true
//    }
//
//}


// 최빈값 구하기
//class Solution {
//    fun solution(array: IntArray): Int {
//        val list = array.groupBy{ it }.map { it.key to it.value.count() }.sortedByDescending { it.second }
//        val maxCount = list.toMap().values.maxOf{it}
//        val filtered = list.filter { it.second == maxCount }
//
//        return if (filtered.count() > 1) -1 else filtered[0].first
//
//        // 중요!!
//        // list.groupingBy{ it }.eachCount() 그룹별로 묶고 갯수 세어서 map으로 만들어줌!
//        println(array.toList().groupingBy { it }.eachCount())
//
//    }
//}


// 치킨 쿠폰
// 2:52
// 4:33
//class Solution {
//    fun solution(chicken: Int): Int {
//        var answer: Int = 0
//        var chickens = chicken
//        var coupons = chicken
//
//        while (chickens > 0){
//
//            chickens = coupons/10
//            coupons = coupons/10 + coupons % 10
//            answer += chickens
//        }
//
//        return answer
//    }
//}



// 명에의 전당(1)
// 4:51
// 5:08
// 우선순위 큐 = 최소힙 사용
//class Solution {
//    fun solution(k: Int, score: IntArray): IntArray {
//        var answer = arrayListOf<Int>()
//        var priorityQueue = PriorityQueue<Int>()
//
//        for (i in score){
//            if (priorityQueue.size < k){
//                priorityQueue.add(i)
//            }else{
//                if (priorityQueue.peek() <= i){
//                    priorityQueue.poll()
//                    priorityQueue.add(i)
//                }
//            }
//
//            answer.add(priorityQueue.peek())
//        }
//
//        println(priorityQueue)
//
//
//
//        return answer.toIntArray()
//    }
//}



// 기사단원의 무기
// 5:10
// 5:36
//import kotlin.math.sqrt
//class Solution {
//    fun solution(number: Int, limit: Int, power: Int): Int {
//        var answer: Int = 0
//
//        for (knight in (1..number)){
//            var op = getOP(knight, limit)
//            if (op > limit) answer += power
//            else answer += op
//        }
//
//        return answer
//    }
//
//    // sqrt()으로 빠르게 약수 구하기
//    fun getOP(number: Int, limit: Int): Int{
//        var count = 0
//
//        for (i in 1 .. sqrt(number.toDouble()).toInt()) {
//            // ex) number = 10
//            if (number % i == 0) { // 약수 중 작은 수 저장  ex) 2
//                count++
//                if (number / i != i) {  // 약수 중 큰 수 저장 ex) 5
//                    count++
//                }
//                if (count > limit) return count
//            }
//        }
//        return count
//    }
//}


// 나누어 떨어지는 숫자 배열
//class Solution {
//    fun solution(arr: IntArray, divisor: Int): IntArray {
//        var answer = arr.filter { it % divisor == 0 }.sorted().toIntArray()
//        return if (answer.isEmpty()) intArrayOf(-1) else answer
//    }
//}


// 시소 짝꿍
//class Solution {
//    fun solution(weights: IntArray): Long {
//        // 시간초과 풀이
////        var answer: Long = 0
////        var meterPair = arrayListOf(arrayOf(2, 3), arrayOf(3, 2), arrayOf(2, 4),
////            arrayOf(4, 2), arrayOf(3, 4), arrayOf(4, 3))
////
////        // 모든 사람 조합에 대해서
////        for (i in 0 until weights.size -1 ){
////            for (j in i+1 until weights.size){
////                // 무게가 서로 같으면 하나만 더하고 넘어가기
////                if (weights[i] == weights[j]) answer++
////                else {
////                    for (meters in meterPair){
////                        if (weights[i]*meters[0] == weights[j]*meters[1]) {
////                            answer++
////                            break
////                        }
////                    }
////                }
////            }
////        }
////
////
////        return answer
//
//
//        // 정답 풀이
//        var answer: Long = 0
//
//        // + 정렬
//        weights.sort()
//        var cnt = 0
//        for (i in 0 until weights.size -1 ){
//            // + 이전거랑 비교해서 같으면 값 하나 빼고 continue
//            if (i != 0 && weights[i] == weights[i-1]) {
//                cnt--
//                answer += cnt
//                continue
//            }
//
//            cnt = 0
//            for (j in i+1 until weights.size){
//                // + 모든 경우의 수를 || 연산자로 처리해서 for문 줄이기
//                if (weights[i] == weights[j]
//                    || weights[i]*2 == weights[j]*3
//                    || weights[i]*3 == weights[j]*2
//                    || weights[i]*2 == weights[j]*4
//                    || weights[i]*4 == weights[j]*2
//                    || weights[i]*3 == weights[j]*4
//                    || weights[i]*4 == weights[j]*3) {
//                    cnt++
//                }
//            }
//            answer += cnt
//        }
//
//
//        return answer
//
//    }
//}



// 문자열 내림차순으로 배치하기
// 8:23
// 8:27
//class Solution {
//    fun solution(s: String): String {
//        return s.toList().sortedByDescending { it }.joinToString("")
//
//        // Comparator 쓰는 방법
//        return s.toCharArray()
//            .sortedWith(Comparator { a, b -> b - a })
//            .joinToString("")
//    }
//}



// 이모티콘 할인행사
// 중간에 힌트 얻음
// 10:37
// 11:41
//class Solution {
//    var sale = arrayOf(10, 20, 30, 40)
//    var result = mutableListOf<Array<Int>>()
//
//    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
//
//        fun DFS(str: String, size: Int){
//
//            if (str.split(" ").size == size + 1){
//                var res = str.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
//                var emo = emoticons.mapIndexed { index, i -> arrayOf(res[index], (i * ((100-res[index])*0.01)).toInt()) }
//                // 가입자 수
//                var count = 0
//                // 수익
//                var income = 0
//                users.forEach { pair ->
//                    var tmp = 0
//                    emo.forEach { epair ->
//                        // 이모티콘 할인율이 더 크면 산다.
//                        if (epair[0] >= pair[0]){
//                            tmp += epair[1]
//                        }
//                    }
//
//                    if (pair[1] <= tmp) {
//                        count++
//                    }else{
//                        income += tmp
//                    }
//
//                }
//                result.add(arrayOf(count, income))
//                return
//            }
//
//            for (i in sale.indices){
//                DFS(str + sale[i] + " ", size)
//            }
//        }
//
//        DFS("", emoticons.size)
//
//        var answer = result.sortedWith(compareBy({it[0]}, {it[1]}))
//        println(answer[answer.lastIndex])
//
//        return answer[answer.lastIndex].toIntArray()
//    }
//
//
//}


// 나머지가 1이 되는 수 찾기
// 11:30
// 12:04
//fun solution(n: Int): Int {
////    var answer = n
////    var l = 2
////    var r = n
////    var mid = ((l + r) / 2).toInt()
////    while (l < r) {
////        if (n % mid == 1) {
////            answer = min(mid, answer)
////        }
////
////        if (n % mid > 1) {
////            l = mid + 1
////        } else if (n % mid <= 1) {
////            r = mid - 1
////        }
////        mid = ((l + r) / 2).toInt()
////    }
////    return answer
//
//    // 그냥 이걸 원하는 문제였음...
//    var x = 2
//    while (n % x != 1){
//        x++
//    }
//
//    return x
//}



// 과일 장수
// 12:08
// --
// 정렬문제
//class Solution {
//    fun solution(k: Int, m: Int, score: IntArray): Int {
//        var answer: Int = 0
//        val score = score.sorted().reversed()
//        var index : Int = 0
//        while (true){
//            if(index >= score.size || index+m > score.size){
//                break
//            }
//            answer += score[index+ m -1] * m
//            index += m
//        }
//        return answer
//    }
//}


// 자연수 뒤집어 배열로 만들기
// 7:48
// 7:53
//class Solution {
//    fun solution(n: Long): IntArray {
//        return n.toString().reversed().map { it.digitToInt() }.toIntArray()
//    }
//}


// 문자열 내맘대로 정렬하기
// 5:39
// 5:48
//class Solution {
//    fun solution(strings: Array<String>, n: Int): Array<String> {
//        return strings.sortedWith(compareBy({it[n]}, {it})).toTypedArray()
//    }
//}


// 마법의 엘리베이터
// 문제 잘못 이해..
//class Solution {
//
////    fun solution(storey: Int): Int {
////        var answer: Int = 0
////        val buttons = arrayListOf(-1, 1, -10, 10, -100, 100)
////
////        var queue: Queue<Array<Int>> = LinkedList()
////        // 현재 층, 돌 갯수
////        queue.add(arrayOf(storey, 0))
////
////        while (!queue.isEmpty()){
////            val cur = queue.poll()
////
////            if (cur[0] == 0){
////                answer = cur[1]
////                break
////            }
////
////            for (button in buttons){
////                if (cur[0] + button >= 0){
////                    queue.add(arrayOf(cur[0] + button, cur[1] + 1))
////                }
////            }
////        }
////
////
////        return answer
////    }
//
//
//    // 제한 조건을 보고 bfs/dfs로 시간초과가 날거같다면 -> dp 또는 greedy로 풀수 있는지 생각해본다.
//    // 자릿수를 보고 판별하는 greedy
//    fun solution(storey: Int): Int {
//        var tempStorey = storey
//        var cnt = 0
//        while(tempStorey > 0){
//            val ext = tempStorey % 10
//            tempStorey /= 10
//
//            // 현재 자릿수의 값이 5라면 -> 다음 자릿수에 따라 더할지 뺄지 결정한다.
//            if(ext==5){
//                // 다음 자릿수가 5보다 크다면 -> 더해서 10을 만든다.
//                if(tempStorey%10 >=5) {
//                    tempStorey++
//                    cnt += 10 - ext
//                }
//                // 다음 자릿수가 5보다 작다면 -> 빼서 0을 만든다.
//                else {
//                    cnt += ext
//                }
//            }
//            // 5보다 크다면 -> 더해서 10을 만든다.
//            else if(ext > 5) {
//                tempStorey++
//                cnt += 10 - ext
//            }
//            // 5보다 작다면 -> 빼서 0을 만든다.
//            else {
//                cnt += ext
//            }
//        }
//
//        return cnt
//    }
//
//}


// OX퀴즈 lv0
//class Solution {
//    fun solution(quiz: Array<String>): Array<String> {
//        var answer: Array<String> = Array(quiz.size){""}
//        for((i, q) in quiz.withIndex()){
//            val tmp = q.split(" ")
//            if (tmp[1] == "+"){
//                answer[i] =
//                    if (tmp[0].toInt() + tmp[2].toInt() == tmp[4].toInt()) "O"
//                    else "X"
//
//            }else if (tmp[1] == "-"){
//                answer[i] =
//                    if (tmp[0].toInt() - tmp[2].toInt() == tmp[4].toInt()) "O"
//                    else "X"
//            }
//
//        }
//        return answer
//    }
//}


// 덧칠하기 lv1
// 5:00
// 5:23
//class Solution {
//    fun solution(n: Int, m: Int, section: IntArray): Int {
//        var answer: Int = 1
//        var tmp = section[0] + m
//        for (i in section){
//            if (i >= tmp) {
//                tmp = i + m
//                answer++
//            }
//        }
//        return answer
//    }
//}


// 혼자서 하는 틱택토 lv2
// 5:24
// 7:00
// 중간에 30분은 딴짓한듯..ㅎ
class Solution {
    fun solution(board: Array<String>): Int {
        var answer: Int = 0
        var bingoCount = 0
        var Xcount = 0
        var Ocount = 0
        var winner = arrayListOf<Char>()

        // 가로
        if (board[0][0] != '.' && board[0][0] == board[0][1] && board[0][0] == board[0][2]){
            bingoCount++
            winner.add(board[0][0])
        }
        if (board[1][0] != '.' && board[1][0] == board[1][1] && board[1][0] == board[1][2]) {
            bingoCount++
            winner.add(board[1][0])
        }
        if (board[2][0] != '.' && board[2][0] == board[2][1] && board[2][0] == board[2][2]){
            bingoCount++
            winner.add(board[2][0])
        }
        // 세로
        if(board[0][0] != '.' && board[0][0] == board[1][0] && board[0][0] == board[2][0]){
            bingoCount++
            winner.add(board[0][0])
        }
        if(board[0][1] != '.' && board[0][1] == board[1][1] && board[0][1] == board[2][1]){
            bingoCount++
            winner.add(board[0][1])
        }
        if(board[0][2] != '.' && board[0][2] == board[1][2] && board[0][2] == board[2][2]){
            bingoCount++
            winner.add(board[0][2])
        }
        // 대각선
        if(board[0][0] != '.' && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            bingoCount++
            winner.add(board[0][0])
        }
        if(board[2][0] != '.' && board[2][0] == board[1][1] && board[2][0] == board[0][2]){
            bingoCount++
            winner.add(board[2][0])
        }




        for (i in board){
            var map = i.toCharArray().toList().groupingBy{ it }.eachCount()
            Ocount += map.getOrDefault('O', 0)
            Xcount += map.getOrDefault('X', 0)

        }

        if (bingoCount == 1){

            if (winner[0] == 'X' && Ocount == Xcount ) answer = 1  // X가 이긴 경우
            else if (winner[0] == 'O' && Ocount == Xcount + 1) answer = 1  // O가 이긴 경우

        }else if (bingoCount == 0){
            // 경기 중
            // X가 마지막으로 둠 || O가 마지막으로 둠
            if (Ocount == Xcount || Ocount == Xcount + 1) answer = 1
        }else if (bingoCount == 2){
            // O가 마지막에 빙고를 두개 만드는 경우가 있음
            // O와 X가 동시에 빙고인 경우는 빼야함
            if (winner[0] == winner[1] && Ocount == Xcount + 1) answer = 1
        }


        return answer
    }
}












