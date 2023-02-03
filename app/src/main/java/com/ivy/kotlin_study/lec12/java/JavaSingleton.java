package com.ivy.kotlin_study.lec12.java;

// 이 코드에서 동시성 처리를 조금 더 해주거나 enum class를 활용하는 방법도 있음.
public class JavaSingleton {

  private static final JavaSingleton INSTANCE = new JavaSingleton();

  private JavaSingleton() { }

  public static JavaSingleton getInstance() {
    return INSTANCE;
  }

}
