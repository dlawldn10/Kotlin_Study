package com.ivy.kotlin_study.lec13;

public class JavaHouse {

  private String address;
  private LivingRoom livingRoom;

  public JavaHouse(String address) {
    this.address = address;
    this.livingRoom = new LivingRoom(10);
  }

  public LivingRoom getLivingRoom() {
    return livingRoom;
  }

  // Static을 사용하는 중첩 클래스
  public static class LivingRoom {
    private double area;

    public LivingRoom(double area) {
      this.area = area;
    }

    // 바깥 클래스와 연결되어 있지 않다.
    // static 클래스가 되면 직접 참조할 수 없기 때문에 에러.
//    public String getAddress() {
//      return JavaHouse.this.address;
//    }
  }

  // 내부 클래스
  public class LivingRoom2 {
    private double area;

    public LivingRoom2(double area) {
      this.area = area;
    }

    // 바깥 클래스와 연결되어 있다.
    public String getAddress() {
      return JavaHouse.this.address;
    }
  }

}