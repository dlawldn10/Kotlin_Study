package com.ivy.kotlin_study.lec14

// Lec14 코틀린에서 다양한 클래스를 다루는 방법
// 1. Data Class
// 2. Enum Class
// 3. Sealed Class, Sealed Interface


// 1. Data Class
// 계층간의 데이터를 전달하기 위한 DTO(Data Transfer Object)
// 데이터(필드)
// 생성자와 getter
// equals, hashCode
// toString

// 자바
// IDE를 활용할 수 있고, lombok을 활용할 수도 있지만 여전히 클래스가 장황해지거나,
// 클래스 생성 이후 추가적인 처리를 해줘야 하는 단점이 있다.

// 코틀린
// data class -> equals, hashCode, toString을 내부에서 자동으로 만들어준다.
// 여기에 named argument까지 활용하면 builder pattern을 쓰는 것 같은 효과도 있다.
// 사실상 builder, equals, hashCode, toString이 모두 있는 것.
// +) 자바에서도 JDK16부터 코틀린의 data class 같은 record class를 도입함.
data class KotlinPersonDto(
    val name: String,
    val age: Int,
)

fun main(){
    val dto1 = KotlinPersonDto("임지우", 100)
    val dto2 = KotlinPersonDto("임지우", 200)
    println(dto1 == dto2)
    println(dto1)
    // 결과:
    // false
    // KotlinPersonDto(name=임지우, age=100)
    // -> equals와 toString이 구현되어 있어서 가능한 것.
}


// 2. Enum Class
// enum :
// 추가적인 클래스를 상속받을 수 없다.
// 인터페이스는 구현할 수 있으며, 각 코드가 싱글톤이다.
// when은 Enum Class 혹은 Sealed Class와 함께 사용할 경우, 더욱더 진가를 발휘한다.
enum class KotlinCountry(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US"),
    ;
}

fun handleCountry(country: KotlinCountry) {
    // when에서 enum을 기준값으로 받을 때는 어차피 컴파일 타임에
    // enum 클래스 내부에 어떤 값들이 있는지 다 알고 있기 때문에
    // else를 써주지 않아도 된다.
    // -> enum에 대한 분기 처리 시 코틀린에서는 when을 사용해서 가독성을 높였다.
    // -> 컴파일러가 enum 클래스 내부에 모든 타입을 다 알고 있기 때문에 else를 작성하지 않아도 된다.
    // -> when 구문에서 enum에 변화(값이 추가되거나 삭제되는)가 생기면 이를 알 수 있다.
    when (country) {
        KotlinCountry.KOREA -> TODO()
        KotlinCountry.AMERICA -> TODO()
    }
}


// 3. Sealed Class, Sealed Interface
// sealed: 봉인을 한.
// sealed 클래스가 왜 생겼는가
// 상속이 가능하도록 추상 클래스를 만들고 싶은데 외부에서는 이 클래스를 상속받지 않았으면 좋겠어
// -> 하위 클래스를 봉인하자. 우리가 작성한 클래스만 하위 클래스가 되도록 봉인하자.
// 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
// 즉, 런타임에 클래스 타입이 추가될 수 없다.
// 하위 클래스는 Selaed class와 같은 패키지에 있어야한다.
// enum class와 다른점:
// 클래스를 상속받을 수 있다.
// 하위 클래스는 멀티 인스턴스가 가능하다.

sealed class HyundaiCar(
    val name:String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandure : HyundaiCar("그렌저", 3_000L)

// enum과 같이 런타임에 클래스 타입이 추가될 수 없다는 특징이 있으므로
// when expression과 활용할 때 큰 효과를 볼 수 있다.
fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandure -> TODO()
        is Sonata -> TODO()
    }
}
// 추상화가 필요한 Entity 또는 DTO에 sealed class를 활용한다.
// +) JDK17에서도 Sealed Class가 추가되었다. 문법은 다름.


// 정리:
// 코틀린의 Data Class를 사용하면 equals, hashCode, toString을 자동으로 만들어준다.
// 코틀린의 enum class는 자바의 enum class와 동일하지만, when과 함께 사용함으로서 큰 장점을 갖게 된다.
// enum class보다 유연하지만, 하위 클래스를 제한하는 sealed class 역시 when과 함께 주로 사용된다.