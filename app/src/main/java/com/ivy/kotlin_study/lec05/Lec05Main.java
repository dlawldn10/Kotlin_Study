package com.ivy.kotlin_study.lec05;

import java.util.Random;

public class Lec05Main {

  public static void main(String[] args) {
  }

  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다");
      return;
    }

    System.out.println("주어지는 숫자는 홀수입니다");
  }

  private void validateScoreIsNotNegative(int score){
    if (score < 0){
      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
  }

  // 즉, 자바에서는 if문을 하나의 값으로 취급하지 않기때문에
  private String getPassOrFail(int score){
//    if (score >= 50){
//      return "P";
//    }else{
//      return "F";
//    }

    // 아래와 같이 코드를 짜면 에러가 난다.
//    String score = if (score >= 50){
//      return "P";
//    }else{
//      return "F";
//    }

    // 이런 상황을 위해 삼항 연산자가 있다.
    // 단, 삼항연산자는 하나의 값으로 취급하므로 에러가 없다.
    // Expression이면서 Statement.
    return score  >= 50 ? "P": "F";

  }

  private String getGrade(int score){

    if(score >= 90) {
      return "A";
    }else if (score >= 80){
      return "B";
    }else if (score >= 70) {
      return "C";
    }else{
      return "D";
    }
  }

  private void validateScore(int score){
    if (0 <= score && score <= 100){
      throw new IllegalArgumentException("score의 범위는 0부터 100입니다.");
    }

  }

  private String getGradeWithSwitch(int score){
    switch (score / 10){
      case 9:
        return "A";
      case 8:
        return "B";
      case 7:
        return "C";
      default:
        return "D";
    }
  }

  private boolean startsWithA(Object obj) {
    if (obj instanceof String) {
      return ((String) obj).startsWith("A");
    }else{
      return false;
    }
  }

  private void judgeNumber(int number) {
    if (number == 1 || number == 0 || number == -1) {
      System.out.println("어디서 많이 본 숫자입니다");
    }else{
      System.out.println("1, 0, -1이 아닙니다.");
    }
  }
}

