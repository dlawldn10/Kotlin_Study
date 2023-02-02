package com.ivy.kotlin_study.lec05

// Lec05 코틀린에서 조건문을 다루는 방법
// 1. if문
// 2. Expression과 Statement
// 3. switch와 when


// 1. if문 : 자바와 동일.
fun validateScoreIsNotNegative(score: Int){
    if(score < 0){
        throw IllegalArgumentException("score는 0보다 작을 수 없습니다.")
    }
}

fun validateScore(score: Int){
    // TIP: 어떠한 값이 특정 범위에 포함되어 있는지 아닌지 확인할 때
    // 코틀린에서는 자바와 같이 하는 것보다는 !in 또는 in을 쓰면 좋다.
    if (score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

// 2. Expression과 Statement
// 여기서는 둘의 차이점이 있다.
// 자바에서 if-else는 Statement이지만, Kotlin에서는 Expression이다.
// Statement: 프로그램의 문장 전체. 하나의 값으로 도출되지 않는다.
// Expression: 하나의 값으로 도출되는 문장.
// Statement가 더 큰 개념. Statement가 Expression을 포함하고 있다.
fun getPassOrFail(score: Int): String {
//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }

    // 하지만 코틀린은 위의 코드도 가능하지만
    // if문을 Expression으로 취급하므로 아래와 같은 코드도 가능함.
    // 따라서 삼항 연산자도 필요 없으므로 코틀린에는 삼항 연산자가 없다.
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}


fun getGrade(score: Int): String {

    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

// 3. switch와 when
// 코틀린에는 switch 대신 when이 있다.
// when도 Expression이다.
fun getGradeWithSitch(score: Int): String{
//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        else -> "D"
//    }

    //이렇게도 쓸 수 있다.
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

}

// when(값) {
//   조건부 -> 어떠한 구문
//   조건부 -> 어떠한 구문
//   else -> 어떠한 구문문
// }
// 조건부에는 어떠한 expression이라도 들어갈 수 있다.
// 조건부에서는 여러개의 조건을 동시에 검사할 수 있다. (, 로 구분)
fun startsWithA(obj: Any?) :Boolean{
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

fun  judgeNumber2(number: Int) {
    // when을 early return처럼 활용할 수 있다.
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}

// when은 Enum Class 혹은 Sealed Class와 함께 사용할 경우 진가를 발휘한다.

// 정리:
// if / if-else / if-else if-else 모두 자바와 문법이 동일하다.
// 단, 코틀린에서는 Expression으로 취급된다. 때문에 코틀린에서는 삼항 연산자가 없다.
// 자바의 switch는 코틀린에서 when으로 대체되었고, when은 더 강력한 기능을 갖는다.

