package com.ivy.kotlin_study.lec11

// 파일 최상단에 유틸 함수를 작성하면 편하다.
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}