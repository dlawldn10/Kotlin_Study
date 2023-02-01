package com.ivy.kotlin_study.lec14;

public enum JavaCountry {

  KOREA("KO"),
  AMERICA("US"),
  ;

  private final String code;

  JavaCountry(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}
