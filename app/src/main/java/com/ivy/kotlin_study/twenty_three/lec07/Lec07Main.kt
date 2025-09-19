package com.ivy.kotlin_study.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

// Lec07 코틀린에서 예외를 다루는 방법
// 1. try catch finally 구문
// 2. Checked Exception 과 Unchecked Exception
// 3. try with resources

fun main(){
    readFile()
}


// 1. try catch finally 구문
// 주어진 문자열을 정수로 변경하는 예제
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: java.lang.NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

// 주어진 문자열을 정수로 변경하는 예제.
// 실패시 null 반환
fun parseIntOrThrowV2(str: String): Int? {
    // try구문도 expression인 것을 알 수 있다.
    return try {
        str.toInt()
    } catch (e: java.lang.NumberFormatException){
        null
    }
}

// 2. Checked Exception 과 Unchecked Exception
// 프로젝트 내 파일의 내용물을 읽어오는 예제
// 코틀린에서는 Checked Exception(throw 해줘야하는 exception) 과 Unchecked Exception을 구분하지 않고
// 모두 Unchecked Exception으로 간주한다.
// 따라서 throw를 안붙여주어도 에러가 나지 않는다.
// 이부분이 코딩할 때 편함.
fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// 3. try with resources - 자바에서는 JDK7에서 추가됨
// 추후 더 자세한 공부할 예정
// 지금은 코틀린에서는 try with resources가 없고 use를 사용한다 정도만 알아두기
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}

// 정리:
// try-catch 구문은 문법적으로 완전히 동일하다.
// 코틀린에서는 try-catch가 expression이다.
// 코틀린에서 모든 예외는 Unchecked Exception이다.
// 코틀린에서는 try with resources 구문이 없다.
// 대신 코틀린의 언어적 특징을 사용해 close를 호출한다.

