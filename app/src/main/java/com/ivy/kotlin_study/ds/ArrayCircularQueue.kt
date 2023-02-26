package com.ivy.kotlin_study.ds

// 배열로 원형 큐 구현하기
// 0번 인덱스는 비워놓을 것이므로 maxQueueSize를 (최대로 넣고싶은 원소의 개수)+1 하여 설정한다.
// ex) 최대 5개의 원소를 넣고 싶으므로 maxQueueSize를 5+1=6으로 설정.
class ArrayCircularQueue(mqs: Int = 5) {
    var front: Int = 0
    var rear: Int = 0
    var maxQueueSize: Int = mqs + 1
    var data: Array<Int> = Array(maxQueueSize){ 0 }


    /* 큐가 비어있는지 판별 */
    fun isEmpty(): Boolean{
        return front == rear
    }

    /* 큐가 꽉 차있는지 판별 */
    fun isFull(): Boolean {
        return (rear + 1) % maxQueueSize == front
    }

    /* 큐의 맨 뒤에 value를 추가 */
    fun enqueue(value: Int){
        if (isFull()){
            println("queue is full")
        }else{
            rear = (rear + 1) % maxQueueSize
            data[rear] = value
        }
    }

    /* 큐의 맨 앞 요소를 제거하여 반환 */
    fun dequeue(): Int{
        if (isEmpty()){
            error("queue is empty")
        }else{
            front = (front + 1) % maxQueueSize
            return data[front]
        }
    }

    /* 큐의 맨 앞 요소를 제거하지 않고 반환 */
    fun peek(): Int{
        if (isEmpty()) error("queue is empty")
        else return data[(front + 1) % maxQueueSize]
    }

    /* 큐의 모든 원소 출력 */
    fun display(){
        val maxIdx = if(front < rear) rear else rear + maxQueueSize
        var str = "[ "
        if (!isEmpty()){
            for (i in (front + 1..maxIdx)){
                str += "${data[i]} "
            }
        }
        str += "]"
        println(str)
    }
}

fun main(){
    var arrayCircularQueue = ArrayCircularQueue()
    arrayCircularQueue.enqueue(1)
    arrayCircularQueue.enqueue(2)
    arrayCircularQueue.enqueue(3)
    arrayCircularQueue.enqueue(8)
    arrayCircularQueue.enqueue(4)
    arrayCircularQueue.display()
    println(arrayCircularQueue.peek())
    arrayCircularQueue.display()
    println(arrayCircularQueue.dequeue())
    arrayCircularQueue.display()
    println(arrayCircularQueue.dequeue())
    arrayCircularQueue.display()
    println(arrayCircularQueue.dequeue())
    arrayCircularQueue.display()
    println(arrayCircularQueue.dequeue())
    arrayCircularQueue.display()
    println(arrayCircularQueue.dequeue())
    arrayCircularQueue.display()

}