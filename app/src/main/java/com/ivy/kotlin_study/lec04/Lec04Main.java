package com.ivy.kotlin_study.lec04;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(2_000L);
    JavaMoney money2 = new JavaMoney(1_000L);
    // money1과 동등한 money3
    JavaMoney money3 = new JavaMoney(2_000L);
    // money1과 동일한 money4
    JavaMoney money4 = money1;

    // 자바는 compareTo()를 직접 호출해줘야함.
    if (money1.compareTo(money2) > 0){
      System.out.println("money1이 money2보다 금액이 큽니다.");
    }

    System.out.println(money1 == money4); // true
    System.out.println(money1 == money3); // false
    System.out.println(money1.equals(money3)); // true

    System.out.println(money1.plus(money2));

  }

}
