package com.ivy.kotlin_study.ds

// 배열을 이용하여 스택 구현하기
class MyArrayStack(val maxStackSize: Int = 5) {

    var data = Array(maxStackSize){ 0 }
    var top: Int = -1


    /* 스택이 비었는지 확인 */
    fun isEmpty(): Boolean{
        return top == -1
    }

    /* 스택이 꽉찼는지 확인 */
    fun isFull(): Boolean{
        return top == maxStackSize-1
    }

    /* 스택에 원소 추가하기 */
    fun push(e: Int){
        if (isFull()){
            error("stack overflow")
        }else{
            top += 1
            data[top] = e
        }

    }

    /* 맨 위 원소 제거하기 */
    fun pop(): Int{
        if (isEmpty()){
            error("empty stack")
        }else{
            top -= 1
            return data[top+1]
        }
    }

    /* 스택의 모든 원소 출력하기 */
    fun display() {
        println("stack element count: ${top+1}")
        var str = "[ "
        for (i in (0..top)){
            str += "${data[i]} "
        }
        str += "]"
        println(str)
    }

}

fun main(){
    var myArrayStack = MyArrayStack()
    myArrayStack.push(1)
    myArrayStack.push(4)
    myArrayStack.push(8)
    myArrayStack.push(7)
    myArrayStack.push(5)
    myArrayStack.display()
    println(myArrayStack.pop())
    myArrayStack.display()
    println(myArrayStack.pop())
    myArrayStack.display()
    println(myArrayStack.pop())
    myArrayStack.display()
    println(myArrayStack.pop())
    myArrayStack.display()
    println(myArrayStack.pop())
    myArrayStack.display()
}






























