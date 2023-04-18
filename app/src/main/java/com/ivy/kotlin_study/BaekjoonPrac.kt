package com.ivy.kotlin_study

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt


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


// 3085 - 사탕 게임
// 11:43
// --
// 시간초과 -> 재귀를 단순 반복으로 변경하여 해결
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val adj = mutableListOf<MutableList<Char>>()
//    repeat(N){
//        val row = sc.next().toMutableList()
//        adj.add(row)
//    }
//    var answer = 0
//
//    fun search(){
//        // 가로 일렬 탐색
//        var count = 0
//        for(i in 0 until N){
//            count = 1
//            for (j in 0 until N-1){
//                if (adj[i][j] == adj[i][j+1]){
//                    count++
//                    answer = max(answer, count)
//                }
//                else {
//                    count = 1
//                }
//            }
//        }
//
//        // 세로 일렬 탐색 for문 i, j 바꾸기!!
//        for(j in 0 until N){
//            count = 1
//            for (i in 0 until N-1){
//                if (adj[i][j] == adj[i+1][j]) {
//                    count++
//                    answer = max(answer, count)
//                }
//                else {
//                    count = 1
//                }
//            }
//        }
//
//    }
//
//
//    for (i in 0 until N){
//        for (j in 0 until N){
//            // 양옆 스왑
//            if (j+1 < N){
//                val a = adj[i][j]
//                val b = adj[i][j+1]
//                // 서로 스왑하고
//                adj[i][j] = b
//                adj[i][j+1] = a
//                // 가장 긴 연결 요소 구하기
//                search()
//                // 스왑한거 되돌려놓기
//                adj[i][j] = a
//                adj[i][j+1] = b
//            }
//
//            // 위아래 스왑
//            if (i+1 < N){
//                val a = adj[i][j]
//                val b = adj[i+1][j]
//                // 서로 스왑하고
//                adj[i][j] = b
//                adj[i+1][j] = a
//                // 가장 긴 연결 요소 구하기
//                search()
//                // 스왑한거 되돌려놓기
//                adj[i][j] = a
//                adj[i+1][j] = b
//            }
//        }
//
//    }
//
//    println(answer)
//
//}


// 1463 - 1로 만들기
// 2:06
// 3:14 - 답 참고
// DP 풀이
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val adj = Array(N+1){0}
//    adj[1] = 0
//
//    var num = 2
//    var X = 2
//    while (X <= N){
//        if (num % 6 == 0){
//            num /= if(adj[num/3] <= adj[num/2]) 3 else 2
//        }
//        else if (num % 3 == 0){
//            if(adj[num/3] <= adj[num-1]) num /= 3 else num -= 1
//        }
//        else if (num % 2 == 0){
//            if(adj[num/2] <= adj[num-1]) num /= 2 else num -= 1
//        }
//        else num -= 1
//
//        if (num == 1) adj[X] = 1
//        else adj[X] = adj[num] + 1
//
//        // 다음으로 넘어가기
//        X++
//        num = X
//
//    }
//
////    println(adj.contentToString())
//    println(adj[N])
//}

// BFS 풀이
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val queue = LinkedList<Pair<Int, Int>>()
//    // (현재 값, 몇번 건너왔는지)
//    queue.add(Pair(N, 0))
//    val check = IntArray(N+1){ 0 }
//    check[N] = 1
//
//    while (queue.isNotEmpty()){
//        val (x,  d) = queue.poll()
//
//        if (x == 1){
//            println(d)
//            return
//        }
//
//        if (x % 3 == 0 && check[x/3] == 0){
//            queue.add(Pair(x/3, d+1))
//            check[x/3] = 1
//        }
//
//        if (x % 2 == 0 && check[x/2] == 0){
//            queue.add(Pair(x/2, d+1))
//            check[x/2] = 1
//        }
//
//        if (check[x-1] == 0){
//            queue.add(Pair(x-1, d+1))
//            check[x-1] = 1
//        }
//    }
//
//}


// 11726 - 2xn 타일링
// 3:41
// 4:05
// DP 재귀 풀이
//fun main(){
//    val sc = Scanner(System.`in`)
//    val n = sc.nextInt()
//
//    if (n == 1) {
//        println(1)
//        return
//    }
//    else if (n == 2) {
//        println(2)
//        return
//    }
//
//    val cache = IntArray(n+1){0}
//    cache[1] = 1
//    cache[2] = 2
//
//    fun dp(x: Int): Int{
//        if (cache[x] != 0) return cache[x]
//
//        cache[x] = (dp(x-2) + dp(x-1)) % 10007
//        return cache[x]
//    }
//
//    println(dp(n))
////    println(cache.contentToString())
//}

