package com.ivy.kotlin_study.lec04

class Lec04Main_kt {
    fun main(){
        // 1. 단항 연산자 / 산술 연산자
        // 단항 연산자 ++ --
        // 산술 연산자 + - * / %
        // 산술 대입 연산자 += -= *= /= %=
        // 자바와 코틀린 완전 동일함.

        // 2. 비교 연산자와 동등성, 동일성
        // 비교 연산자 > < >= <=
        // 자바와 코틀린 모두 사용법은 같으나, 코틀린에서 객체를 비교할 때
        // 비교 연산자를 사용하면 내부적으로 compareTo()를 호출한다.
        // 자바는 compareTo()를 직접 호출해줘야함.
        val money1 = JavaMoney(2_000L)
        val money2 = JavaMoney(1_000L)
        // money1과 동등한 money3
        val money3 = JavaMoney(2_000L)
        // money1과 동일한 money4
        val money4 = money1

        if (money1 > money2){
            println("money1이 money2보다 금액이 큽니다.")
        }

        // 동등성(equality): 두 객체의 값이 같은가? -> equals()
        // 동일성(Identity): 완전히 동일한 객체인가? 즉 주소가 같은가? -> ==
        // JavaMoney(1000) 주소:0x201
        // JavaMoney(1000) 주소:0x101
        // 위 두 객체는 값은 같지만 주소는 다르다. 즉, 두 객체는 동등하나 동일하지 않다.
        // 자바: ==과 equals()를 구분하여 사용해야함.
        // 코틀린: 두 경우 모두 동일하게 ==을 사용해도됨.
        //        내부적으로 동등성에 ==를 호출하면 간접적으로 equals()를 호출해준다.

        println(money1 == money4) // true
        println(money1 == money3) // true 내부적으로 equals() 호출.

        // 3. 논리 연산자 / 코틀린에 있는 특이한 연산자
        // 논리 연산자 && || !
        // 자바와 완전히 동일하며 자바처럼 Lazy 연산을 수행한다.
        // Lazy 연산
        if (fun1() || fun2()){
            println("본문")
        }
        // 결과:
        // fun 1
        // 본문
        // fun2()는 호출하지 않는 것을 알 수 있다.

        if (fun2() && fun1()){
            println("본문")
        }
        // 결과:
        // fun 2
        // fun1()는 호출하지 않는 것을 알 수 있다.

        // 코틀린에 있는 특이한 연산자
        // in / !in
        // 컬렉션이나 범위에에 포함되어 있다, 포함되어있지 않다.
        // ex) for (i in numbers)

        // a..b
        // a 부터 b까지의 범위 객체를 생성한다.
        // ex) for (i in a..b)

        // a[i]
        // a에서 i번째 인덱스의 값을 가져온다.
        // a[i] = b
        // a에서 i번째 인덱스의 값으로 b를 넣는다.

        // 4. 연산자 로버로딩
        // 코틀린에서는 객체마다 연산자를 직접 정의할 수 있다.
        val money5 = KotlinMoney(1_000L)
        val money6 = KotlinMoney(2_000L)
        println(money5.plus(money6)) // -> 자바의 방식. 가능
        println(money5 + money6) // -> 가능

    }

    fun fun1(): Boolean{
        println("fun 1")
        return true
    }

    fun fun2(): Boolean{
        println("fun 2")
        return false
    }
}

// 정리:
// 단항 연산자, 산술 연산자, 산술 대입 연산자 자바와 똑같다
// 비교 연산자 사용법도 자바와 똑같다
// 단, 객체 끼리도 자동 호출되는 compareTo()를 이용해 비교 연산자를 사용할 수 있다.
// in, !in / a..b / a[i] / a[i]=b 와 같이 코틀린에서 새로 생긴 연산자도 있다.
// 객체끼리 연산자를 직접 지정할 수 있다.