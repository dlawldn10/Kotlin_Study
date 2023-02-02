package com.ivy.kotlin_study.lec09;

public class JavaPerson {

  private final String name;
  private int age;

  public JavaPerson(String name, int age) {
    // 자바에서는 생성자에서 값 검증.
    if (age <= 0) {
      throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다", age));
    }
    this.name = name;
    this.age = age;
  }

  // 새로운 생성자
  public JavaPerson(String name) {
    this(name, 1);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isAdult() {
    return this.age >= 20;
  }

}

