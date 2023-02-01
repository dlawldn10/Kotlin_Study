package com.ivy.kotlin_study.lec02


// Lec02 코틀린에서 null을 다루는 방법

class Lec02Main_kt {

    fun main(){

        // nullable 타입들만을 위한 기능
        // 1. Safe Call
        val str: String? = "ABC"
        // str.length // -> 불가능
        str?.length // 가능
        // 2. Elvis 연산자: 앞의 연산 결과가 null이면 뒤의 값을 사용
        str?.length ?: 0
        // 3. !!: null이 아님을 단언하기.
        // nullable type이지만 아무리 생각해도 null이 될 수 없는 경우 사용.
        // 하지만 null이 혹시라도 들어갈 경우 런타임중에 NPE가 발생하기 때문에 신중하게 사용해야함.
        startsWith(str)
        // 4. 플랫폼 타입: Kotlin에서 Java코드를 가져다 사용할 때 어떻게 처리?
        // 자바 코드의 annotation 읽어서 처리.
        // annotation이 없다면? -> 코틀린이 null 관련 정보를 알 수 없으므로 컴파일 시에는 오류가 안나지만 런타임시 오류가 발생할 수 있다.
        val person = Person("임지우")
        person.name.startsWith("A")
//        startsWith2(person.name)
    }

    fun startsWithA1(str: String?): Boolean {
//        if(str == null){
//            throw  IllegalArgumentException("null이 들어왔습니다.")
//        }
//        return str.startsWith("A")

        //위의 코드를 코틀린스럽게 바꿔보자
        return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
    }

    fun startsWithA2(str: String?): Boolean? {
//        if (str == null){
//            return null
//        }
//        return str.startsWith("A")

        return str?.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
//        if (str == null){
//            return false
//        }
//        return str.startsWith("A")

        return str?.startsWith("A") ?: false
    }

    fun calculate(number: Long?): Long {
        // early return 처리 시에도 사용할 수 있다.
//        if (number == null){
//            return 0;
//        }
        number ?: return 0

        return 0
    }

    fun startsWith(str: String?):Boolean {
        return str!!.startsWith("A")
    }

    fun startsWith2(str: String):Boolean {
        return str!!.startsWith("A")
    }



}


// 정리:
// 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다른 타입으로 간주된다.
// 한번 null 검사를 하면 non-null임을 컴파일러가 인식한다.
// null이 아닌 경우에만 호출되는 Safe Call(?.)
// null인 경우에만 호출되는 Elvis 연산자(?:)
// null이 절대 아닐 때 사용할 수 있는 표현 !!
// 코틀린에서 자바 코드를 사용할 때 플랫폼 타입 사용에 유의해야한다.
// 자바 코드를 읽으면서 널 가능성 확인, 코틀린으로 wrapping