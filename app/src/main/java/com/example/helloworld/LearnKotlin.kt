package com.example.helloworld

import android.widget.Adapter
import java.lang.StringBuilder
import java.util.*
import kotlin.math.max


var study: Study? = null

private lateinit var adapter:Adapter
fun main(){

    ::adapter.isInitialized
//    val a = 10
//    var a = 10
//    a *= 10
//    val value = largeNumber(37,40)
//    println("a = $value")

//    println(getScore("Tom"))
//    checkNum(10f)
//    getScore("1Tom2222")
//
//    for (i in 1 downTo 10){
//        println(i)
//    }
//    val p = Person()
//    p.name = "Jack"
//    p.age = 29
//    p.eat()
//    val s = Student("sdf",5,"Jack",29)
//    s.learn("TT")

//    val student = Student("Tom",22)
//    learn(student)

//    Singleton.c = Cellphone("eet",45.9)

    val list = listOf("Apple","Banana","Orange","Pear","Grape")
//    val result = with(StringBuilder()){
//        append("start with ")
//        for (fruit in list) {
//            append("$fruit,")
//        }
//        toString()
//    }
//    println(result)
//    val rsult = StringBuffer().run {
//        append("Fruit is ")
//        for (fruit in list) {
//            append("$fruit ")
//        }
//        toString()
//    }
//    println(rsult)
//    val result = StringBuilder().apply {
//        append("Fruit is ")
//        for (s in list) {
//            append("$s ")
//        }
//    }
//    println(result.toString())
    doSomethin()
//    val list = mutableListOf("Apple","Banana","Orange","Pear","Grape")
//    list.add("Watermelon")
//    for (fruit in list) {
//        println(fruit)
//    }
//    val map = mapOf("Apple" to "One","Banana" to "Two","Orange" to "Three")
//    for ((fruit, number) in map) {
//        println(fruit + "  " + number)
//    }
//
//    val max = list.maxByOrNull { it.length }
//    println(max)

//    list.filter { it.length <= 5 }.map { it.uppercase(Locale.getDefault()) }.forEach { println(it) }
//    val any = list.any { it.length <= 5 }
//    val all = list.all { it.length <= 5 }
//
//    println("$any   $all")
//    learn(null)

}

fun dofun(){
//    study?.doHomework()
    study?.let {
        it.doHomework()
        it.readBook()
    }
}


//fun learn(study: Study?){
//    println(study?.readBook())
//    study?.readBook()
//    study?.doHomework()
//}
fun learn(study: Study?){
    study?.let {
        it.readBook()
        it.doHomework()
    }
}

//fun largeNumber(num1: Int,num2: Int): Int{
//    return max(num1,num2)
//}
//fun largeNumber(num1: Int,num2: Int) = max(num1,num2)

fun largeNumber(num1: Int,num2: Int) = if(num1 > num2) num1 else num2

//fun getScore(name: String) = when(name){
//    "Tom" -> 86
//    "Jim" -> 77
//    "Jack" -> 95
//    "Lily" -> 100
//    else -> 0
//}

fun getScore(name: String) = when{
    name.startsWith("Tom") -> println("score 95")
    name == "Jim" -> println("Score 88")
    else -> println("0")
}

fun checkNum(num: Number) = when(num){
    is Int -> println("It is Int")
    is Double -> println("It is Double")
    else -> println("Not number")
}

