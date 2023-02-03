package com.ivy.kotlin_study.lec10.Java;

public interface JavaFlyable {

  default void act() {
    System.out.println("파닥 파닥");
  }

  void fly();

}
