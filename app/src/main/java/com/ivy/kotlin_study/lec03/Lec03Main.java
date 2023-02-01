package com.ivy.kotlin_study.lec03;

public class Lec03Main {

  public static void main(String[] args) {

    int number1 = 4;
    long number2 = number1; // 묵시적 형변환 가능

    // 자바에서 String 사용하기
    // 1. String format
    Person person = new Person("임지우", 100);
    String log = String.format("사람의 이름은 %s이고, 나이는 %s세 입니다.", person.getName(), person.getAge());
    // 2. StringBuilder 사용
    StringBuilder builder = new StringBuilder();
    builder.append("사람의 이름은 ");
    builder.append(person.getName());
    builder.append("이고, 나이는 ");
    builder.append(person.getAge());
    builder.append("세 입니다.");

    // 자바에서 문자열의 특정 문자 가져오기 -> 인덱스를 사용해야함.
    String str = "ABCDE";
    char ch = str.charAt(1);


  }

  public static void printAgeIfPerson(Object obj) {
    // instanceof : 변수가 주어진 타입이면 true, 그렇지 않으면 false
    if (obj instanceof Person) {
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }

}
