package com.ivy.kotlin_study.lec10.Java;

public class JavaCat extends JavaAnimal {

  public JavaCat(String species) {
    super(species, 4);
  }

  @Override
  public void move() {
    System.out.println("고양이가 사뿐 사뿐 걸어가~");
  }

}
