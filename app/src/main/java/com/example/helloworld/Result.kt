package com.example.helloworld

import java.lang.Exception
import java.lang.IllegalArgumentException

sealed class Result

class Success(val msg: String): Result()
class Failure(val error: Exception): Result()
class UnKnow(val rrr: String): Result()

fun getResultMsg(result: Result) = when(result){
    is Success -> result.msg
    is Failure -> result.error.message
    is UnKnow -> result.rrr
}