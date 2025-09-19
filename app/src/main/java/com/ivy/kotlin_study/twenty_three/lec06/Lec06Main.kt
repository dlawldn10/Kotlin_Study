package com.ivy.kotlin_study.lec06

// Lec06 코틀린에서 반복문을 다루는 방법
// 1. for-each문
// 2. 전통적인 for문
// 3. Progression과 range
// 4. while문


fun main(){
    // 1. for-each문
    // 숫자가 들어있는 리스트를 하나씩 출력하는 예제
    val numbers = listOf(1L, 2L, 3L)
    // : 대신 in을 사용
    // numbers. 자바와 동일하게 Iterable이 구현된 타입이라면 모두 들어갈 수 있다.
    for (number in numbers){
        println(number)
    }

    // 2. 전통적인 for문
    // 1부터 5까지 출력하는 예제
    for (i in 1..5){
        println(i)
    }

    // 내려가는 경우
    for (i in 5 downTo 1){
        println(i)
    }

    // 2칸씩 올라가는 경우
    for (i in 1..5 step 2){
        println(i)
    }

    // 3. Progression (등차수열)과 range (범위)
    // 동작 원리:
    // ..연산자 = 범위를 만들어내는 연산자.
    // 1..3 = 1부터 3까지의 범위
    // IntRange 클래스 = IntProgression 클래스를 상속받고 있음.
    // 즉, 1..3의 의미는 "1에서 시작하고 3으로 끝나는 등차수열을 만들어줘"
    // 등차수열 -> 1. 시작값, 2. 끝값, 3. 공차
    // 3 downTo 1: 시작값 3, 끝값 1, 공차 -1인 등차수열
    // 1..5 step 2: 시작값 1, 끝값 5, 공차 2인 등차수열
    // +) downTo 와 step은 함수이다.
    // 중위 호출 함수: "변수.함수이름(argument)" 대신 "변수 함수이름 argument" 형식으로 쓸 수 있게 해줌.

    // 1..5 step 2 의 동작 순서:
    // 1. 1부터 5까지 공차가 1인 등차수열이 생성된다.
    // 2. 이 등차수열에 대해서 step 함수를 호출하여 공차로 2를 넣어준다.
    // 3. 등차수열 완성
    // -> 코틀린에서 전통적인 for문은 등차수열을 사용한다.


    // 4. while문
    // 코틀린과 자바 똑같다.
    // do-while도 똑같다.
    // 1부터 3을 출력하는 예제
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }


}

// 정리:
// for-each 문에서 자바는 :, 코틀린은 in을 사용한다.
// 전통적인 for문에서 코틀린은 등차수열과 in을 사용한다.
// 그 외 for문법은 모두 동일하다.
// while문과 do-while문도 동일하다.



