package com.ivy.kotlin_study.lec15

// Lec15 코틀린에서의 배열과 컬렉션을 다루는 방법
// 1. 배열
// 2. 코틀린에서의 Collection - List, Set, Map
// 3. 컬렉션의 null 가능성, 자바와 함께 사용하기

fun main(){
    // 1. 배열
    // 사실 배열은 잘 사용하지 않는다.
    // Effective Java에서도 '배열보다는 리스트를 사용하라'라고 말하고있다.
    var array = arrayOf(100, 200)

    // array.indices -> array에 들어있는 값을 세서 인덱스를 Range로 담아준다.
    // 0부터 마지막 인덱스 까지의 range
    for (i in array.indices){
        println("${i} ${array[i]}")
    }

    for (num in array){
        println(num)
    }

    // array.withIndex() -> 인덱스와 값을 함께 가져온다.
    for ((idx, value ) in array.withIndex()){
        println("${idx} ${value}")
    }

    // array.plus(300) -> plus() 함수를 이용해서 배열에 값을 쉽게 추가할 수도 있다.
    // 자바에서는 배열을 복사해서 추가해야함.
    array = array.plus(300)
    println(array)


    // 2. 코틀린에서의 Collection - List, Set, Map
    // 컬렉션을 만들어줄때 불변인지 가변인지를 설정해야한다.
    // 가변(Mutable) 컬렉션: 컬렉션에 element를 추가, 삭제할 수 있다.
    // 불변 컬렉션: 컬렉션에 element를 추가, 삭제할 수 없다. -> Collection을 만들자마자 Collections.unmodifiableList() 등을 붙여준다고 생각하면됨.
    // 불변 컬렉션이라고 하더라도 Reference Type인 Element의 필드는 바꿀 수 있다.
    // ex) 불변리스트<Money객체> 가 있을 때, Money객체를 더 추가하거나 삭제할 수는 없지만 원래 있던
    // Money 객체 중 하나의 필드를 수정하거나 하는 것은 가능하다는 이야기

    // - List
    // listOf를 통해 '불변 리스트'를 만든다.
    val numbers = listOf(100, 200)
    // emptyList<타입>() -> 이렇게 비어있는 리스트를 만들수도 있다.
    val emptyList = emptyList<Int>()
    // 근데 아래처럼 타입 추론이 가능한 상황이면 <타입>을 적어주지 않아도 알아서 추론한다.
    printNumbers(emptyList())

    // 가변 리스트를 만들고 싶다면
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)
    // mutableListOf() 는 ArrayList가 기본 구현체이다.

    // 간단한 TIP: 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자.


    // - Set: 집합
    // 집합은 List와 다르게 순서가 없고, 같은 element는 하나만 존재할 수 있다.
    // 자료구조적 의미만 제외하면 모든 기능이 List와 비슷함.
    val numbers3 = setOf(100, 200)

    // For each
    for (num in numbers){
        println(num)
    }

    // 전통적인 for문
    for ((idx, num) in numbers3.withIndex()){
        println("${idx} ${num}")
    }
    // 가변 집합을 만들고 싶다면
    val numbers4 = mutableSetOf(100, 200)
    // mutableSetOf()는 LinkedHashSet이다.


    // - Map
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    // 또는
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"
    // 또는
    // 여기서 to 는 중위 함수이다.
    // pair 라는 클래스를 만들어준다.
    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value ) in oldMap.entries) {
        println(key)
        println(value)
    }


    // 3. 컬렉션의 null 가능성, 자바와 함께 사용하기
    // List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null 아님
    // List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null 일 수 있음.
    // List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음.
    // -> ?의 위치에 따라서 null 가능성 의미가 달라지므로 차이를 잘 이해하고 코드를 작성해야함.

    // 자바와 사용할 때 주의점:
    // - 자바는 읽기 전용 컬렉션과 변경 가능 컬렉션을 구분하지 않는다.
    // ex) 코틀린의 불변 리스트를 자바에서 가져오면, 자바에는 불변 리스트가 없으므로
    // 자바 코드에서 해당 리스트에 변경사항을 넣을 수 있음.
    // 이러고 다시 코틀린 코드로 돌아오면 불변 리스트인데 변경사항이 감지되어 오류 발생.
    // - 자바는 nullable 타입과 non-nullable 타입을 구분하지 않는다.
    // ex) 코틀린의 non-nullable 리스트를 자바에서 가져와서, null을 리스트에 추가한 뒤에
    // 코틀린으로 다시 돌아가는 상황이 발생할 수 있음.
    // 코틀린 입장에서는 non-nullable 리스트에 null이 들어가버려서 오류 발생.
    // -> 이런 문제를 해결하기 위해서는?
    // 코틀린 쪽의 컬렉션이 자바에서 호출되면 컬렉션 내용이 변할 수 있음을 개발자가 감안하고 코드를 작성해야한다.
    // 또는 코틀린쪽에서 Collections.unmodifiableXXX()를 활용하면 변경 자체를 막을 수 있다.
    // - 코틀린에서 자바 컬렉션을 가져다 사용할 때 플랫폼 타입을 신경써야한다.
    // ex) 자바에서 List<Integer> 컬렉션을 코틀린으로 보냈을 때, 코틀린 입장에서는
    // List<Int?>, List<Int>?, List<Int?>? 인지 구분해야함.
    // -> 이런 경우는 자바 코드를 보며 맥락을 확인하고, 자바 코드를 가져오는 지점을 wrapping 한다.


}

private fun printNumbers(numbers: List<Int>) {
}


// 정리:
// 배열 사용법이 약간 다르다.
// 코틀린에서는 컬렉션을 만ㄷ르때 불변/가변을 지정해야 한다.
// List, Set, Map에 대한 사용법이 변경, 확장 되었다.
// 자바와 코틀린 코드를 섞어 컬렉션을 사용할 때는 주의해야한다.
// 자바에서 코틀린 컬렉션을 가져갈 때는 불변 컬렉션을 수정할 수도 있고, non-nullable 컬렉션에 null을 넣을 수도 있다.
// 코틀린에서 자바 컬렉션을 가져갈 때에는 플랫폼 타입을 주의해야한다.