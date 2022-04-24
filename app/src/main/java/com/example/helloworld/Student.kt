package com.example.helloworld

class Student(name: String,age: Int): Person(name,age),Study {
    override fun readBook() {
        println("$name is reading.")
    }

    override fun doHomework() {
        println("$name is doing homework")
    }
//    init {
//        println("sno is $sno,grade is $grade")
//    }
//
//    constructor(name:String,age: Int):this("",0,name,age){
//
//    }
//    constructor(): this("",0)
//
//    fun learn(s: String){
//        sno = s
//        println("sno is $sno")
//    }
}

//open class Student : Person{
//    constructor(name: String,age: Int): super(name,age)
//}