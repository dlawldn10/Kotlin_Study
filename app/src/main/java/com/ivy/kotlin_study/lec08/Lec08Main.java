package com.ivy.kotlin_study.lec08;

public class Lec08Main {

  public static void main(String[] args) {
    // 같은 타입의 여러 파라미터를 받을 때는
    String[] array = new String[]{"A", "B", "C"};
    // 배열을 직접 넣거나
    printAll(array);
    // comma를 이용해 여러 파라미터를 넣어서 호출.
    printAll("A", "B", "C");

  }

  public int max(int a, int b){
    if (a > b){
      return a;
    }
    return b;
  }

  public static void repeat(String str, int num, boolean useNewLine){
    for (int i = 1; i<=num; i++){
      if (useNewLine) {
        System.out.println(str);
      } else{
        System.out.print(str);
      }
    }
  }

  // 많은 코드에서 useNewLine에 true 값을 넣고 있다면?
  // default parameter 자바 -> 오버로딩 활용
  public void repeat(String str, int num) {
    repeat(str, num, true);
  }

  // 많은 코드에서 useNewLine에 true 값을 넣고 있다면? -> 한번 더 오버로딩 가능
  public void repeat(String str) {
    repeat(str, 3, true);
  }

  // 하지만 이와 같이 사용하면 메소드를 여러개 만들어야되고, 중복 작업의 느낌이 남.
  // 그래서 코틀린에는 default parameter가 존재.


  // '타입...' 을 쓰면 가변인자 사용함을 뜻한다.
  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

}