// DP 반복문 풀이
//fun main(){
//    val sc = Scanner(System.`in`)
//    val n = sc.nextInt()
//
//    val cache = IntArray(n+1){0}
//    cache[1] = 1
//    cache[2] = 2
//
//    for (x in 3..n){
//        cache[x] = (cache[x-2] + cache[x-1]) % 10007
//    }
//
//    println(cache[n])
////    println(cache.contentToString())
//}


// 3687 - 성냥개비
// 8:00
// --
// 정답 코드
//fun main() {
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n: Int = br.readLine().toInt()
//    for (i in 0 until n) {
//        val matchesCount: Int = br.readLine().toInt()
//        val minDp = LongArray(101)
//
//
//        //성냥 한개를 표현하는데 사용하는 개수는 2~7개 사이
//        //2개 : 1, 3개 : 7, 4개 : 4, 5개 : 2,3,5, 6개 : 6,9,0, 7개 : 8
//
//        /*
//		* mindp[i]는 i개의 성냥개비를 사용하여 만들 수 있는
//		* 가장 작은 수를 저장하는 배열, 인덱스 2~8까지는 초기화 필요!
//		*
//		* 이때 mindp[6]으로 만들 수 있는 숫자는 0,6 두 가지가 있지만
//		* 0은 첫번째 자리에 올 수 없으므로 mindp[6]은 6으로 초기화 한다.
//		* 다른 숫자 뒤에 올 때는 6보다 작은 0을 사용한다.
//		*/
//        Arrays.fill(minDp, Long.MAX_VALUE)
//        minDp[2] = 1
//        minDp[3] = 7
//        minDp[4] = 4
//        minDp[5] = 2
//        minDp[6] = 6
//        minDp[7] = 8
//        minDp[8] = 10
//        val add = arrayOf("1", "7", "4", "2", "0", "8")
//        /*
//         * 성냥개비 9개로 만들 수 있는 가장 작은수를 구하기 위한 경우의 수에는
//         * 2+7, 3+6, 4+5, 5+4, 6+3, 7+2가 있다.
//         * 이때 1+8을 고려하지 않는 이유는 성냥개비 1개로 만들 수 있는 수는 없기 때문이다.
//         * 이처럼 만들 수 없는 수인 1,0은 고려하지 않아야 한다.
//         * 따라서 위에 적은 경우의 수를 모두 비교하여 가장 작은 수를 찾으면 된다.
//         * 이때 주의해야할 점은 비교대상은 성냥개비로 만들어진 숫자이다.
//         *
//         * 점화식은 mindp[n]=(mindp[n-2]+addmin[2], mindp[n-3]+addmin[3], ..., mindp[n-7]+addmin[7])
//         */
//        for (j in 9..100) {
//            for (k in 2..7) {
//                val line = "" + minDp[j - k] + add[k - 2]
//                minDp[j] = Math.min(line.toLong(), minDp[j])
//            }
//        }
//
//        /*
//        * 큰 수는 1과 7만을 사용해서 만들 수 있다.
//        * 성냥개비 8개를 사용해서 만들 수 있는 가장 큰 수는 1111
//        * 성냥개비 9개를 사용해서 만들 수 있는 가장 큰 수는 711
//        * 성냥개비 10개를 사용해서 만들 수 있는 가장 큰 수는 1111
//        * 성냥개비 11개를 사용해서 만들 수 있는 가장 큰 수는 71111
//        *
//        * 즉, 큰 숫자를 만든다고 큰 수가 되는 것이 아닌 만드는데 성냥개비가 가장 적게드는 1을 사용하여
//        * 가장 긴 자릿수를 만드는 것이 큰 수를 만드는 방법이다.
//        * 이때 성냥개비의 갯수가 짝수일 경우는 만들어지는 1의 개수가 딱 떨어지지만
//        * 홀수인 경우에는 성냥개비 1개로 만들 수 있는 수가 없기 때문에 3개로 만들 수 있는 7을 사용해야 한다.
//        *
//        * 따라서 큰 수는 1과 7만을 사용해서 만들 수 있다.
//        */
//        val max = StringBuilder()
//        val a = (matchesCount / 2).toLong()
//        val b = (matchesCount % 2).toLong()
//        if (b == 1L) {
//            max.append("7")
//        } else {
//            max.append("1")
//        }
//        for (j in 1 until a) {
//            max.append("1")
//        }
//        println(minDp[matchesCount].toString() + " " + max.toString())
//    }
//}



