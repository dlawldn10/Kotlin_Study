package com.ivy.kotlin_study.lec08

// Lec08 코틀린에서 함수를 다루는 방법
// 1. 함수 선언 문법
// 2. default parameter
// 3. named argument (parameter)
// 4. 같은 타입의 여러 파라미터 받기 (가변인자)

fun main(){
    repeat("Hello World", 3, true)
    // 기본값이 지정되어 있으므로, num과 userNewLine 값을 넣지 않아도 자동으로 호출해준다.
    repeat("Hello World")

    // 3. named argument (parameter)
    // repeat을 호출할 때, num은 3을 그대로 쓰고 userNewLine은 false를 쓰고 싶다!
    // 매개변수 이름을 통해 직접 지정
    // 지정되지 않은 매개 변수는 기본값 사용.
    // builder 를 직접 만들지 않고 builder의 장점을 가지게 된다.
    repeat("Hello World",  userNewLine = false)
    printNameAndGender(gender = "FEMALE", name =  "임지우")
    // 주의할 점: 코틀린에서 자바 함수를 가져다 사용할 때는 named argument를 사용할 수 없다.
    // 이유: JVM 상에서 자바 바이트코드로 변환되었을 때 파라미터 이름을 보존하고 있지 않기 때문.
//    Lec08Main.repeat(str = "A") // -> 오류

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    // 자바에서는 이렇게 바로 배열을 넣어줬지만
    // printAll(array)
    // 코틀린에서는 이렇게 *(spread 연산자: 배열 안의 원소들을 comma를 쓰는 것처럼 꺼내줌.)붙여서 대입
    printAll(*array)
}

// 1. 함수 선언 문법
// 두 정수를 받아 더 큰 정수를 반환하는 예제
// 함수가 하나의 결과값이면 block 대신 '=' 사용 가능
fun max(a: Int, b: Int) = if (a > b) a else b
// block {} 을 사용하는 경우에는 반환 타입이 Unit이 아니면 명시적으로 작성해주어야한다.

// 함수는 클래스 안에 있을 수도, 파일 최상단에 있을 수도 있다.
// 한 파일 안에 여러 함수들이 있을 수도 있다.


// 2. default parameter
// 밖에서 parameter를 넣어주지 않는 경우 기본 값을 쓴다.
// 주어진 문자열을 N번 출력하는 예제
fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else{
            print(str)
        }
    }
}
// 코틀린에도 오버로딩 기능이 있긴 함.



fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// 4. 같은 타입의 여러 파라미터 받기 (가변인자)
// 문자열을 N개 받아 출력하는 예제
// 자바에서 처럼 '타입...'을 쓰는 대신 제일 앞에 vararg 를 적어주어야한다.
fun printAll(vararg strings: String){
    for (str in strings) {
        println(str)
    }
}


// 정리:
// 함수의 문법은 자바와 다르다
// 접근 지시어 fun 함수이름(파라미터): 반환타입 {
//    ...
// }
// body가 하나의 값으로 간주되는 경우에는 block을 없앨 수도 있고, block이 없다면 반환 타입을 없앨 수도 있다.
// fun max(a: Int, b: Int): Int = if (a > b) a else b
// fun max(a: Int, b: Int) = if (a > b) a else b
// 함수 파라미터에 default parameter 기본값을 설정해줄 수 있다.
// 함수를 호출할 때 특정 파라미터를 지정해 넣어줄 수 있다.
// 가변인자에는 vararg 키워드를 사용하며, 가변인자 함수를 배열을 이용해 호출할 때는 *를 붙여주어야한다.