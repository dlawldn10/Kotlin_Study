package com.ivy.kotlin_study.lec17

// Lec17. 코틀린에서 람다(익명 함수)를 다루는 방법
// 1. 자바에서 람다를 다루기 위한 노력
// 2. 코틀린에서의 람다
// 3. Closure
// 4. 다시 try with resources

fun main(){
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )
    // 1. 자바에서 람다를 다루기 위한 노력
    // 인터페이스와 익명 클래스를 사용하여 해결하려는 노력
    // -> 하지만 익명 클래스를 사용하는 것은 복잡.
    // -> 또한 다양한 조건들이 필요할 수 있음.
    // -> 따라서 이러한 어려움 해결을 위해 JDK8부터 람다(이름이 없는 함수) 등장.


    // 2.코틀린에서의 람다
    // 자바와는 근본적으로 다른 한 가지가 있다
    // -> 코틀린에서는 함수가 그 자체로 값이 될 수 있어서 변수에 할당될 수도, 파라미터로 값을 넘길 수도 있다.

    // 람다를 만드는 방법 1
    // 이름을 적지 않는다.
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    // 중괄호와 화살표 사용 방법
    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])
    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0])

    // 만들어둔 람다를 파라미터로 넘겨 사용하는 방법
    filterFruits(fruits, isApple)
    // 만들고 바로 넘겨서 사용하는 방법
    filterFruits(fruits, fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    })
    // 중괄호와 화살표를 사용한 람다를 파라미터로 넘기는 경우
    // 해당 람다 함수가 마지막 파라미터로 함수에서 호출된디면
    // 람다함수를 ()밖에 빼고 옆에 써주면
    // 자동으로 가장 마지막 파라미터로 들어간다.
    // 타입도 생략 가능.
//    filterFruits(fruits, {fruit: Fruit -> fruit.name == "사과"})
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    // +) 람다 함수의 파라미터가 1개인 경우 파라미터명을 쓰는 대신 it으로 표현 가능
    // 하지만 함수를 부르는 쪽 코드만 봐서는 이 it이라는 데이터가 어떤 데이터인지 잘 모르기 때문에
    // 그냥 '변수명 -> '으로 나타내는 것을 추천.
    filterFruits(fruits) { it.name == "사과" }


    // 3. Closure
    // 자바에서는 람다 함수 안에 가변 변수를 사용할 수 없지만 코틀린은 사용 가능하다.
    // 이것이 가능한 이유? : 코틀린에서는 람다가 시작하는 시점에 참조하고 있는 변수를 모두 포획하여 그 정보를 가지고 있다.
    // 이렇게 해야만 람다를 진정한 1급 시민으로 간주할 수 있다.
    // 람다가 시작하는 시점에 참조하고 있는 변수를 모두 포획한 이 데이터 구조를 Closure이라 한다.
    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) {it.name == targetFruitName}


    // 4. 다시 try with resources
    // use 함수를 타고 들어가면 ->
    // Closable 구현체에 대한 확장함수이다.
    // inline 함수이다.
    // 람다를 파라미터로 받게 만들어진 함수이다.



}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit)->Boolean):List<Fruit>{
    val results = mutableListOf<Fruit>()
    for (fruit in fruits){
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}




// 정리:
// 함수는 자바에서 2급 시민이지만, 코틀린에서는 1급 시민이다.
// 때문에 함수 자체를 변수에 넣을 수도 있고 파라미터로 전달할 수도 있다.
// 코틀린에서 함수 타입은 (파라미터 타입, ...) -> 반환타입
// 코틀린에서 람다는 두 가지 방법으로 만들 수 있고, {} 방법이 더 많이 사용된다.
// 함수를 호출하며, 마지막 파라미터인 람다를 쓸 때는 소괄호 밖으로 람다를 뺄 수 있다.
// 파라미터가 한개일때는 it을 사용할 수 있는데, 그냥 '변수명 -> '으로 나타내는 것을 추천.
// -> 함수를 부르는 쪽 코드만 봐서는 이 it이라는 데이터가 어떤 데이터인지 잘 모르기 때문
// 람다의 마지막 expression 결과는 람다의 반환값이다.
// 코틀린에서는 Closure를 사용하여 non-final 변수도 람다에서 사용할 수 있다.
