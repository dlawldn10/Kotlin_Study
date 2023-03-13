package com.ivy.kotlin_study;

public class JavaPrac {

    // 나머지가 1이 되는 수 찾기
    public int solution(int n) {
        int x = 2;
        while(n % x != 1){
            x++;
        }
        return x;
    }
}
