package com.ivy.kotlin_study.lec12.java;

import com.ivy.kotlin_study.lec12.kotlin.Person;

public class Lec12Main {

  public static void main(String[] args) {

    // 자바에서 코틀린에 있는 static filed나 static 함수를 사용하고 싶을 때 ->
    // 코틀린 companion object에 이름이 있는 경우:
     Person.Factory.newBaby("ABC");
    // 코틀린 companion object에 이름이 없는 경우 - annotation 활용:
     Person.newBaby("ABC");
    // 코틀린 companion object에 이름이 없는 경우 - 기본 이름 활용:
    // Person.Companion.newBaby("ABC");


    moveSomething(new Movable() {
      @Override
      public void move() {
        System.out.println("무브 무브");
      }

      @Override
      public void fly() {
        System.out.println("날다 날다");
      }
    });


  }

  private static void moveSomething(Movable movable){
    movable.move();
    movable.fly();
  }
}