// 2343 - 기타 레슨
// 4:43
// 5:19
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val M = sc.nextInt()
//    val blueray = Array(N){ 0 }
//    for (i in 0 until N){
//        blueray[i] = sc.nextInt()
//    }
//
//    fun isPossible(x: Int): Boolean{
//        // x길이의 3 덩어리로 나눠서 넣을 수 있는지 검사
//        var count = 1
//        var acc = 0
//        for (i in blueray.indices){
//            if(acc + blueray[i] > x){
//                count++
//                acc = blueray[i]
//            }else{
//                acc += blueray[i]
//            }
//        }
//
//        return count <= M
//    }
//
//
//    var l = blueray.max()
//    var r = blueray.sum()
//    while (l <= r){
//        val mid: Int = (l+r)/2
//
//        if (isPossible(mid)){
//            r = mid - 1
//        }else{
//            l = mid + 1
//        }
//    }
//
//    println(l)
//
//
//    // 이렇게 해도 답이 같다.
////    while (l < r){
////        val mid: Int = (l+r)/2
////
////        if (isPossible(mid)){
////            r = mid
////        }else{
////            l = mid + 1
////        }
////    }
////
////    println(l)
//
//}



// <이분탐색>
// - lowerBound 찾기
// 1)
// while(l < r)
// r = mid
// l = mid + 1
// println(l)

// 2)
// while(l <= r)
// r = mid - 1
// l = mid + 1
// println(l)

// - upperBound 찾기
// 1)
// while(l < r)
// r = mid - 1
// l = mid
// println(r)

// 2)
// while(l <= r)
// r = mid - 1
// l = mid + 1
// println(r)



// 1699 - 제곱수의 합
// 5:38
// 6:29
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val dp = Array(N+3){Int.MAX_VALUE}
//    dp[1] = 1
//    dp[2] = 2
//    dp[3] = 3
//
//    for (n in 4..N){
//        // 제곱수인지 판별하기
//        if (sqrt(n.toDouble()) % 1.0 == 0.0){
//            dp[n] = 1
//            continue
//        }
//        // 최소값을 찾아 갱신하기
//        for (i in 1..n){
//            if (n < i*i) break
//            dp[n] = min(dp[n], 1 + dp[n-i*i])
//        }
//    }
//
//    //println(dp.contentToString())
//    println(dp[N])
//}


// 11055 - 가장 큰 증가 부분 수열
// 7:28
// --
// 시간초과
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val A = Array(N){ 0 }
//    for (i in 0 until N){
//        A[i] = sc.nextInt()
//    }
//
//    val check = Array(N){ 0 }
//    var max = 0
//
//    fun DFS(i: Int, sum: Int){
//
//        max = max(sum, max)
//
//        for (j in i until N){
//            if (check[j] == 0 && A[j] > A[i]){
//                check[i]
//                DFS(j, sum+A[j])
//                check[i] = 0
//            }
//        }
//    }
//
//    for (i in 0 until N){
//        DFS(i, A[i])
//    }
//
//    println(max)
//
//
//}

// DP 풀이
//fun main(){
//    val sc = Scanner(System.`in`)
//    val N = sc.nextInt()
//    val A = Array(N){ 0 }
//    for (i in 0 until N){
//        A[i] = sc.nextInt()
//    }
//    val dp = Array(N){ 0 }
//    dp[0] = A[0]
//
//    for (i in 1 until N){
//        // 앞에걸 모두 보는데
//        for (j in 0 until i){
//            // 나보다 작은 것만 보고 가장 큰 걸 구한다.
//            if (A[j] < A[i]){
//                dp[i] = max(dp[i], dp[j])
//            }
//        }
//        //구한 수에다가 나를 더해서 나의 값을 갱신한다.
//        dp[i] += A[i]
//    }
//
//    println(dp.max())
//
//}



// 1018 - 체스판 다시 칠하기
fun main(){
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val M = sc.nextInt()

}




















