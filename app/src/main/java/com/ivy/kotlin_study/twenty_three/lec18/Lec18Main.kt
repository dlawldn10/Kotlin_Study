package com.ivy.kotlin_study.lec18

// Lec18 코틀린에서 컬렉션을 함수형으로 다루는 방법
// 1. 필터와 맵
// 2. 다양한 컬렉션 처리 기능
// 3. List를 Map으로
// 4. 중첩된 컬렉션 처리

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
)

fun main() {
    val fruits = listOf(
        Fruit(0, "사과", 5_00, 1_000),
        Fruit(1, "사과", 7_00, 1_200),
        Fruit(2, "사과",3_00, 1_200),
        Fruit(3, "사과",8_00, 1_500),
        Fruit(4, "바나나",11_00, 3_000),
        Fruit(5, "바나나",9_00, 3_200),
        Fruit(6, "바나나",10_00, 2_500),
        Fruit(7, "수박",12_00, 10_000)
    )


    // 사과만 주세요
    // 1. 필터와 맵
    // - filter
    // 조건에 알맞는 요소들만 남김
    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    println(apples)

    // 필터에서 인덱스가 필요하다면
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    println(apples2)

    // 사과의 가격들을 알려주세요
    // - map
    // 사과들만 필터링 한 다음, 과일의 가격들만 가져옴
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }.map { fruit -> fruit.currentPrice }
    println(apples)

    // 맵에서 인덱스가 필요하다면
    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }
    println(applePrices2)

    // Mapping의 결과가 null이 아닌것만 가져오고 싶다면
    // nullOrValue() 함수의 결과가 null일지 value일지 알 수 없을 때.
    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> nullOrValue(fruit) }
    println(values)


    // 2. 다양한 컬렉션 처리 기능
    // 모든 과일이 사과인가요?
    // 출고가 10000원 이상의 과일이 하나라도 있나요
    // all : 조건을 모두 만족하면 true 그렇지 않으면 false 반환
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    println(isAllApple)

    // none : 조건을 모두 불만족하면 true 그렇지 않으면 false 반환
    val isNoApple = fruits.none() { fruit -> fruit.name == "사과" }
    println(isNoApple)

    // any : 조건을 하나라도 만족하면 true 그렇지 않으면 false 반환
    val isAnyApple = fruits.any() { fruit -> fruit.factoryPrice >= 10_000 }
    println(isAnyApple)


    // 총 과일 개수가 몇개인가요
    // 낮은 가격 순으로 과일을 보여주세요
    // 과일이 몇종류 있죠
    // count: 요소의 개수를 센다.
    val fruitCount = fruits.count()
    println(fruitCount)

    // sortedBy : 오름차순 정렬한다.
    val sortedFruit = fruits.sortedBy { fruit -> fruit.currentPrice }
    println(sortedFruit)

    // sortedByDescending: 내림차순 정렬 한다.
    val desSortedFruit = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    println(desSortedFruit)

    // distinctBy : 변형된 값을 기준으로 중복을 제거한다.
    // 먼저 이름을 기준으로 중복을 제거하고
    // map을 사용해서 name 값만 빼온다.
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }.map { fruit -> fruit.name }
    println(distinctFruitNames)


    // 첫번째 과일만 주세요
    // 마지막 과일만 주세요
    // first: 첫번째 값을 가져온다. (무조건 null이 아니어야함)
    // firstOrNull : 첫번째 값 또는 null을 가져온다. (비어있는 리스트라면 null을 반환함)
    fruits.first()
    fruits.firstOrNull()
    println(fruits.first())
    println(fruits.firstOrNull())

    // last: 마지막 값을 가져온다. (무조건 null이 아니어야함)
    // lastOrNull : 마지막 값 또는 null을 가져온다. (비어있는 리스트라면 null을 반환함)
    fruits.last()
    fruits.lastOrNull()
    println(fruits.last())
    println(fruits.lastOrNull())


    // 3. List를 Map으로
    // 과일 이름이 key인 map을 만들어야한다.
    // 같은 과일 이름을 가진 객체들을 리스트로 묶인다.
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
    println(map)

    // id가 key이고 과일이 value인 map이 필요
    // 중복되지 않는 키를 가지고 매핑할 때 많이 사용.
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    println(map2)

    // key와 value를 동시에 처리하기
    // 과일 이름을 key로, 출고가들의 리스트가 필요해요
    val map3: Map<String, List<Long>> = fruits.groupBy({fruit -> fruit.name }, {fruit -> fruit.factoryPrice})
    println(map3)

    // id 를 key로 출고가가 필요해요
   val map4: Map<Long, Long> = fruits.associateBy({fruit -> fruit.id}, {fruit -> fruit.factoryPrice })
    println(map4)

    // map에 대해서도 앞서 설명한 filter, map 등의 기능을 대부분 사용할 수 있다.
    val map5: Map<String, List<Fruit>> =
        fruits.groupBy { fruit -> fruit.name }.filter { (key, value) -> key == "사과" }
    println(map5)

    // 중첩된 컬렉션 처리
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(2, "사과",3_00, 1_200),
            Fruit(3, "사과",8_00, 1_500),
            Fruit(4, "바나나",11_00, 3_000),
            Fruit(5, "바나나",9_00, 3_200),
            Fruit(7, "수박",12_00, 10_000)
        ),
        listOf(
            Fruit(1, "사과", 7_00, 1_200),
            Fruit(5, "바나나",9_00, 3_200),
            Fruit(6, "바나나",10_00, 2_500),
            Fruit(7, "수박",12_00, 10_000)),
        listOf(
            Fruit(1, "사과", 7_00, 1_200),
            Fruit(2, "사과",3_00, 1_200),
            Fruit(3, "사과",8_00, 1_500),
            Fruit(5, "바나나",9_00, 3_200),
        )
    )

    // 이 상황에서 출고가와 현재가가 동일한 과일을 골라주세요
    // flatMap : List List가 단일 List도 바뀌게됨.
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    println(samePriceFruits)

    // List<List<Fruit>> 를 List<Fruit>으로 바꿔주세요
    fruitsInList.flatten()
    println(fruitsInList.flatten())



}

fun nullOrValue(fruit: Fruit){}

