package com.ivy.kotlin_study.lec03

// Lec03 코틀린에서 Type을 다루는 방법

class Lec03Main_kt {

    fun main(){

        // 1. 기본 타입
        // Byte, Short, Int, Long, Float, Double, 부호 없는 정수들
        // Int, Long, Float, Double이 가장 많이 쓰임.

        // 코틀린은 선언된 기본값을 보고 타입을 추론한다.
        val number1 = 3 // Int
        var number2 = 3L // Long
        val number3 = 3.0f // Float
        val number4 = 3.0 // Double

        // 2. 타입 캐스팅
        // - 기본 타입 캐스팅
        // 자바는 타입간의 변환이 암시적으로 이루어질 수 있으나
        // 코틀린에서는 명시적으로 이루어져야만 한다.
        // number2 = number1 -> 불가능. type mismatch
        // 반드시 to반환타입() 함수를 이용해서 명시적으로 형변환을 해줘야 한다.
        number2 = number1.toLong() // -> 가능

        // 만약 (정수 / 정수) 의 계산 결과에서 정수가 아닌 double 값을 얻고 싶다면,
        val number5 = 5
        val result = number1 / number5.toDouble()

        // 변수가 nullable일때는 적절한 추가 처리가 필요.
        var number6: Int? = 3
        var number7: Long = number6?.toLong() ?: 0L
        // number6.toLong() -> 불가능

        // - 일반타입 캐스팅
        printAgeIfPerson(null)

        // 3. Kotlin의 3가지 특이한 타입
        // Any, Unit, Nothing
        // - Any
        // 자바의 Object 역할 (모든 객체의 최상위 타입)
        // 모든 Primitive Type의 최상위 타입도 Any이다.
        // Any 자체로는 null을 포함할 수 없으므로, null을 포함하여 정말 모든 타입을 표현하고 싶다면 Any?로 표현.
        // Any에 equals / hashCode / toString 존재.

        // - Unit
        // 자바의 void와 동일한 역할.
        // void와 다르게 unit은 그 자체로 타입 인자로 사용 가능하다.
        // 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미.
        // 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현하기 위해 Unit이라는 단어를 썼다고 한다.

        // - Nothing
        // 함수가 정상적으로 끝나지 않았다는 것을 표현하는 역할.
        // 반환형에 Nothing을 붙이면 무조건 예외를 반환하는 함수라는 뜻이 된다.
        // 무조건 예외를 반환하는 함수 / 무한루프 함수 등
        // 실무에서 많이 쓰이지는 않음.
        //ex) fail("nothing 함수")

        // 4. String Interpolation, String Indexing
        // 문자열 타입을 코틀린에서 어떻게 사용하는지
        val person = Person("임지우", 100)
        val log = "사람의 이름은 ${person.name}이고, 나이는 ${person.age}세 입니다."
        // TIP: 변수 하나만 있더라도 $name 이렇게 하지 말고 ${name} 이렇게 중괄호 생략하지 않는게 좋음.
        // 통일성이 있어서 가독성, 일괄 변환, 정규식 활용 측면에서 편리함.

        // 여러 줄에 걸친 문자열을 작성해야할 때, 큰따옴표 3개(""" """)로 쉽게 작성 가능.
        // 자바에서는 StringBuilder, append를 사용해야함.
        val withoutIndent =
            """
               ABC
               123
               456
               ${person.name}
            """.trimIndent()

        val str = "ABC"
        println(str[0])
        println(str[2])

    }

    fun fail(message: String): Nothing{
        throw IllegalArgumentException(message)
    }

    fun printAgeIfPerson(obj: Any?){
        // is : 자바의 instanceof 와 같은 역할
        // obj가 Person 타입이라면
        if(obj is Person){
            val person = obj as Person
            // 뒤의 as Person 을 생략해도 코틀린이 스마트 캐스트를 수행하여 알아서 인식한다.
            println(person.age)
        }

        // obj가 Person 타입이 아니라면
        if(obj !is Person){
            //...
        }

        // 형변환 null safe 처리하기
        // obj가 null이 아니라면 person변수가 정상적으로 형변환 및 초기화되고,
        // obj가 null이라면 person변수도 null이 된다.
        // 또는 obj가 Type이 아니어도 person변수가 null이 된다.
        val person = obj as? Person
    }
}

// 정리:
// 코틀린의 변수는 초기값을 보고 타입을 추론하며, 기본 타입들 간의 변환은 명시적으로 이루어진다.
// 코틀린에서는 is, !is, as, as? 를 이용해 타입을 확인하고 캐스팅한다.
// 코틀린의 Any는 자바의 Object 와 같은 최상위 타입이다.
// 코틀린의 Unit은 자바의 void와 동일하다.
// 코틀린의 Nothing은 정상적으로 끝나지 않은 함수의 반환을 의미한다.
// 문자열을 가공할때 ${변수}와 """ """를 사용하면 깔끔한 코딩이 가능하다.
// 문자열에서 문자를 가져올 때는 자바의 배열처럼 []를 사용한다.