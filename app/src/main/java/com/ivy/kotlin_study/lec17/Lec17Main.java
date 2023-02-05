package com.ivy.kotlin_study.lec17;

import android.os.Build;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lec17Main {

  public static void main(String[] args) {
    List<Fruit> fruits = Arrays.asList(
        new Fruit("사과", 1_000),
        new Fruit("사과", 1_200),
        new Fruit("사과", 1_200),
        new Fruit("사과", 1_500),
        new Fruit("바나나", 3_000),
        new Fruit("바나나", 3_200),
        new Fruit("바나나", 2_500),
        new Fruit("수박", 10_000)
    );

    filterFruits(fruits, fruit -> fruit.getName().equals("사과"));

    // 위의 표현을 메소드 레퍼런스를 활용하여 아래와 같이 바꿀 수 있다.
    filterFruits(fruits, Fruit::isApple);

    //이와 같이 자바에서는 메소드 자체를 직접 넘겨주는 '것처럼' 쓸 수 있다.
    // 넘기는 것처럼 보이지만 자바에서 함수는 2급 시민이므로 변수에 할당되거나 파라미터로 전달될 수 없다.

    // 자바는 람다함수 안에서 final 변수, 또는 실질적으로 final인 변수만 사용할 수 있다.
    String targetFruitName = "바나나";
    targetFruitName = "수박";
    // 에러
//    filterFruits(fruits, (fruit -> targetFruitName.equals(fruit.getName())));
  }

  // Predicate라는 미리 만들어져 있는 함수형 인터페이스를 활용해서 코드를 리팩토링 할 수 있다.
  private static List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
    List<Fruit> results = new ArrayList<>();
//    for (Fruit fruit : fruits) {
//      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//        if (fruitFilter.test(fruit)) {
//          results.add(fruit);
//        }
//      }
//    }
//    return results;

    // if와 for문을 더욱 간결하게 하기 위한 노력으로 스트림 등장 -> 함수형 프로그래밍의 형태
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
      return fruits.stream()
              .filter(fruitFilter)
              .collect(Collectors.toList());
    }
    return results;
  }

}
