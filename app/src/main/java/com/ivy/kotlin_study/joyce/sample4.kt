package com.ivy.kotlin_study.joyce


//클래스와 다른 점 -> 다른 클래스 객체와 달리 딱 한번만 만들어짐. = Singleton Pattern
//불필요하게 메모리가 사용되는 것을 막을 수 있음.
object CarFactory{
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int): Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower: Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}