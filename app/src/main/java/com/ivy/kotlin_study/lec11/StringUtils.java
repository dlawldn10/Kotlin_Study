package com.ivy.kotlin_study.lec11;

// 자바에서 유틸성 코드 : abstract class와 private constructor를 사용해서
// 인스턴스화를 막고 상속도 불가능 하게끔 작성하는 기법.
// 인스턴스 메소드와 인스턴스 변수를 일절 제공하지 않고 정적 메소드와 변수만을 제공하는 클래스
// 코틀린에서도 비슷하게 가능하지만 더 편리한 방법이 있음.
public abstract class StringUtils {

  private StringUtils() {}

  public boolean isDirectoryPath(String path) {
    return path.endsWith("/");
  }

}

