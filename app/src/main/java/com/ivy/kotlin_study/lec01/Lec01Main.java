package com.ivy.kotlin_study.lec01;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1) -> long = primitive type
    final long number2 = 10L; // (2)

    Long number3 = 1_000L; // (3) -> Long = reference type(nullable)
    Person person = new Person("최태현"); // (4)

    // 연산을 할때는 reference type을 쓰지 않는 것이 좋다 -> boxing, unboxing이 일어나면서
    // 불필요한 객체 생성이 이루어지기 때문. 그러나 코틀린은 이러한 구분이 없이 모두 Long으로 표기.
    // 코틀린 공식 문서 왈: 모두 reference type으로 합쳐져 있는 것처럼 보이지만,
    // 연산하는 상황을 만날 경우, 코틀린이 알아서 내부적으로 primitive 타입으로 바꾸어 처리해준다.
    // 즉, boxing과 unboxing을 고려하지 않아도 되도록 코틀린이 알아서 처리해준다.

  }

}
