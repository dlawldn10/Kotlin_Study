package com.ivy.kotlin_study.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {

  public static void main(String[] args) {
     int[] array = {100, 200};
     for (int i=0; i<array.length; i++){
       System.out.printf("%s %s", i,array[i]);
     }

     // List
    final List<Integer> numbers = Arrays.asList(100, 200);

     // 하나를 가져오기
    System.out.println(numbers.get(0));

    // For Each
    for (int number: numbers){
      System.out.println(number);
    }

    // 전통적인 for문
    for (int i=0; i< numbers.size(); i++){
      System.out.printf("%s %s", i, numbers.get(i));
    }


    // map
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "MONDAY");
    map.put(2, "TUESDAY");

    // JDK 9 부터
//    Map.of(1, "MONDAY", 2, "TUESDAY");

    // key를 통한 접근
    for (int key: map.keySet()) {
      System.out.println(key);
      System.out.println(map.get(key));
    }

    // key, value 둘다 가져와 접근
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }


  }

}
