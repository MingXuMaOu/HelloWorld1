package com.example.helloworld

open class Person(open val name:String, open val age: Int) {
    fun eat(){
        println("$name is eating.He is $age years old.")
    }
}